package xcj_study.FlowControl;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        //输入多个数字求平均数和总和
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m=m+1;
            sum = sum+x;
            
        }
        System.out.println(m+"个数的和为" +sum);
        System.out.println(m+"个数的平均数为" +(sum/m));
        


        scanner.close();


    }
}
