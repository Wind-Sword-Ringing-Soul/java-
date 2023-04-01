package xcj_study.oop.Demo01;
//值传递
public class Demo03 {
    public static void main(String[] args) {

        int a=1;
        System.out.println(a);
        Demo03.change(a);
        System.out.println(a);
    }

    public static void change(int a){
        a=10;
    }
}
