package String;

/**
 * @author wang yuteng
 * @data 2020/7/6 16:51
 */
/*
* public int length()
*public String concat(String str)
* public char charAt(int index)
*public int indexOf(String str)
* */
public class Demo_Stringmethod {
    public static void main(String[] args) {
        int length = "wdqwdqwdqw".length();
        System.out.println(length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        char cr = str1.charAt(1);
        System.out.println(cr);

        int num = str1.indexOf("ell");
        System.out.println(num);
    }
}
