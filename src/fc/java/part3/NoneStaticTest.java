package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // none-static메서드는 객체를 생성해서 메모리에 로딩시켜야 한다.
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(a, b);
        System.out.println("sum = " + sum);
    }
    public int hap(int a, int b){
        int v = a + b;
        return v;
    }
}