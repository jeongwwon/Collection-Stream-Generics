package Collection.Set;

import Collection.Object.Member;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static void main(String args[]){
        Set<Member> set = new HashSet<Member>();
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));
        System.out.println("총 객체 수: "+set.size());

        Set<String> set2 = new HashSet<>();
        set2.add("Java");
        set2.add("JDBC");
        set2.add("JSP");
        set2.add("Spring");

        Iterator<String> iterator=set2.iterator();
        while(iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
            if (element.equals("JSP")){
                iterator.remove();
            }
        }
        System.out.println();
        set2.remove("JDBC");

        for (String element: set2) {
            System.out.println(element);
        }
    }
}
