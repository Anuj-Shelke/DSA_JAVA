import java.util.ArrayList;
import java.util.Collections;

//1431. Kids With the Greatest Number of Candies
public class Main{
    public static ArrayList<Boolean> array(int []candies , int extra_candies ){
        int max_candies = 0 ;
        ArrayList<Boolean> List = new ArrayList<>();
        for(int i =0 ; i < candies.length ; i++){
            if(candies[i] > max_candies){
                max_candies = candies[i];
            }

        }
        for(int i = 0 ; i < candies.length ; i++){
            if(max_candies> candies[i]+extra_candies){
                List.add(true);
            }
            else{
                List.add(false);
            }
        }
        return List;
    }
    public static void main(String[] args){
        ArrayList<Boolean> List = new ArrayList<>();
        int[] candies = {1,2,3,4,5};
        int extra_candies = 2;
        List = array(candies , extra_candies);
        System.out.println(List);

    }
}
