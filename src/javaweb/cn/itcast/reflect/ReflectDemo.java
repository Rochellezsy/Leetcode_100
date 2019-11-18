package javaweb.cn.itcast.reflect;

import javaweb.cn.itcast.domain.Person;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
/*
获取Class对象的方式：
1、Class.forName("全类名")
2、类名.class
3、对象.getclass()
 */
        //1
        Class cls1 = Class.forName("javaweb.cn.itcast.domain.Person");
        System.out.println(cls1);
        //2
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3
        Person p=new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

    }
}
