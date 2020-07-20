package Static;

/**
 * @author wang yuteng
 * @data 2020/7/7 16:52
 */
/*
* 一旦static修饰成员方法，就成为了静态方法，静态方法不是属于对象，是属于类的
*
* */
public class Need {
    public static void main(String[] args) {
        H();
        Need.H2();
//        对于public static的方法来说来说，在本class中方法直接就是 方法名或者类.方法名 ，，别的class使用该方法是类.方法名
//        对于public private static的方法来说来说，使用改方法直接就是 类.方法名 但是只能在当前的class使用

        Need N = new Need();
        N.H1();
        N.H3();
//        对于pulic 的方法来说 使用需要先创建一个class的对象再引用使用该方法
//        对于private 的方法来说 使用需要先创建一个class的对象再引用使用该方法，但是只能在当前的class下使用
    }

    public static void H(){
        System.out.println("这是一个静态方法");
    }

    private static void H2(){
        System.out.println("这是一个成员方法");
    }

    public void H1(){
        System.out.println("1");
        H();
    }

    private void H3(){
        System.out.println("1");
    }


}
