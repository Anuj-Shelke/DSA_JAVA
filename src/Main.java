import java.util.ArrayList;
import java.util.Scanner;

//412. Fizz Buzz LeetCode
public class Main{
    public static ArrayList<String> fizz(int num){
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>();


        for(int i = 1 ; i <= num ; i++){
            if(i%5==0 && i%3==0){
                ans.add("FizzBuzz");
            }
            else if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
            ans1 = ans;
        }
        return ans1;

    }
    public static void main(String[] args){
        System.out.println("Enter the number to test ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> fizz_out = new ArrayList<>();
        fizz_out = fizz(num);
        System.out.println(fizz_out);
    }
}