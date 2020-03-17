package iocTest;

public class IocTest {
    public static void main(String[] args) {
        //创建工厂对象
        BeanFactory beanFactory = new BeanFactory();
        //通过工厂直接拿到Student对象，不用去 new Student();
        Student bean = (Student) beanFactory.getBean("student");
        //测试
        bean.setAge("20");
        System.out.println(bean.getAge());
    }
}