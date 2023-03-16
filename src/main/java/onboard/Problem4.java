package onboard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        char[] a = Integer.toString(number).toCharArray();

        Arrays.sort(a);

        for(int i=0; i<a.length; i++){
            answer = 10*answer + a[(a.length-1-i)]-'0';
        }

        return answer;
    }
}
