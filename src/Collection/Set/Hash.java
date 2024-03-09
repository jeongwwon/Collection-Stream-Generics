package Collection.Set;

import Collection.Object.Member;

public class Hash {
    public static void main(String args[]){
        Member m1 = new Member("홍길동", 30);
        Member m2 = new Member("홍길동", 30);
        System.out.println("equals 결과:");
        System.out.println(m1.equals(m2));
        System.out.println("hashcode 결과:");
        System.out.println(m1.hashCode()==m2.hashCode());

    }
}
