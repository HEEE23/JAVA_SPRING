package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 기본 생성자(default Constructor)
    public PersonVO(){
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체 초기화
        this.name = "홍길동";
        this.age = 50;
        this.phone = "010-1111-1111";
    }

    // 생성자 오버로딩
    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // setter emthod
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    // getter method
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return this.phone;
    }

    // toString
    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }
}
