package collectionframework.collection.set;

import collectionframework.collection.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }


    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {

        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                treeSet.remove(member);
                return true;                                    //지웠음
            }

        }
        System.out.println(memberId + "가 존재하지 않습니다.");  //못지웠음
        return false;
    }

    public void showAll() {

        for (Member member : treeSet) {

            System.out.println(member);
        }
    }

}
