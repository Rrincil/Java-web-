package src;

import java.lang.reflect.Array;

public class 基本数据类型01 {
    static byte x = 22 ;
    short x2 = (short) 20L;//l表示long型
    long x3;
    int x4;
    //浮点型常量默认值为Double,声明float类型时，必须加f/F或者强制转换类型(float)1.2
    float y1 = (float) 1.1;
    float y2 = 1.2f;

    double y3 = .22;//o.22
    double y4 = 5.12e2;//科学计数法：5.12*10^2
    double y5 = 5.12e-2;//科学计数法：5.12除于10^2

    char z1 = 's';
    static String z2= "nihao";
    Array t[] = new Array[7];

//    强制转换 Cast to类型
    static char z3 = (char) x;

    public static void main(String[] args) {
        float x = 1.234567459f; //1.2345674-------保留7位数
        float x2 = 1.234567465f;//1.2345675
        double y = 1.234567890;//1.23456789
        System.out.println(x);
        System.out.println(x2);
        System.out.println(y);
        System.out.println("---------------------------------------");

        double a = 2.7;
        double b = 8.1/3;//2.6999999999999997-------输出近似2.7的
        System.out.println(a);
        System.out.println(b);
        if(Math.abs(a-b)<0.0001) { //Java API====Math.abs() 判断绝对值
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        System.out.println("--------对小数进行相等判断的时候要小心,应该以两个数值的差的绝对值在某个精度范围类来判断------------");

        System.out.println(z2+z3);
    }
}
