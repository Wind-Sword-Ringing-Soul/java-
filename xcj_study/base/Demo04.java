package xcj_study.base;

public class Demo04 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;//内存溢出byte最大值127
        //强制转换  （类型）变量名 从高到低

        double c = i ;
        System.out.println(c);
        //自动转换  从低到高

        System.out.println(i);
        System.out.println(b);

        /*
        注意
        1不能对布尔类型进行转换
        2 不能把对象类型转换成不相干的类型
        3 把大容量转换到低容量的时候，强制转换
        4 转换的时候会出现溢出，或者精度问题
         */
        //精度问题
        System.out.println((int)23.7);
        System.out.println((int)-49.89f);

        char c1 = 'a';
        int d = c1+1;
        System.out.println(d);
        System.out.println((char) d);

        //操作比较大的数注意溢出，数字间可以用下划线分割

        int money = 10_0000_0000;
        int years = 20;
        int total = money* years;
        long total1 = money* years;
        System.out.println(total1);//默认是int,转换之前已经存在问题
        System.out.println(total);//-1474836480, 计算的时候溢出了

        long total2 = money*((long)years);//先把一个数转换成long
        System.out.println(total2);



    }
}
