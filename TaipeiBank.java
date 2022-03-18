package practice;
// 假設台幣:美金匯率為 1:30，換匯時銀行會收1%手續費，但如果存款金額大於等於10000，手續費率降為0.8%
public class TaipeiBank {
    private String name; //開戶者姓名
    private int balance; // 存款金額
    private int rate = 30; // 匯率
    private double service_charge = 0.01; // 手續費率
    public TaipeiBank (String name) {
        this.name = name;
        this.balance = 0;
    }

    public void saveMoney(int money) { //存款
        this.balance += money;
    }

    public void withdrawMoney(int money) { // 提款
        this.balance -= money;
    }

    public double usa_to_taiwan(int usaD) { //換匯計算
        if (this.balance >= 10000)
            this.service_charge = 0.008;
        return cal_rate(usaD);
    }

    private double cal_rate (int usaD) {
        double resule;
        resule = usaD * rate * (1 - service_charge);
        return resule;
    }

    public void get_balance() {
        System.out.println(name + " 目前存款餘額 " + balance );
    }

}

