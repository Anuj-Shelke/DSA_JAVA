//Program for Printing Numbered Pattern No 4 ;
public class Main{
    public static void main(String[] args){
        pattern2(5);
    }
    public static void pattern2(int n){
        for(int row = 0 ; row <=n; row++){
            for(int coln = 1 ; coln <= row ; coln++){
                System.out.print(coln);
            }
            System.out.println();
        }
    }
}