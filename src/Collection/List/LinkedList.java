package Collection.List;

import java.util.ArrayList;
import java.util.List;

//Array List는 배열에 객체를 저장하지만 Linked List는 인접 객체를 체인처럼 연결한다.
public class LinkedList {
    public static void main(String args[]){
        List<String> list1=new ArrayList<>();
        List<String> list2 =new java.util.LinkedList<>();

        long startTime;
        long endTime;

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            //ArrayList는 0번인덱스에 추가할때 한칸씩 뒤로 민다.
            list1.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.printf("%-17s %8d ns\n","ArrayList 걸린 시간:",(endTime-startTime));

        startTime=System.nanoTime();
        for(int i=0;i<10000;i++){
            list2.add(0,String.valueOf(i));
        }
        endTime=System.nanoTime();
        System.out.printf("%-17s %8d ns\n","LinkedList 걸린 시간:",(endTime-startTime));
    }
}
