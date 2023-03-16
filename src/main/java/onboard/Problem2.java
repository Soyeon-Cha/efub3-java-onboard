package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Integer[] middle = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // middle이 한 줄 시행 결과. answer는 시행 중의 저장소.

        for(int i=0; i<10; i++) {
            int a = flipCards[i][0];
            int b = flipCards[i][1];
            for (int j=(a-1); j<b; j++){
                int c = a+b-2-j;
                middle[j] = answer[c];
            }
            answer=middle; // answer에 한 줄 시행 결과 저장
        }

        return answer;
    }
}
