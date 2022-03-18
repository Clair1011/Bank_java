package practice;

public class Mainbank {
    public static void main(String args[]) {
        TaipeiBank A = new TaipeiBank("Claire");
        int usdallor = 50;
        A.saveMoney(5000);
        System.out.println(usdallor + " 美金可以兌換 " + A.usa_to_taiwan((usdallor)) + " 台幣 ");

        A.saveMoney(15000);
        System.out.println(usdallor + " 美金可以兌換 " + A.usa_to_taiwan((usdallor)) + " 台幣 ");
    }
}
