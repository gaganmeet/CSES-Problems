
import java.util.*;
public class Repetitions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max=1,count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                max = Math.max(max,count);
            }
            else
                count = 1;

        }
        System.out.print(max);
    }    
}