Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1




class Solution {
public:
    int trailingZeroes(int n) {
        int sum = 0;
        while (n / 5 > 0) {
            sum += (n / 5);
            n /= 5;
        }
        return sum;
    }
};
