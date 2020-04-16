package task_4;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public Object createObject(Class klass){
        Object object = null;
        try {
            object = klass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void printMethod(Class klass){
        Method[] methods = klass.getDeclaredMethods();
        System.out.println("Methods of class " + klass.toString());
        for(int i = 0; i < methods.length; i++){
            System.out.println("type of returned object - " + methods[i].getReturnType().getName());
            System.out.println("name - " + methods[i].getName());
            System.out.println();
        }
        System.out.println("*******************************************************************");
        System.out.println();
    }

    public void printFields(Class klass){
        Field[] fields = klass.getDeclaredFields();
        System.out.println("Fields of class " + klass.toString());
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getType().getName() + " " + fields[i].getName());
        }
        System.out.println("*******************************************************************");
    }

    public void setField(Class klass, Object obj, String nameOfField, Object val){
        try {
            klass = klass.getSuperclass(); //Спросить
            Field field = klass.getDeclaredField(nameOfField);
            field.setAccessible(true);
            field.set(obj, val);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
