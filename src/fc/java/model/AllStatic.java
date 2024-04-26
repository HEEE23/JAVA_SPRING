package fc.java.model;

public class AllStatic {
    // 모든 멤버가 static이라는 멤버로 되어있는 경우, 인위적으로 생성자를 private으로 만들 수 있음.
    private AllStatic(){

    }
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }
    public static int max(int a, int b){
        return (a > b)? a : b;
    }
    public static int min(int a, int b){
        return (a < b)? a : b;
    }
}
