package xcj_study.oop.Demo08;
//修饰符有final 则无法被继承
public class Person {
    //静态代码块
    static  {
        System.out.println("静态代码块");//和类一起加载 1 只执行一次
    }
    //匿名代码块
    {
        System.out.println("匿名代码块");//2
    }

    public Person() { //3
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("===================");
        Person person1 = new Person();
    }
}
