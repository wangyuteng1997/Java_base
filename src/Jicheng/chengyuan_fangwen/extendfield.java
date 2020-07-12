package Jicheng.chengyuan_fangwen;

/**
 * @author wang yuteng
 * @data 2020/7/9 18:44
 */
public class extendfield {
    public static void main(String[] args) {
        fu fu =new fu();
        System.out.println(fu.num);
        System.out.println(fu.num_fu);

        zi_override zi = new zi_override();
        System.out.println(zi.num);
        System.out.println(zi.num_zi);
        System.out.println(zi.num_fu);

        System.out.println(zi.num);
//      优先子类的num，没有的话去父类找



        zi.methodzi();


    }
}
