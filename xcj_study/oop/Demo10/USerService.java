package xcj_study.oop.Demo10;

//抽象的思维
//interface 定义关键词 接口都需要实现类
public interface USerService {

    //属性是常量
    int age = 99;

    //接口中所有定义的方法都是抽象的public abstract
    void run();
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
