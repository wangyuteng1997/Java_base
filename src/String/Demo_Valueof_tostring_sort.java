package String;
import java.util.Arrays;
/**
 * @author wang yuteng
 * @data 2020/7/7 15:19
 */
public class Demo_Valueof_tostring_sort {
    public static void main(String[] args) {

//      接入了这里是接入Arrays（数组）的接口（对象） 包含int[]char[]String[]等数组

//    1.对于toString的方法 一般是对象.toString（）
//      在这里将数组传为对象 Arrays（Arrays在这里就是对象）.toString（数组名）
//    2.先将int a或者String a 转为对象A，然后再A.toString 也是可以使用toString的方法的

        int a = 1;
        char b = 'a';
        double c = 2.2;
        int[] ints = new int[]{1,2,3,4};
        char[] chars = new  char[]{'a','b','c'};

//这里是通过String.valueOf（）转为字符串
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
//        String s2 = String.valueOf(chars);
//        String s3 = String.valueOf(ints);
// 如果这里使用String.valueof对数组进行转变，返回的都是@加上地址的哈希值


        // 对于普通形式的变量使用toString方法，但是只能够对对象进行操作

        Integer A = a;
        String s4 = A.toString();
//对于 Arrays 各种类型的数组可以通过Arrays.toString（）的方法
        System.out.println(Arrays.toString(ints));


//        sort的方法
//        1.如果是数字，按照数字的升序从小到大
//        2.如果是字母，按照字母的顺序进行升序
       int[] ints1 = new  int[]{3,1,6,12,5};
        Arrays.sort(ints1);
//        .sort没有返回值，但是已经将输入的ints排序并且改变了ints1了
        System.out.println(Arrays.toString(ints1));
    }
}
