package String;

/**
 * @author wang yuteng
 * @data 2020/7/7 15:19
 */
public class Demo_Valueof {
    public static void main(String[] args) {
        int a = 1;
        char b = 'a';
        double c = 2.2;

// 使用toString方法，但是只能够对对象进行操作
        Integer A = a;
        String s2 = A.toString();


        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
    }
}
