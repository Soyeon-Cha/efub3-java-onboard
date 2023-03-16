package onboard;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        int a[] = new int[10];

        a[0] = number/1000000000;
        a[1] = (number%1000000000)/100000000;
        a[2] = (number%100000000)/10000000;
        a[3] = (number%10000000)/1000000;
        a[4] = (number%1000000)/100000;
        a[5] = (number%100000)/10000;
        a[6] = (number%10000)/1000;
        a[7] = (number%1000)/100;
        a[8] = (number%100)/10;
        a[9] = number%10;

        for(int i=0; i<10; i++){
            for(int j=i+1; j<10; j++){
                if(a[i]<a[j]){
                    int c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        
        return answer;
    }
}
