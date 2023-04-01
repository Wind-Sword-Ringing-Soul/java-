package xcj_study.struct;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
       int[] a= {1,4,2,6,3};
       int[] sort= sort(a);
        System.out.println(Arrays.toString(sort));

    }
    public static int[] sort(int[] array){
        //冒泡排序，两个相邻的元素，如果第一个比第二个大，就交换位置
        // 每一次比较，都会产生应该最大或者最小的元素
        //下一轮可以减少一次排序

        int temp = 0;
        //外层循环
        for (int i = 0; i < array.length-1; i++) {
            //内层循环，比较两个数，如果第一个数比第二个大则交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1]>array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }

        }

        return array;

    }

}
