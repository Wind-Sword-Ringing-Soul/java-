package xcj_study.operator;

public class Demo01 {
    public static void main(String[] args) {
        //二元运算符
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

        long a1 = 123123123123L;
        int b1 = 123;
        short c1 = 10;
        byte d1  = 8;
        System.out.println(a1+b1+c1+d1);//long,有long（double）结果就是long(double)类型,无long（double）结果就是int.
        System.out.println(b1+c1+d1);//int
        System.out.println((double) c1+d1);//int

        //关系运算符 返回结果是正确、错误 布尔值表示

        int e = 10;
        int f = 20;
        int g = 31;

        System.out.println(e>f);
        System.out.println(e<f);
        System.out.println(e==f);
        System.out.println(e!=f);
        System.out.println(g%e);//取余，模运算

        //++  --  自增，自减  一元运算符

        int e1 = 3;
        int f1 = e1++;  //执行完折行代码后，先给b赋值，再自增。所以b是3
        //e1++ = a + 1；

        int g1 = ++e1;  //执行完折行代码前，先自增，再给b赋值.

        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);

        //幂运算           很多运算使用工具类运算
        double pow = Math.pow(3, 2);
        System.out.println(pow);


        //逻辑运算符  与（and）或(or)非(取反)
        boolean bo = true;
        boolean bl = false;
        System.out.println("bo && bl:"+(bo&&bl));//逻辑与运算：两个变量都为真，结果才为真
        System.out.println("bo || bl:"+(bo||bl));//逻辑或运算，两个变量有一个为真，结果才为真
        System.out.println("!(bo && bl):"+!(bo&&bl));//如果为假才为真

        //短路运算 逻辑与运算第一个为假即结束判断


        //位运算
        /*
        A = 0011 1100
        B = 0000 1101

        A&B     //同时为1则为1，其余为0 即0000 1100 与
        A|B     //对应位都为0，则为1，即 0011 1101    或
        A^B     //对应位相同为0，不同为1 即 0011 0011  异或
        ~B      //取相反 即 1111 0010   非

         面试：算2*8 = 16 最快
         左移 << 每左移一位乘2
         右移 >> 每右移一位除2


         */
        System.out.println(2<<3);

        //面试：字符串连接符  + ，在加号两边出现String类型的就会进行连接
        System.out.println(""+a+b);
        System.out.println(a+b+"");
        System.out.println("abc"+a+b);
        System.out.println(a+b+"abc");//字符串在加号前面会与后面的拼接，在加号后面会对前面的先进行运算再拼接


        //三元运算符 x?y:z  x结果为真，则为y，否则为z
        int x=80;
        String type = x < 60?"不及格":"及格";
        System.out.println(type);


    }
}
