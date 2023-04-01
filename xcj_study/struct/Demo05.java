package xcj_study.struct;

public class Demo05 {
    public static void main(String[] args) {
        //0-100间奇数偶数的和
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                oddsum+=i;

            }else {
                evensum+=i;
            }

        }
        System.out.println("奇数和："+oddsum);
        System.out.println("偶数和："+evensum);
    }
}
