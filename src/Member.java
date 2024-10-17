//Member Class:
//
//Define a Member class to store basic member information such as name, age, and member ID.
public class Member {
    private String name;
    private int age;
    private int memberId;

    public Member(String name, int age, int memberId) {
        this.name = name;
        this.age = age;
        this.memberId = memberId;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMemberId() {
        return memberId;
    }
}
