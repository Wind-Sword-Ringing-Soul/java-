package xcj_study.oop.Demo02;

public class Person {
    //一个类什么的不写，它也会存在一个方法
    //显示的定义构造器
    String name;
    //实例化初始值
    //1使用new关键词，必须要有构造器，本质在调用构造器
    //2初始化值
    // alt+ins 自动生成构造器。无参

    public Person(){
        this.name = "xcj";
    }

    //有参构造  一旦定义了有参构造，无参必须显示定义
    public Person(String name){
        this.name= name;
    }

}
/*
 public static void main(String[] args) {
        //new 实例化一个对象
        Person person = new Person();

        System.out.println(person.name);

    }
}
        构造器
            1.与类名相同
            2.没有返回值
        作用：
            1.new 本质在调用构造方法
            2初始化对象的值
        注意：
            1.定义有参构造之后。如果想使用无参构造，显示定义一个无参的构造
            快捷键：alt+ins
 */


