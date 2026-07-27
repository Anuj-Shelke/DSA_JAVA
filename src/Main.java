//Program for Printing Numbered Pattern No 4 ;
public class Main{
    public static void main(String[] args){
        pattern2(5);
        pattern3(4);

    }
    public static void pattern2(int n){
        for(int row = 0 ; row <=n; row++){
            for(int coln = 1 ; coln <= row ; coln++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row =n ; row >0 ; row--){
            for(int coln = 1 ; coln <= row ; coln++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}