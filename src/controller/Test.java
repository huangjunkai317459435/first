package controller;

import org.apache.commons.lang3.reflect.MethodUtils;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("controller.UserController");

        boolean result = clazz.isAnnotationPresent(Controller.class);
        System.out.println(result);

        Method methods[] = MethodUtils.getMethodsWithAnnotation(clazz,RequestMapping.class);
        System.out.println(methods.length);

        for(Method method : methods){

        }
    }

}
