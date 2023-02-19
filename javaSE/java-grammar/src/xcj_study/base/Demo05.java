package xcj_study.base;

public class Demo05 {
    //main方法
    //属性:变量
    /*实例变量，方法的外面，类的里面。从属于对象,如果不初始化，这个类型默值 0 0.0 u0000
    布尔值默认为false，
    除了基本类型，默认值都为null

    */
    //类变量 加static
    static  double salary  = 2500;
    //修饰符，不存在先后顺序
    public static final double PI = 3.14;
    String name;
    int age;
    public static void main(String[] args) {
        //局部变量，在一个方法里面存在，使用前必须声明和初始化
        int c = 10;
        //int a,b,c;
        int a = 1;//程序可读性
        String name = "xcj_study";
        char x = 's';
        double pi = 3.14;
        //变量类型  变量名 = new xcj_study.base.Demo05
        Demo05 demo05 = new Demo05();
        System.out.println(demo05.age);

        //类变量 加static
        System.out.println(salary);
        System.out.println(PI);


    }
    //其他方法
    public  void add()
    {

    }
}
