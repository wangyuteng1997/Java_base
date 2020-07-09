package String;

import java.util.Arrays;

/**
 * @author wang yuteng
 * @data 2020/7/9 15:14
 */
//将字符串 倒序打印
//   sort方法只能对数组，所以要先将字符串转为数组，String.tocharArray（）方法
//
public class Practice1 {
    public static void main(String[] args) {
        String str = "34fqefqfqwfgh";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
//            chars.fori 正序
//            chars.forr 倒叙
        }

    }
}
