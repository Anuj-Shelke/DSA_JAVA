//Program for Printing Star Pattern No 2 ;
public class Main{
    public static void main(String[] args){
        pattern2(4);
    }
    public static void pattern2(int n){
        for(int row = 0 ; row <= n ; row++){
            for(int coln = 0 ; coln <= n-1 ; coln++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}