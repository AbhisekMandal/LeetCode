//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int num) {
        int sum = 0;
        int rem;
        int temp = num;
        if (num<0){
            return false;
        }
        while (num>0){
            rem = num % 10;
            sum = (sum*10)+rem;
            num /= 10;
        }
        num = temp;
        if(num == temp){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
    }
}
