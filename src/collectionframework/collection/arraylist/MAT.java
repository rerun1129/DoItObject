package collectionframework.collection.arraylist;

import collectionframework.collection.Member;

public class MAT {

    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberShin);
        memberArrayList.showAll();
        memberArrayList.removeMember(101);
        memberArrayList.showAll();

    }

}
