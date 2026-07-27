//Program for Printing Star Pattern..............
public class Main{
    public static void main(String[] args){
        String str = "Nitin";

    }
    public static boolean pali(String str){
        if(str.isEmpty()){
            return true;
        }
        for(int i = 0 ; i< str.length()*0.50; i++){
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true; 
    }
}