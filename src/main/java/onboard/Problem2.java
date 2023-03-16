package onboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int sum=0;

        for(int i=0;i<5;i++) {
            sum += numbers.get(i);
        }
        int avg = sum/5;

        Collections.sort(numbers);
        answer.set(0, avg);
        answer.set(1, numbers.get(2));

        return answer;
    }
}
