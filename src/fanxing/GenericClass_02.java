package fanxing;

public class GenericClass_02 {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        Demo02Generic_class gc = new Demo02Generic_class();
        gc.setName("字符串");
        Object obj = gc.getName();
        //这里每次用泛型之后，取回数据都要重新定义一下类型


        //创建Demo02Generic_class对象，泛型使用Interger类型
        Demo02Generic_class<Integer> gc2 = new Demo02Generic_class<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);
    }
}
