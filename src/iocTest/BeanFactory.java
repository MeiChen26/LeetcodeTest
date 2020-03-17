package iocTest;

import java.util.Map;

public class BeanFactory {
    //定义的Map<类名，对象>的容器
    private Map<String, Object> map;
    //无参构造器传的是bean.xml文件的路径
    public BeanFactory() {
        this("src/bean.xml");
    }
    //这个构造器调用方法解析xml文件，返回值就是  类名-对象 的关系
    public BeanFactory(String path) {
        try {
            map = ParserHelper.parseXml(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //根据类名获取对象的方法
    public Object getBean(String beanName) {
        return map.get(beanName);
    }
}