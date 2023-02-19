package xcj_study.FlowControl;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象从键盘接受数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next接收");

        //判断用户有没有输入
        if (scanner.hasNext()){
            //使用next方法接受
            String str = scanner.next();
            System.out.println("输入的内容为"+str);

        }
        //关于IO流的类用完就关闭，
        scanner.close();





    }
}
