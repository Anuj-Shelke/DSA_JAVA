import java.util.Scanner;

public class Main{
    public static boolean ispali(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    public static void main(String[] args){
        System.out.println("Enter String to check if it is a Palindrome");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean result = ispali(name);
        System.out.println(result);


    }
}