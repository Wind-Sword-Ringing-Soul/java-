package xcj_study.FlowControl;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //常用场景
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入数据");

        String str1 = scanner1.nextLine();
        System.out.println("输入的内容："+str1);

        scanner1.close();
    }
}
