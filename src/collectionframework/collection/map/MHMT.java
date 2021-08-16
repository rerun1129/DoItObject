package collectionframework.collection.map;

import collectionframework.collection.Member;


public class MHMT {

    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberShin);
        memberTreeMap.showAll();

        System.out.println("=============================");

        Member memberLee2 = new Member(104, "이순신");
        memberTreeMap.addMember(memberLee2);
        memberTreeMap.showAll();

    }
}
