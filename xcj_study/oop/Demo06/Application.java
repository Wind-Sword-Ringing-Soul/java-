package xcj_study.oop.Demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student
        //new Person

        //可以指向的引用类型就不确定了
        //student能调用的方法是自己的或者是继承的方法
        Student s1 = new Student();
        //父类的引用指向子类

        //Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();
        //对象能执行哪些方法，主要看对象的左边类型和右边关系不大
        s2.run();//子类重写了父类的方法，执行父类方法
        s1.run();

//        s1.eat();

    }
}
