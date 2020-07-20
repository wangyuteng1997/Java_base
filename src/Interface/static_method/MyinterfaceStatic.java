package Interface.static_method;

/**
 * wangyuteng create
 * 20/07/2020 22:31
 */
public interface MyinterfaceStatic {

    public static void methodDefautA(){
        System.out.println("默认方法A");
        methodcommun();
    }

    public static void methodDefautB(){
        System.out.println("默认方法B");
        methodcommun();
    }
    /*
        public default void methodcommun(){
            System.out.println("AAA");
            System.out.println("AAA");
            System.out.println("AAA");
        }*/
//因为defaut是后面的  实现类 都能继承该方法（直接用）methodcommun   对象.methodcommun在psvm中实现
    private static void methodcommun(){
        System.out.println("AAA");
        System.out.println("AAA");
        System.out.println("AAA");
    }
}
