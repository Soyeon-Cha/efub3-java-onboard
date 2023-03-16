package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i=0; i<10; i++) {
            int a = flipCards[i][0];
            int b = flipCards[i][1];
            for (int j=(a-1); j<((a+b-2)/2); j++){
                int temp = answer[j];
                answer[j] = answer[(a+b-2-j)];
                answer[(a+b-2-j)] = temp;
            }
        }
        return answer;
    }
}
