package Static;

/**
 * @author wang yuteng
 * @data 2020/7/7 18:43
 */
public class Stu {

    public static void main(String[] args) {
        student stu1 =new student("王",11);
        student stu2 =new student("黄",20);

        System.out.println("name"+stu1.getName()+" age"+stu1.getAge()+" id"+stu1.getId());
        System.out.println("name"+stu2.getName()+" age"+stu2.getAge()+" id"+stu2.getId());
    }
}
