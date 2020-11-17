package String;

/**
 * @author wang yuteng
 * @data 2020/7/6 18:24
 */
public class Demo_stringconvert {
    public static void main(String[] args) {

        String str1 = new String("abc");
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);

        byte[] byteArray = {97 , 98 , 99};
        String str3 = new String(byteArray);

//        转换成字符数组
        char[] chars = "Helloworld".toCharArray();
        System.out.println(chars.length);
        System.out.println(chars[0]);

//        转换成字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
//        字符串的中的字符的替换
        String str4 = "How do you do?";
        str4.replace("how","?");
//        字符串中的小字符串的替换
        String replace = str4.replace('o', '*');
        System.out.println(replace);


    }
}
