package Collection.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//해시테이블은 동기화된 메소드로 구성되어 있어 멀티스레드 환경에서 동시에 Hashtable 메소드들을 실행할수 없어 안전하다.
public class HashTable {
    public static void main(String args[]){
        Map<String, Integer> map = new Hashtable<>();
        Thread threadA=new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };
        Thread threadB=new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 2000; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };
        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        }catch (Exception e){

        }
        int size=map.size();
        System.out.println("총 엔트리 수:"+size);
        System.out.println();
    }
}
