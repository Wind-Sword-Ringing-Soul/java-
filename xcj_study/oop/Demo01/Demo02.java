package xcj_study.oop.Demo01;

public class Demo02 {
    public static void main(String[] args) {
        /*
        方法调用
        静态  static
        非静态 不加static
         */
        // 静态方法：修饰符有static可以用 类名.方法名 来调用
        student.say();
        //非静态方法：实例化这个类 new
        //对象类型 对象名 = 对象值
        student student = new student();
        student.say();

    }

    //static和类一起加载的
    public void a(){

    }
    //类实例化之后才存在
    public void b(){}
}
