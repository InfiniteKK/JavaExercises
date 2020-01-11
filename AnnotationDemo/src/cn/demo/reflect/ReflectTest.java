package cn.demo.reflect;

import cn.demo.annotation.Pro;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.demo.annotation.Master",methodName = "study")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class reflectTestClass = ReflectTest.class;
      /*  public class ProImpl implements Pro{
            @Override
            public String className() {
                return "cn.demo.annotation.Master";
            }
            @Override
            public String methodName() {
                return "study";
            }
        }*/
        Pro an = (Pro) reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

    }
}
