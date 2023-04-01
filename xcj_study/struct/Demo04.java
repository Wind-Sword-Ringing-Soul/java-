package xcj_study.struct;

public class Demo04 {
    public static void main(String[] args) {
        char grade = 'C';
        //case穿透   当case在匹配到相应的值时会把下面没有带break的case里面内容也执行
        // switch是匹配具体值
        //反编译 java --class（字节码文件）--反编译（idea）
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'b':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知");
        }
    }
}
