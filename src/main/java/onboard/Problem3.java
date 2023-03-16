package onboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;



public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int sum=0;

        for(int i=0;i<5;i++) {
            sum += numbers.get(i);
        }
        int avg = sum/numbers.size();
        
        Collections.sort(numbers);
        int mid = numbers.get(2);
        
        answer.add(avg);
        answer.add(mid);

        return answer;
    }
}
