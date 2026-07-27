//Program for printing Star Pattern...............
public class Main{
    public static void main(String[] args){
        pattern1(4);

    }
    public static void pattern1(int n){
        for(int row = 0 ; row <=n ; row++){
            for(int coln = 0 ; coln <= row ; coln++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}