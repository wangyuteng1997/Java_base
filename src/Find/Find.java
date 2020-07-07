package Find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wang yuteng
 * @data 2020/7/7 14:52
 */

    public class Find {

        private static final String REGEX = "\\bcat\\b";
        //    这里\\b表示字的边缘 \bcat\b 表示一个独立的cat单词

        private static final String INPUT = "cat cat cat cattie cat";

        public static void main(String[] args) {
//    零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
//    一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
//    零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
            Find F = new Find();
            F.test2();

        }


        public void test1() {
            System.out.println("34523452root".matches("^[0-9]+"));
            System.out.println("34523452root".matches("^[0-9]+.*"));

            System.out.println(Pattern.matches("^[0-9]+", "34523452root"));
            System.out.println(Pattern.matches("^[0-9]+.*", "34523452root"));
        }


        public void test2() {
            String str = "wqdwd wdwdwiii";
            Pattern p = Pattern.compile("w.*i");
//           这里a.*b 表示匹配以a开始b结束的中间任意长度的字符串  *代表零或者多次

//            Pattern p = Pattern.compile("(^[0-9]+)(.*)");
            //得到匹配器 匹配两个部分 第一个部分是0-9的一串数字 第二个是多个除了/n/r的字符
            Matcher m = p.matcher(str);
            boolean bFound = m.find();

            if (bFound) {
//            这里也可以是if(m.find)是继续查找下一项
                System.out.println("group count:" + m.groupCount());

                for (int i = 1; i <= m.groupCount(); i++) {
                    System.out.println(i + ":" + m.group(i));
                }
            }
        }

        public void test3() {
            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(INPUT);
            // 获取 matcher 对象
            int count = 0;

            while(m.find()) {
                count++;
                System.out.println("Match number "+count);
                System.out.println("start(): "+m.start());
                System.out.println("end(): "+m.end());
            }
        }

    }


