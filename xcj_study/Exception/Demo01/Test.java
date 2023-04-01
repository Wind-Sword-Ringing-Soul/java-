package xcj_study.Exception.Demo01;

public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        //监控区域,捕获多个异常，从小到大
        try {
            if(b==0){//主动抛出异常 throw  throws
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        }catch (ArithmeticException e){//捕获异常类型，最高Throwable
            System.out.println("异常");
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable e){
            System.out.println("Throwable");
        }

        finally {//处理善后工作 finally可以不需要 IO,资源在这个里面关闭
            System.out.println("finally");
        }
    }
    //如果方法处理不了异常，方法上抛出异常
    public void test(int a,int b){
        if(b==0){//主动抛出异常 throw  throws  一般在方法中使用
            throw new ArithmeticException();
        }
    }
}
