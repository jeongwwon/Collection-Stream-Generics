package Collection.Object;

public class Member {
    public String name;
    public int age;

    public Member(){
    }

    public Member(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public int hashCode(){
        //name 과 age 값이 같으면 동일한 hashCode가 리턴됨
        return name.hashCode()+age;
    }
    @Override
    public boolean equals(Object obj){
     if(obj instanceof Member){
         Member target=(Member)obj;
         return target.name.equals(name) && (target.age==age);
     }
     else{
         return false;
     }
    }
}
