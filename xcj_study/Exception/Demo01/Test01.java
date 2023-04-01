package xcj_study.Exception.Demo01;

public class Test01 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        //异常快捷键 CTRL+alt+t
        try {



            System.out.println(a/b);



        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
