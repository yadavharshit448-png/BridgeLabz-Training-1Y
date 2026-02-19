package library.members;

public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}
