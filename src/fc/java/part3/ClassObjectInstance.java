package fc.java.part3;

import fc.java.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1; // st1 : object
        StudentVO st2; // st2 : object
        StudentVO st3; // st3 : object

        st1 = new StudentVO("홍길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111"); // st1 : instance
        st2 = new StudentVO("김길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111"); // st2 : instance
        st3 = new StudentVO("나길동", "컴퓨터공학과", 37, "bit@empas.com", 2023110, "010-1111-1111"); // st3 : instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
