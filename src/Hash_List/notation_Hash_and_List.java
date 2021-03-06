package Hash_List;

import java.util.*;

/**
 * @author wang yuteng
 * @data 2020/7/6 13:47
 */

/**
* Collection是最基本集合接口，它定义了一组允许重复的对象。Collection接口派生了两个子接口Set(Hashset)和List(Linklist和ArrayList)
*Map接口下含有HashMap和TreeMap
* */
public class      notation_Hash_and_List {
    public static void main(String[] args) {

        // 1. initialize the hash set
        HashSet<String> hashSet = new HashSet  <String>();

        Set<String> hashset = new HashSet<>();

        // 2. add a new key
        hashSet.add("3");
        hashSet.add("2");
        hashSet.add("1");
        // 3. remove the key
        hashSet.remove(2);
        hashSet.contains(2);
        hashSet.clear();



        Map<String, String> map = new HashMap<>();
//      HashMap<String, String> map = new HashMap<>(); 因为hashmap承继于Map接口
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.remove("1");
        map.get("1");
        System.out.println(map);
//        迭代器遍历hashmap
//        Map.Entry是Map声明的一个内部接口，此接口为泛型，定义为Entry<K,V>。它表示Map中的一个实体（一个key-value对）。接口中有getKey(),getValue方法。
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
//        entrySet()的返回值也是返回一个Set集合，此集合的类型为Map.Entry
        /*
       Map.entrySet() 这个方法返回的是一个Set<Map.Entry<K,V>>，Map.Entry 是Map中的一个接口，
       他的用途是表示一个映射项（里面有Key和Value），
       而Set<Map.Entry<K,V>>表示一个映射项的Set。
       Map.Entry里有相应的getKey和getValue方法，即JavaBean，让我们能够从一个项中取出Key和Value。

         */
        while (entries.hasNext()) {
            Map.Entry entry = entries.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }


        Hashtable<String, String> table = new Hashtable<String, String>();
//      Dictionary<String, String> table = new Hashtable<String, String>(); 因为Hashtable继承于Dictionary接口
        table.put("1", "1");
        table.put("2", "2");
        table.remove("1");
        table.get("1");
        System.out.println(table);


        ArrayList<Integer> array = new ArrayList<Integer>();
//      List<Integer> array = new ArrayList<Integer>(); 因为ArrayList继承于List接口继承于Collection
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1, 7);
        System.out.println(array);
        array.set(1, 10);
        System.out.println(array);
        array.get(1);
//        获取arraylist中每个元素
        for (int str : array) {
            System.out.println(str);
        }
//        第二种方法
//        for(int i=0;i<array.size();i++){
//            System.out.println(array.get(i));
//        }

        List<String> linked = new LinkedList<>();
//       List<String> linked = new LinkedList<String>(); 后面String 有没有都可以
        linked.add("first");
        linked.add("second");
        linked.add("third");
        String A = linked.get(1);
        System.out.println(A);

//   ArrayList的所有数据是在同一个地址上,而LinkedList的每个数据都拥有自己的地址.所以在对数据进行查找的时候
//   由于LinkedList的每个数据地址不一样，get数据的时候ArrayList的速度会优于LinkedList，而更新数据的时候，
//   虽然都是通过循环循环到指定节点修改数据，但LinkedList的查询速度已经是慢的，而且对于LinkedList而言，
//   更新数据时不像ArrayList只需要找到对应下标更新就好，LinkedList需要修改指针，速率不言而喻





        int[] arrary1 = new int[]{1, 2, 3};
//  静态
        int[] arrary2 = new int[3];
//  动态
        int[] arrary3 = {1, 2, 3, 4};

        int[] arrary4;
//        这部分只是定义了一个空壳，还没有分配，所以无法print arrary4[0]
        arrary4 = new int[3];

    }

//    如果方法想返回两个值，那么：

    public static int[] cacule(int a, int b, int c) {
        int sum = a + b + c;
        int ave = sum / 3;

        int arrey[] = {sum, ave};
        return arrey;

    }

}
