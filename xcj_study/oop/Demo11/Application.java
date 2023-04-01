package xcj_study.oop.Demo11;

public class Application {
    public static void main(String[] args) {

        //外部类使用new关键词实例化
        Outer outer = new Outer();

        //内部类通过外部类来实现实例化
        Outer.Inner inner = outer.new Inner();
        inner.getId();
    }
}
