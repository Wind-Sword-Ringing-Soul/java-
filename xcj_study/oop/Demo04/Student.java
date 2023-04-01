package xcj_study.oop.Demo04;


//private 属性私有
//get/set 提供一些可以操作私有属性的方法，提供一些public的get,set方法
public class Student {
    private String name;
    private int id;
    private char sex;

    //get获取这个数据
    public String getName(){
        return this.name;
    }

    //set 给这个数据设置值
    public void setName(String name){
        this.name= name;
    }

    //alt+ins

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/*
Student s1 = new Student();

        s1.setName("xcj");
        System.out.println(s1.getName());
 */
