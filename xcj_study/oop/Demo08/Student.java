package xcj_study.oop.Demo08;

//static
public class Student {
    private static int age;//静态变量
    private double score;//非静态变量

    //非静态方法可以调用静态方法，反之则不行
    public void run(){
        go();
    }

    public static void go(){

    }

    public static void main(String[] args) {
//        Student s1 = new Student();
//
//        System.out.println(Student.age);//类变量 ,静态变量用类名访问
//        System.out.println(s1.age);
//        System.out.println(s1.score);

        Student student = new Student();
        student.run();

        Student.go();
        go();


    }
}
