package xcj_study.struct;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入成绩");
        int score = scanner.nextInt();
        if (score<60){
            System.out.println("成绩不及格");
        } else if (score>60&&score<90) {
            System.out.println("成绩良好");
        } else if (score>90&&score<100) {
            System.out.println("成绩优秀");

        }else if (score==100){
            System.out.println("成绩牛逼");
        }else {
            System.out.println("成绩不合法");
        }


        scanner.close();
    }
}
