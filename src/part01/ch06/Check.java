package part01.ch06;

public class Check {
    public static void main(String[] args) {
        //15
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong","12345");
        if(result){
            System.out.println("로그인 되었습니다. ");
            memberService.logout("hong");
        }else {
            System.out.println("id 또는 password가 올바르지 않습니다. ");
        }

        //16,17
        //Printer printer = new Printer();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");

        //18
        ShopService obj1= ShopService.getInstance();
        ShopService obj2= ShopService.getInstance();

        if(obj1==obj2){
            System.out.println("같은 객체");
        }else {
            System.out.println("다른 객체");
        }

        //19
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: "+account.getBalance());//현재잔고 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: "+account.getBalance());//현재잔고 10000

        account.setBalance(2000000);
        System.out.println("현재 잔고: "+account.getBalance());//현재잔고 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: "+account.getBalance());//현재잔고 300000
    }
}
