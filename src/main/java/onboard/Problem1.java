package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();

        if (minute>=45) {
            minute -= 45;
        }
        else { // minute<45
            if (hour>=1){
                hour--;
            }
            else {
                hour=23;
            }
            minute=minute+15;
        }

        answer.add(0, hour);
        answer.add(1, minute);

        return answer;
    }
}
