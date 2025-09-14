package part01.ch06;

public class Account {
    public static final int MIN_BALANCE=0;
    public static final int MAX_BALANCE=1000000;
    String accountNumber="1"; // 계좌번호
    String accountHolder="1"; // 계좌주
    int balance=0;          // 초기입금액

    public Account(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Account() {

    }

    public void setBalance(int balance) {
        if(balance>=MIN_BALANCE&&balance<=MAX_BALANCE){
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int balance) {
        this.balance+=balance;
    }
}
