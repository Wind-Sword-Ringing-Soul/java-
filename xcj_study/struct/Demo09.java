package xcj_study.struct;

public class Demo09 {
    public static void main(String[] args) {
        int i=0;
        int j = 0;
        while (i<100)
        {
            i++;
            System.out.println(i);
            if (i==70){
                break;
            }
        }

        while (j<10){
            j++;
            if(j%2==0){
                System.out.println();
                continue;
            }
            System.out.println(j);
        }
    }
}
