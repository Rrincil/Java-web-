package src;

public class 布尔类型03 {
    static boolean y = false;
    public static void main(String[] args) {
        char x = 'R';
        add();
        if(y) {
            System.out.println((int)x);
        } else {
            System.out.println("假的");
        }
    }
    public static void add() {
        y = true;
    }
}
