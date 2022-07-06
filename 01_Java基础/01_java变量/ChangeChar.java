/**
 * 转移字符的使用
 */
public class ChangeChar {
    public static void main(String[] args) {
        //   \t:一个制表位，实现对其功能
        System.out.println("四川\t德阳\t成都");
        //   \n:换行符
        System.out.println("四川德阳\n成都");
        //   \\:一个\
        System.out.println("四川德阳\\成都");
        //   \":一个"
        System.out.println("四川德阳\"成都\"");
        //   \':一个'
        System.out.println("四川德阳\'成都\'");
        //   \r:一个回车
        System.out.println("四川德阳\r你好");
    }
}