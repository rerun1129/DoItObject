package collectionframework.collection.map;

import collectionframework.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberTreeMap {

    private HashMap<Integer, Member> treeMap;


    public MemberTreeMap() {
        treeMap = new HashMap<>();
    }

    public void addMember(Member member) {

        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {

        if (treeMap.containsKey(memberId)) {

            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {

        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next();

            Member member = treeMap.get(key);

            System.out.println(member);

        }
    }
}
