class Solution {
    public int solution(int hp) {
        int answer = 0;
        //장군개미 5, 병정개미 3, 일개미 1

        if (hp / 5 != 0) {
            answer = hp / 5;
            hp = hp - (hp / 5 * 5);
        }
        if (hp / 3 != 0) {
            answer += hp / 3;
            hp = hp - (hp / 3 * 3);
        }
        if (hp / 1 != 0) {
            answer += hp / 1;
            hp = hp - (hp * 1);
        }
        return answer;
    }
}