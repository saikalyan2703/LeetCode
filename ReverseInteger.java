Question:

Given a 32-bit signed integer, reverse digits of an integer.
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Example1:

Input: 123
Output:  321

Example2:

Input: -123
Output: -321

Example3:

Input: 120
Output: 21

class Solution {
    public int reverse(int num) {
       boolean negativeFlag = false;
        if (num < 0)
        {
            negativeFlag = true;
            num = -num ;
        }
      
        int prev_rev_num = 0, rev_num = 0;
        while (num != 0)
        {
            int curr_digit = num%10;
      
            rev_num = (rev_num*10) + curr_digit;
            if ((rev_num - curr_digit)/10 != prev_rev_num)
            {
                return 0;
            }
      
            prev_rev_num = rev_num;
            num = num/10;
        }
      
        return (negativeFlag == true)? -rev_num : rev_num;
    }
}