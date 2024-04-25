package fc.java.part3;

import fc.java.model.Person;
import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // Q. 한 사람의 회원 정보를 저장할 [객체를 생성]하세요.
        PersonVO vo = new PersonVO();

        // public -> private 정보 은닉되어 사용할 수 없음
        // vo.name = "홍길동";
        // vo.age = 5000;
        // vo.phone = "010-1111-1111";

        // System.out.println(vo.name + "\t" + vo.age + "\t" + vo.phone);

        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName()+ "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}