public class OverloadingTest {
    public static void main(String[] args) {
        int a = add(10, 50);
        System.out.println("a = " + a);

        float f = add(35.6f, 56.7f);
        System.out.println("f = " + f);
    }

    // Q. 매개변수로 두 개의 정수 값을 받아서 총합을 구하여 리턴하는 [메서드를 정의] 하세요.
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Q. 매개변수로 두 개의 실수 값을 받아서 총합을 구하여 리턴하는 [메서드를 정의] 하세요.
    public static float add(float a, float b){
        float sum = a + b;
        return sum;
    }
}