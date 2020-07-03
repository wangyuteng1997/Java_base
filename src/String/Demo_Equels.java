package String;

/**
 * wangyuteng create
 * 03/07/2020 13:47
 */
/*== 是进行对象的地址值比较，如果确实需要字符串的内容的比较，可以使用两个方法

public boolean equals（Object obj）：参数可以是任何对象
注意事项：
1.任何对象都能够用Object接受
2.equals方法具有对称性，也就是a.equals(b) = b.equals(a)
推荐“abc”.equsl(str)
不推荐str.equsl(“abc”)

public boolean equalsTgnoreEquals（String str）忽略大小写
*
* */
public class Demo_Equels {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("abc"));
        System.out.println(str3.equals("abc"));
        System.out.println("ABC".equals("abc"));

//        equals里的必须是对象 这里equals一个“ abc ”也对，因为这里 “ abc ”也是一个对象

        String strA = "Java";
        String strB = "java";

        System.out.println(strA.equalsIgnoreCase(strB));
//true 因为忽略大小写
        int i=1;
        Integer A = i;
        System.out.println(A.toString());

    }
}
