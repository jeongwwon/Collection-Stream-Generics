package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",90);
        map.put("홍길동",90);

        System.out.println("총 Entry 수: "+map.size());
        System.out.println();

        String key="홍길동";
        int value=map.get(key);
        System.out.println(key+":"+value);
        System.out.println();
        //키 set 컬렉션
        Set<String> keySet=map.keySet();
        Iterator<String>keyIterator=keySet.iterator();
        while(keyIterator.hasNext()){
            String k=keyIterator.next();
            Integer v=map.get(k);
            System.out.println(k+":"+v);
        }
        System.out.println();

        Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
        Iterator<Map.Entry<String,Integer>>entryIterator=entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,Integer>entry= entryIterator.next();
            String k=entry.getKey();
            int v=entry.getValue();
            System.out.println(k+":"+v);
        }
        System.out.println();


    }
}
