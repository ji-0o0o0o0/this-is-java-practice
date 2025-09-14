package part01.ch06;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts= new Account[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
        System.out.println("--------------------------------------");
        boolean end = false;
        int accountCnt = 0;
        String accountNumber ="";
        while (!end){
            System.out.print("선택>");
            String answer = sc.nextLine();
            switch (answer){
                case "1":
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    accountNumber = sc.nextLine();
                    System.out.print("계좌주: ");
                    String accountHolder = sc.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = sc.nextInt();
                    sc.nextLine(); // 버퍼 비우기 (엔터 제거)

                    accounts[accountCnt] = new Account(accountNumber, accountHolder, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    accountCnt++;
                    break;
                case "2":
                    for (int i = 0; i <accountCnt ; i++) {
                        System.out.println(accounts[i].accountNumber+" "+accounts[i].accountHolder+" "+accounts[i].balance);
                    }
                    break;
                case "3":
                    System.out.print("계좌번호: ");
                    accountNumber = sc.nextLine();
                    for (int i = 0; i <accountCnt ; i++) {
                        if(accountNumber.equals(accounts[i].accountNumber)){
                            System.out.print("예금액: ");
                            accounts[i].addBalance(sc.nextInt());
                            sc.nextLine(); // 버퍼 비우기 (엔터 제거)
                        }
                    }
                    break;
                case "4":
                    System.out.print("계좌번호: ");
                    accountNumber = sc.nextLine();
                    for (int i = 0; i <accountCnt ; i++) {
                        if(accountNumber.equals(accounts[i].accountNumber)){
                            System.out.print("출금액: ");
                            accounts[i].addBalance(-sc.nextInt());
                            System.out.println("결과: 출금이 성공되었습니다.");
                            sc.nextLine(); // 버퍼 비우기 (엔터 제거)
                        }
                    }
                    break;
                case "5":
                    end=true;
                    System.out.println("프로그램 종료");
                    break;
            }

        }
    }
}
