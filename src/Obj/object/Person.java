package Obj.object;

public class Person{

    private int age;

    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
//使用toString能够打印对象 这里所有的类自动继承顶级的object父类（里面有toString方法）
//    这里是重写toString方法
    @Override
    public String toString() {
        return "object.Person(age:" + age + ",name:" + name + ")";
    }

    public static void main(String[] args) {
//        static直接能够在别的类中使用
/*
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        System.out.println(jiaoji.intersect2(nums1,nums2));*/


        Person p = new Person(22, "Allen");
        Person p1 = new Person(18, "Peter");
        System.out.println(p);
        System.out.println(p1);
    }


}

