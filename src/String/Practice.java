package String;

/**
 * @author wang yuteng
 * @data 2020/7/7 15:33
 */
/*
* 有[1，2，3]数组，要求输出[world2#world3#world4]
*
* */
public class Practice {
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        System.out.println(Practice.lianjie(array1));
    }

    public static String lianjie(int[] array){
        String string= "[";
        for (int i = 0; i < array.length; i++) {

//            String str = String.valueOf(array[i]);
//            这里也可以用valueof的方法将int转为string类型
            if (i==array.length-1){

                string +="world" + array[i] +"]";
            }else {
                string += "world" + array[i] + "#";
                System.out.println(string);
            }
        }

         return string;
    }
}
