package fc.java.part3;

import fc.java.model.PersonDTO;

public class AccessModifier {
    public static void main(String[] args) {
        PersonDTO dto = new PersonDTO();
        dto.name = "홍길동";
        // dto.age = 100; // 에러발생(접근불가)
        dto.phone = "010-1111-1111";
        System.out.println(dto.name + "\t" + dto.phone);
        dto.play();
    }
}