package Collection.List;

import Collection.Object.Board;

import java.util.List;

//벡터는 동기화된 메소드로 구성되어 있어 멀티 스레드 환경에서 안전하게 객체를 추가,삭제 가능하다.
public class Vector {
    public static void main(String args[]){
        List<Board> list = new java.util.Vector<>();
        Thread threadA=new Thread() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };
        Thread threadB=new Thread() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };
        threadA.start();
        threadB.start();
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
        }
        int size=list.size();
        System.out.println("총 객체수:"+size);
        System.out.println();
    }
}
