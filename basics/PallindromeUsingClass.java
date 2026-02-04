// Reverse a number and check palindrome
class PalindromeNum {
    // Function to reverse a number
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 123464321;

        int revNum = reverse(num);
        System.out.println("Reverse = " + revNum);

        if (num == revNum)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}
