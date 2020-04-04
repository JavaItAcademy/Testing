package kg;

public class Problem4 {
    public static String checkMoney(int[] array) {
        //return "LOW MONEY";
        return "OK";
    }

    public static int[] generateCorrectArray () {
        int[] money = new int[20];
//        int[] money = {100, 100, 200, 500};
        for(int i = 0; i< money.length;i++ ){
            if (i < 5) money[i] = 100;
            else if (i < 10) money[i] = 200;
            else if (i < 15) money[i] = 500;
            else money[i] = 1000;
        }
        return money;
    }
}
