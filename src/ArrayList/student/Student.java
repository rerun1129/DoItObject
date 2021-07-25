package ArrayList.student;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList;             //생성자에서 인스턴스 생성 준비

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<>();                //인스턴스를 생성하면서 동시에 subjectList
                                                        //인스턴스도 생성한다.
    }

    public void addSubject(String name, int score){
     Subject subject = new Subject();
     subject.setName(name);
     subject.setScorePoint(score);

     subjectList.add(subject);

    }

    public void getStudentInfo(){
        int total = 0;
        for (Subject subject : subjectList){

            total += subject.getScorePoint();

            System.out.println("학생 " + studentName + "님의" + subject.getName() + " 과목의 성적은 " +
                    subject.getScorePoint() + "점 입니다.");

        }
        System.out.println("총점은 " + total + "점 입니다.");
    }
}
