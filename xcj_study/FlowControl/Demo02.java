package xcj_study.FlowControl;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("使用nextLine接收");

        if (scanner1.hasNextLine()){
            String str1 = scanner1.nextLine();
            System.out.println("输入的内容："+str1);
        }
        scanner1.close();
    }
}
