package xcj_study.oop.Demo02;

public class Student {
    //属性
    String name;//null
    int age;//0


    //方法
    public void study(){

        System.out.println(this.name+"学生在学习");
    }
}
/*
   public static void main(String[] args) {
        //类：类是抽象的，要实例化
        //类实例化之后会返回一个自己的对象
        //studen对象就是Student类的一个具体实例
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        xiaoming.name="小明";
        xiaohong.name="小红";
        xiaoming.age=20;
        xiaohong.age=21;
        System.out.println(xiaoming.name);
        System.out.println(xiaohong.name);
        System.out.println(xiaoming.age);
        System.out.println(xiaohong.age);
    }
 */