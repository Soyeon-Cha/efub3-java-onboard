package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int sum=0;
        int a=0;
        int arr[] = new int[5];

        for(int i=0;i<5;i++) {
            a = numbers.get(i);
            arr[i] = a;
            sum += a;
        }

        int avg = sum/5;

        Arrays.sort(arr);
        answer.set(0, avg);
        answer.set(2, arr[2]);

        return answer;
    }
}
