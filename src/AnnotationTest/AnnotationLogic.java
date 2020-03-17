package AnnotationTest;
import java.lang.reflect.Method;

public class AnnotationLogic {
	public static void annotationLogic() {
   	 
        Class useAnnotationClass = UseAnnotation.class;
        for(Method method : useAnnotationClass.getMethods()) {
            SimpleAnnotation simpleAnnotation = (SimpleAnnotation)method.getAnnotation(SimpleAnnotation.class);
            if(simpleAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" value : " + simpleAnnotation.value());
                System.out.println(" --------------------------- ");
            }
        }
	}
}
