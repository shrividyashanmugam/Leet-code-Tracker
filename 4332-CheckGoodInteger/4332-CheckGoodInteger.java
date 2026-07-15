// Last updated: 7/15/2026, 2:05:34 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        int temp = n;
        while(temp > 0){
           int a = temp % 10;
            digitSum += a;
            squareSum += a * a;
            temp /= 10;
        }
        return (squareSum - digitSum >= 50);
    }
}