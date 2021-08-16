package collectionframework.collection.set;

import collectionframework.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }


    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {

        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                hashSet.remove(member);
                return true;                                    //지웠음
            }

        }
        System.out.println(memberId + "가 존재하지 않습니다.");  //못지웠음
        return false;
    }

    public void showAll() {

        for (Member member : hashSet) {

            System.out.println(member);
        }
    }
}
