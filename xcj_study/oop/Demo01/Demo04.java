package xcj_study.oop.Demo01;
//引用传递 本质还是值传递
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Demo04.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        person.name="夏从杰";
    }
}
class Person{
    String name;
}