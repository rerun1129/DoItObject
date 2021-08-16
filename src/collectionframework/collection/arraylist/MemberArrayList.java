package collectionframework.collection.arraylist;

import collectionframework.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }


    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {

        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;                                    //지웠음
            }

        }
        System.out.println(memberId + "가 존재하지 않습니다.");  //못지웠음
        return false;
    }

    public void showAll() {

        for (Member member : arrayList) {

            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}
