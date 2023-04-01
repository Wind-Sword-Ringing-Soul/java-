package xcj_study.oop.Demo07;

public class Application {
    public static void main(String[] args) {
        //类型之间的转换 父    子
        //高                   低
        Person obj = new Student();
        //将这个Person类型的student转化成Student类型，就可以使用student的方法了
//       类型转换
//       1 Student obj1 = (Student) obj;
//        obj1.go();
//        2
        ((Student) obj).go();


        //子类转换成父类可能会丢失一些方法 子转换成父类是自动转换
        Student student = new Student();
        student.go();
        Person person = student;

    }
}
