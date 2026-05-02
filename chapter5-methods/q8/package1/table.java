package package1;

public class table {
    public void accessBaseClassMethod() {
        new BaseClass().packagePrivateMethod();
    }
    public static void main(String[] args) {
        System.out.println("Table class");
        new table().accessBaseClassMethod();

        new PublicClass().publicMethod();
        new PublicClass().packagePrivateMethod();
    }
}