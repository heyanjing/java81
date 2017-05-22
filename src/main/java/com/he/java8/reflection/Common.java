package com.he.java8.reflection;

import java.lang.reflect.*;

/**
 * Created by heyanjing on 2017/5/15 17:40.
 */
public class Common {
    public static void main(String[] args) {
        Class<?> clazz = RefBean.class;
        //字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            int fModifiers = f.getModifiers();//字段权限
            Class<?> fType = f.getType();//字段类型
            String fName = f.getName();//字段名称
            System.out.println(String.format("字段为：%s %s %s", Modifier.toString(fModifiers),fType.getSimpleName(),fName));
        }





        //方法
        Method[] methods = clazz.getDeclaredMethods();
        StringBuilder msb=new StringBuilder();
        for (Method m:methods) {
            int mf = m.getModifiers();//方法权限
            msb.append(Modifier.toString(mf)+" ");
            Class<?> type = m.getReturnType();//返回值类型
            msb.append(type.getSimpleName()+" ");
            String mName = m.getName();//方法名
            msb.append(mName+" ");
            Class<?>[] tv = m.getParameterTypes();//参数类型
                msb.append("( ");
            for (Class<?> c: tv) {
                String cName = c.getSimpleName();
                msb.append( cName+" ");
            }
                msb.append(" ) \n");
        }
        System.out.println(msb.toString());


        //构造函数
        StringBuilder csb=new StringBuilder();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> c:constructors) {
            int modifiers = c.getModifiers();
            csb.append(Modifier.toString(modifiers)+" ");
            String name = c.getName();
            csb.append(name+" ");
            Class<?>[] parameterTypes = c.getParameterTypes();
            csb.append("( ");
            for (Class<?> cl: parameterTypes) {
                String simpleName = cl.getSimpleName();
                csb.append( simpleName+" ");
            }
            csb.append(" ) \n");
        }
        System.out.println(csb.toString());







    }
}
