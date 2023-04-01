package xcj_study.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数扩展     进制       二进制0b     十进制     八进制     十六进制0x
        int i = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制0-9，A-F
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //浮点数拓展  银行业务，钱
        //BigDecimal 数学工具类
        //float  有限 离散，舍入误差 大约接近不等于
        //最好完全避免浮点数进行比较
        //double  无线

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);
        float d1 = 12938383391f;
        float d2 = d1+1;
        System.out.println(d1==d2);//true



        //字符拓展
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);
        //字符本质是数字
        //编码 Unicode 2字节 0-65536  excel 0-65536
        char c3  = '\u0061';
        System.out.println(c3);//表示a

        //转义字符
        //\t  //制表符
        //\n 换行

        System.out.println("hello,\t world");


        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);//不相等

        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sc==sd);//相等

        //内存分析

        //布尔值扩展
        boolean flag = true;
        if (flag==true)//新手
            //if(flag)//老手
        {

        }


    }
}
