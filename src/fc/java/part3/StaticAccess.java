package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil
        // 두 개 클래스의 static 멤버 접근 방법 : 클래스이름.호출메서드
        int sum = MyUtil.hap(a, b);
        System.out.println("sum = " + sum); // 30
    }
}