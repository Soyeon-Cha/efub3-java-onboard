package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        
        for(int i=N-1; i>-1; i--){
            if(values[i]<=K) {
                answer += K/values[i];
                K %= values[i];
            }
        }
        
        return answer;
    }
}
