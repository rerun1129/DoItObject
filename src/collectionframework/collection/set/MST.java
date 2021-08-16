package collectionframework.collection.set;

import collectionframework.collection.Member;

public class MST {

    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberShin);
        memberTreeSet.showAll();

        System.out.println("=============================");

        Member memberLee2 = new Member(101, "이순신");
        memberTreeSet.addMember(memberLee2);
        memberTreeSet.showAll();

    }
}
