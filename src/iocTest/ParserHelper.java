package iocTest;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

@SuppressWarnings("unchecked")
public class ParserHelper {
    public static Map<String, Object> parseXml(String path) throws Exception {
        Map<String, Object> map = new HashMap<>();
        // 创建saxReader对象  
        SAXReader saxReader = new SAXReader();
        //通过read方法读取一个文件 转换成Document对象  
        Document document = saxReader.read(new File(path));
        //获取根节点元素对象
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for(Element e:elements){
            
            String beanName = e.attributeValue("name");
            String className = e.attributeValue("class");
            
            Object o = Class.forName(className).newInstance();
            
            map.put(beanName,o);
            List<Element> elements2 = e.elements();
            for(Element e2:elements2){
                //<property name="student" ref="stu"></property>
                String propertyName = e2.attributeValue("name"); 
                String refName = e2.attributeValue("ref");
                
                //调用当前类中的一个私有方法 通过参数student获得其对应的set方法名:setStudent
                String methodName = getMethodName(propertyName);
                //通过对象名字stu从map中获得其对应的对象
                Object obj = map.get(refName);
                //获得setStudent方法镜像
                Method method = o.getClass().getMethod(methodName, new Class[]{obj.getClass()});
                //反射调用该方法 相当于 t.setStudent(stu);
                method.invoke(o, obj);
            }
        }
        return map;
    }
    //可以把字符串参数xxx转变为setXxx
    private static String getMethodName(String s) {
        s = s.substring(0,1).toUpperCase() + s.substring(1,s.length());
        return "set"+s;
    }
}