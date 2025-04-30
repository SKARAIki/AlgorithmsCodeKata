class Solution {
    public int solution(int age) {
        int answer = 0;
        if ((0 < age) && (age <= 120) ){
        answer = 2022 - (age-1);
            System.out.println(2022+"년 기준 "+age+"살이므로 "+answer+"년생입니다." );
        }return answer;
    }
}