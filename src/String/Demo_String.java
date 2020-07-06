package String;

import org.w3c.dom.ls.LSOutput;

/*三种构造方法
* public String（）：创建一个空白字符串，不含有任何内容
* public String（char[] array）：根据字符数组的内容，来创建对应的字符串
* public String（byte[] array）：根据字节数组的内容，来创建对应的字符串
*
* 直接创建 String  str3 = " weqw "
* 注意：直接写上双引号，就是字符串的对象。
* */
public class Demo_String {


    public static void main(String[] args) {
        String str1 = new String("abc");
        System.out.println("第一个字符串：" + str1);

        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        byte[] byteArray = {97 , 98 , 99};
        String str3 = new String(byteArray);
        System.out.println("第二个字符串：" + str3);
    }

}
