package xcj_study.oop.Demo09;
//abstract 抽象类 类，继承extends  接口可以多继承 插座
public abstract class Action {

    //约束  有人帮我们实现
    //abstract 抽象方法，只有方法名，没有方法的实现
    public abstract void doSome();

    //1 不能new，只能靠子类去实现，约束
    //2.c抽象类可以写普通方法
    //3.抽象方法必须在抽象类里面
    //抽象的抽象，约束  节省开发

}
