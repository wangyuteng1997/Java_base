package String;

/**
 * @author wang yuteng
 * @data 2020/7/7 14:10
 */
/*
* public String[] split(String regex)
*分割字符串的方法:按照字符串分割字符串
*注意：但是这里不能够按照split（“ . ”）来分割字符串，因为这里是正则表达式，如果要用点号来分割，那么要用//.
*
* */
public class Demo_Stringsplite {

    public static void main(String[] args) {
           String str1 = "aaa,bbb,ccc,ddd";
           String[] split = str1.split(",");

            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
            String str2 = "aaa bbb ccc ddd";
            String[] split1 = str1.split(" ");

            for (int j = 0; j < split1.length; j++) {
                System.out.println(split1[j]);

        }
    }

}
