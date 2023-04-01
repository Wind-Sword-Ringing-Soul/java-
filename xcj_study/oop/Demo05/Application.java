package xcj_study.oop.Demo05;

import xcj_study.oop.Demo01.student;
import xcj_study.oop.Demo03.Pet;
import xcj_study.oop.Demo05.A;
import xcj_study.oop.Demo05.B;
//一个项目一个只存在一个main方法
public class Application {

    public static void main(String[] args) {
//        Student student = new Student();

//        student.test1();
        //静态方法和非静态方法区别很大
        //静态方法：方法的调用只和左边的类型有关，定义的数据类型有关
        //非静态：重写

          A a= new A();//A
          a.test();
        //父类引用指向子类
        B b= new A();//子类重写了父类的方法 非静态方法时 不加static
        b.test();//B

    }
}




