package xcj_study.oop.Demo05;
//父类
//
public class Person {
    // public protected default private 优先级从左到右
    protected String name = "xcj";

    public void print(){
        System.out.println("person");
    }

    public Person() {
        System.out.println("person无参执行");
    }
}
/*
 public int money = 100;
 public void say(){
        System.out.println("说了一句话");
    }
    application里面的
     Student student = new Student();
        student.say();
        System.out.println(student.money);
 */