package xcj_study.struct;

public class Demo06 {
    public static void main(String[] args) {
        //输出1-1000之间能被5整除的数，并且每行输出3个
        for (int i = 0; i < 1000; i++) {
            if (i%5==0){
                //println 输出完会换行
                //print 输出完不会换行
                System.out.print(i+"\t");
            }
            if (i%15==0){//换行
                System.out.println("\n");

            }

        }
    }
}
