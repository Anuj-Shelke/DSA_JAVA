//Program for Printing Star Pattern No 3 ;
public class Main{
    public static void main(String[] args){
        pattern2(5);
    }
    public static void pattern2(int n){
        for(int row = n ; row >0  ; row--){
            for(int coln = 0 ; coln < row ; coln++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}