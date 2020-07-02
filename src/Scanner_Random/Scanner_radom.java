package Scanner_Random;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Scanner_radom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number =scanner.nextInt();
//      T通过scanner获取输入的一个数字，这里nextInt（）是获取数组 next（）是获取字符串

        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i <Number ; i++) {
            int num = r.nextInt(33)+1;
//            随机获取1到33的数字，里面的系数代表获取0到32
            list.add(num);

            for (int i1 = 0; i < list.size(); i1++) {
                System.out.println(list.get(i));

            }

        }
    }
}
