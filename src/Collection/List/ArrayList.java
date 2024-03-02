package Collection.List;
import Collection.Object.Board;

import java.util.List;

public class ArrayList {
    public static void main(String args[]){
        List<Board> list = new java.util.ArrayList<>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));

        int size=list.size();
        System.out.println("총 객체수:"+size);
        System.out.println();
        //2번 인덱스
        Board board=list.get(2);
        System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
        System.out.println();
        //리스트 인덱스 삭제
        list.remove(1);
        //2번 제거시 2번이 1번이됨
        list.remove(1);

        //향상된 for문
        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }

    }
}
