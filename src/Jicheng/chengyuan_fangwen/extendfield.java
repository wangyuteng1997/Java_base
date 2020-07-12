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

//        zi_override zi = new zi_override();
//        System.out.println(zi.num);
//        System.out.println(zi.num_zi);
//        System.out.println(zi.num_fu);
//
//        System.out.println(zi.num);
////      优先子类的num，没有的话去父类找
//
//
//
//        zi.methodzi();

        zi_override zi = new zi_override();
//        父子类的构造方法中在子类中有一个默认隐含的super（）调用，所以一定是父类构造先调用，后执行子类构造
//public zi () {  super();  .......}


    }
}
