package fc.java.part3;

import fc.java.model.NoneMyUtil;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // NoneMyUtil
        // 두 개 클래스의 none-static 멤버 접근 방법 : 객체 생성해서 접근
        NoneMyUtil my = new NoneMyUtil();
        int sum = my.hap(a, b);
        System.out.println("sum = " + sum);
    }
}