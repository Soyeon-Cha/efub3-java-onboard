package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
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
        List<Integer> answer = new ArrayList<>();
        return answer;
    }
}
