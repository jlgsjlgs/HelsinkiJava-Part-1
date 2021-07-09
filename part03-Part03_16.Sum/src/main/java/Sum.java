
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=3;i<12;i++){
            nums.add(i);
        }
        int summation = sum(nums);
        System.out.println(summation);
    }
    
    public static int sum(ArrayList<Integer> numbers){
        
        int sum=0;
        for (Integer x: numbers){
            sum+=x;
        }
        return sum;
    }

}
