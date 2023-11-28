import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1(5));
        System.out.println(task1(8));
        System.out.println(task2(new int[]{1,1,2,3,4}));
        System.out.println(Arrays.toString(task3(6)));
        System.out.println(Arrays.toString(task3(7)));
        System.out.println(task4(347));
        System.out.println(task5(""));
        System.out.println(task5("Grew"));
    }
    public static String task1(int n){
        StringBuilder sb = new StringBuilder("+");
        for(int i = 0; i < n-1; i++){
            if(i % 2 == 1)
                sb.append("+");
            else
                sb.append("-");
        }
        return sb.toString();
    }
    public static int task2(int[] arr){
        int result = 0;
        for (int num : arr) {
            result += num;
        }
        return result;
    }
    public static int[] task3(int n){
        int[] arr = new int[n];
        if(n % 2 == 0){
            for (int i = 0; i < (n / 2); i++) {
                arr[i] = (-1) * ((n/2)-i);
                arr[(n / 2) + i] = ((n/2)-i);
            }
        }else{
            for (int i = 0; i < (n / 2); i++) {
                if(i == (n/2)){
                    arr[i] = 0;
                }else{
                    arr[i] = ((n/2)-i) * (-1);
                    arr[i + 1 + (n/2)] = (n/2)-i;
                }
            }
        }
        return arr;
    }
    public static int task4(int n){
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
        list.sort(Collections.reverseOrder());
        int res = 0;
        for(int num : list){
            res = (res * 10) + num;
        }
        return res;
    }
    public static String task5(String s){
        if(s.isEmpty())return "Empty!";
        char c = s.charAt(0);
        if(Character.isUpperCase(c)){
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        }else{
            return "other";
        }
    }
}