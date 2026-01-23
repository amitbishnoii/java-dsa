public class Functions {
    public static void main(String[] args) {
        Functions fk = new Functions();
        fk.addition(2,3);
        System.out.println(fk.sub(20, 10));
        String name = "Avrit Kaur";
    }

    void changeName(String n) {
        n = "Avrit Toor";
    }

    void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    int sub(int num1, int num2) {
        return num1 - num2;
    }
}
