public class Main{
    public static void message(){
        System.out.println("Hello World 0 ");
        message1();
    }
    public static void message1(){
        System.out.println("Hello World 1 ");
        message2();
    }
    public static void message2(){
        System.out.println("Hello World 2 ");
        message3();
    }
    public static void message3(){
        System.out.println("Hello World 3 ");
        message4();
    }
    public static void message4(){
        System.out.println("Hello World 4 ");

    }
    public static void main(String[] args){
        message();
    }
}