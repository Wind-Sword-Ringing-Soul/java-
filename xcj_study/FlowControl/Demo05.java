package xcj_study.FlowControl;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘接受数据
        int i = 0 ;
        float f = 0.0f;

        System.out.println("请输入数据");
        if (scanner.hasNextInt())
        {
            i = scanner.nextInt();
            System.out.println("输入的是整数"+i);
        }
        else
        {
            System.out.println("输入的不是整数");
        }

        System.out.println("请输入小数");
        if (scanner.hasNextFloat())
        {
            f = scanner.nextFloat();
            System.out.println("输入的是小数"+f);
        }
        else
        {
            System.out.println("输入的不是小数");
        }

        scanner.close();
    }
}
