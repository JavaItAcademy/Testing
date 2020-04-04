package kg;

public class Problem2 {

    static int getTriangleArea(int h, int base) {
        if (h < 0 || base < 0) return 0;
        return h * base / 2;
    }

    static double getCircleArea(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    static boolean isPrime(int num) {
        if (num <= 0) return false;
        for (int i = 2; i < num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
