import java.util.*;

class interface1 {
    public static boolean palindrome(int n) {
        int pal = 0;
        int temp = n;
        while (n != 0) {
            pal = pal * 10 + n % 10;
            n /= 10;
        }
        if (pal == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean prime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n + 1; i >= n; i++) {
            if (palindrome(i) && prime(i)) {
                System.out.print(i);
                break;
            }
        }
    }
}

