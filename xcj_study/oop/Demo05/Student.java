package xcj_study.oop.Demo05;
//子类
//子类继承了父类，就会·要有父类的全部方法
//ctrl + h 查看继承关系
//Java中类默认继承object类
public  class Student extends Person {
        private String name = "xc";

    public Student() {
        //隐藏代码，调用父类无参构造

        super();//调用父类构造器，必须要在子类第一行
        System.out.println("student无参执行了");
    }

    public void print(){
        System.out.println("student");
    }
    public void test1(){
        print();//当前类
        this.print();//当前类
        super.print();//父类
    }
    public void test(String name){
            System.out.println(name);//applicaton传递的参数
            System.out.println(this.name);//当前类的参数
            System.out.println(super.name);//父类的参数
        }
}
