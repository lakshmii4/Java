package classworkdaytwelve;

public class Number {
	
	public int checkPrime(int x) {
        if (x <= 1) return 0; // zero and one are not prime numbers
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return 0;
        }
        return x;
    }
 
    public boolean checkAmstrong(int x) {
        int n = Integer.toString(x).length();
        int temp = x, remainder, result = 0;
        while (temp!= 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
            temp /= 10;
        }
        return result == x;
    }
 
    public boolean checkPolindrom(int x) {
        int n = Integer.toString(x).length();
        int temp = x, remainder, result = 0;
        while (temp!= 0) {
            remainder = temp % 10;
            result = result * 10 + remainder;
            temp /= 10;
        }
        return result == x || result / 10 == x;
    }
 
    public static void main(String[] args) {
        Number num = new Number();
        System.out.println("Is 17 prime? " + num.checkPrime(17));
        System.out.println("Is 153 an Armstrong number? " + num.checkAmstrong(153));
        System.out.println("Is 121 a palindrome? " + num.checkPolindrom(121));
    }
}