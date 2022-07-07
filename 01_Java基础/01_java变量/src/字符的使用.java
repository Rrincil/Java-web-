package src;

public class 字符的使用 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\n'; //直接转义输出即被换行
        char c3 = '中';
        char c4 = 97; //char可以直接存放一个数字----unicode码 (https://tool.chinaz.com/Tools/Unicode.aspx)输出 a
        char c5 = '王';
        int x = c5;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(x); //输出‘王’对应的unicode码
    }
}
