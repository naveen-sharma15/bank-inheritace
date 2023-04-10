class account{
    private String name;
    private  String accNO;
    private  String address;
    private String dob;
    private String phno;

    protected long balance;

  account(String n,String accno,String add,String dob,String mob)
    {
        name=n;
        accNO=accno;
        address=add;
        phno=mob;
        this.dob=dob;
        balance=0;
    }

    public String getName() {
        return name;
    }

    public String getAccNO() {
        return accNO;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getPhno() {
        return phno;
    }

    public long getBalance() {
        return balance;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class savingacc extends account {
    public savingacc(String n, String accno, String add, String dob, String mob) {
        super(n, accno, add, dob, mob);
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}


class loanacc extends account{

    public loanacc(String n, String accno, String add, String dob, String mob) {
        super(n, accno, add, dob, mob);
    }
    public void payEmi(long amt)
    {
        balance-=amt;

    }
    public void repay(long amt)
    {
        if(balance==amt)
        {
            balance=0;
        }
    }
}
public class bank {
    public static void main(String[] args) {
        savingacc ac=new savingacc("naveen sharma","401170134009","sodepur","15/02/2003","7004884881120");
        ac.balance=15000;
        System.out.println("account type saving");
        System.out.println("account name: "+ac.getName());
        System.out.println("account number: "+ac.getAccNO());
        System.out.println("customer address: "+ac.getAddress());
        System.out.println("customer mobile no: "+ac.getPhno());
        System.out.println("date of birth: "+ac.getDob());
        System.out.println("total balance avalible :"+ac.balance);
        ac.deposit(15000);
        System.out.println("total balance after deposit :"+ac.getBalance());
        System.out.println(" ");
        loanacc lc=new loanacc("naveen sharma","401170134009","sodepur","15/02/2003","7004884881120");
        lc.balance=30000;
        System.out.println("Account type loan");
        System.out.println("account name: "+lc.getName());
        System.out.println("account number: "+lc.getAccNO());
        System.out.println("customer address: "+lc.getAddress());
        System.out.println("customer mobile no: "+lc.getPhno());
        System.out.println("date of birth: "+lc.getDob());
        System.out.println("total balance avalible :"+lc.balance);
        lc.payEmi(5000);
       System.out.println("available balance after emi paid : " +lc.balance);
//     lc.repay(15000);
//     System.out.println(lc.balance);
    }
}
