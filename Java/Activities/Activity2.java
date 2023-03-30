package activities;
import java.util.*;
public class Activity2 {
    public static void main(String[] args){
        int[] number={10, 77, 10, 54, -11, 10};
        System.out.println("List of Array"+Arrays.toString(number));

        int Searchnum=10;
        int Total=30;
        System.out.println("Result: " + result(number,Searchnum,Total));
    }
    public static boolean result(int[] numbers,int searchnum,int Total){
        int temp=0;
        for (int num : numbers){
            if(num==searchnum) {
                temp +=searchnum;
            }

            if(temp>Total){
                break;
            }
        }
        return temp == Total;
    }
}
