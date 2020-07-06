package String;

/**
 * @author wang yuteng
 * @data 2020/7/6 18:10
 */
/*
* 字符串的截取
* public String substring(int index) 截图从index到字符串结尾的位置
*public String substring(int begin,int end)截取从begin到end位置的字符串
*[begin.end)
* */
public class Demo_subString {
    public static void main(String[] args) {

        String str1 = "Helloworld";
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(5,9));


        String str2 = "helloworld";
        System.out.println(str2);

//        这里不能String str2 =“ ”这是重新声明不对
        str2 = "Java";
//        str2中保存的是地址值，这里只是将str2的地址值改变了，
//        字符串的内容不可改变
        System.out.println(str2);
    }
}
