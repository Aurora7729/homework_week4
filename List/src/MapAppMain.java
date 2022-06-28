import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAppMain {
    public static void main(String[] args) {

        Map<String, String> map = createMap(5);

        // TODO 通过get方法，得到传递的key对应的value
        System.out.println(map.get("key3"));

        // TODO 如果没有key，或者key可能对应的值就是null，那么就返回null
        System.out.println(map.get(new Object()));
        System.out.println(map.get("key9"));

        // TODO 注意：不是每种Map的实现都允许key或者value为null，使用时需要注意
        map.put(null, "value of null key");
        map.put("testnull", null);
        System.out.println("null key value:" + map.get(null));
        System.out.println("null value support:" + map.get("testnull"));

        // TODO 删除key
        System.out.println("--------------删除key--------------");
        String keyToRemove = "key4";
        System.out.println(keyToRemove + "对应的值是：" + map.get(keyToRemove));
        map.remove(keyToRemove);
        System.out.println("执行删除操作后，" + keyToRemove + "对应的值是：" + map.get(keyToRemove));

        System.out.println("--------------遍历key和value--------------");
        // TODO 通过Entry类遍历Map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key为：" + entry.getKey() + "，value为：" + entry.getValue());
        }

        System.out.println("--------------遍历value--------------");
        // TODO 通过Entry类遍历Map
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("--------------遍历key--------------");
        // TODO 通过Entry类遍历Map
        for (String key : map.keySet()) {
            System.out.println(key);
        }


        Map<Integer,String> map2 = createMap2(5);
        System.out.println("-------------- 显示key=3 --------------");
        System.out.println(map2.get(3));
        System.out.println(map2.get(new Object()));
        System.out.println(map2.get(66));
        System.out.println("-------------- 设定key=4 --------------");
        map2.put(4,null);
        System.out.println(map2.get(4));
        System.out.println("-------------- 删除key=1 --------------");
        int KeyToRemove = 1;
        System.out.println(map2.get(KeyToRemove));
        map2.remove(KeyToRemove);
        System.out.println(map2.get(KeyToRemove));
        System.out.println("--------------遍历key--------------");
        for (Integer key: map2.keySet()){
            System.out.println(key);
        }
        System.out.println("--------------遍历value--------------");
        for (String value: map2.values()){
            System.out.println(value);
        }
        System.out.println("--------------遍历key和value--------------");
        Set<Map.Entry<Integer, String>> entrySet = map2.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet){
            System.out.println("key为：" + entry.getKey() + "，value为：" + entry.getValue());
        }

        // TODO: 2022/6/25 另一种方法
        System.out.println("--------------另一种方法--------------");
        Set<Integer> keySet = map2.keySet(); // 获取map所有的key成新的集合
        System.out.println(keySet); // [1, 2, 3]
        Iterator<Integer> iterator = keySet.iterator(); // 对key的集合生成迭代器
        while(iterator.hasNext()){ // 迭代器循环
            Integer key = iterator.next(); // 获取迭代器下一个值（key）
            String value = map2.get(key); // 获取迭代器下一个值对用的值（value）
            System.out.println("key:"+key+",value:"+value);
        }




    }



    private static Map<String, String> createMap(int size) {
        Map<String, String> ret = new HashMap<>();
        for (int i = 0; i < size; i++) {
            // TODO put的第一个为key，第二个为value
            ret.put("key" + i, String.valueOf(Math.random()));
        }
        return ret;
    }

    // TODO 创建 HashMap 实例，并按照泛型的定义，向里面放入key和value
    private static Map<Integer, String> createMap2(int size) {
        Map<Integer, String> ret = new HashMap<>(size);
        for (int i = 0; i < size; i++){
            ret.put(i,String.valueOf(Math.random()));
        }
        return ret;
    }

}

