package Static;

/**
 * @author wang yuteng
 * @data 2020/7/7 18:37
 */
public class student {
    static {
        System.out.println("静态代码区执行成功");
    }
    /*
    *punlic class 名称{
    *   static{静态代码区的内容}  }
    * 特点：第一次用到本类时   静态代码块执行唯一的一次
    *静态内容总是优先于非动态所以优先执行
    *静态代码区的经典用法：用来一次性的对静态成员变量进行赋值
    * */


    private String name;
    private int id ;
    private int age ;
    private static int idCounter = 0;
//    这里的idcounter被所有student对象所共有的参数
    //如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰
    //千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量的数据是真正需要被共享的时候
    //才使用static修饰
    //这里的idcounter相当于一个计数器，每次初始化给student容器分配一个id

    public student(){

    }
    public student(String name,int age){
        this.name = name;
        this.age=age;
        this.id=++idCounter;
//        分配一个id
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
