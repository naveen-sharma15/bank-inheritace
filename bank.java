package myoops;

import javax.print.DocFlavor;
import java.security.PrivateKey;

class acc{
    private String name;
    private String accN0;
    private String address;
    private String phno;
    protected long bal;
    acc(String n,String a,String ad,String p)
    {
        name=n;
        accN0=a;
        address=ad;
        phno=p;
        bal=0;

    }
    public String getName()
    {
        return name;
    }
    public String getAccN0()
    {
        return accN0;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhno()
    {
        return phno;
    }
    public  long getBal()
    {
        return bal;
    }


}
class savingAcc extends acc{
    savingAcc(String n,String a,String ad,String p)
    {
        super(n,a,ad,p);
    }
    public  void depoit(long amt)
    {
        bal=bal+amt;
    }
    public void withdrawl(long amt)
    {
        bal=bal-amt;
    }

}
class loanacc extends acc{
    loanacc(String n,String a,String ad,String p)
    {
        super(n,a,ad,p);
    }
    public void payemi(long amt)
    {
        bal=bal-amt;
    }
    public void repay(long amt)
    {
        if(bal==amt)
        {
            bal=0;
        }
    }

}
public class bank {
    public static void main(String[] args) {
        savingAcc sa=new savingAcc("naveen sharma","40117013409","darbhanga","7004881120");
        sa.bal=5000;
        System.out.println("account type saving");
        System.out.println("account name: "+sa.getName());
        System.out.println("account number: "+sa.getAccN0());
        System.out.println("customer address: "+sa.getAddress());
        System.out.println("customer mobile no: "+sa.getPhno());
        System.out.println("total balance avalible :"+sa.bal);
        sa.depoit(15000);
        System.out.println("total balance after deposit :"+sa.getBal());
        System.out.println(" ");

        loanacc lc=new loanacc("naveen sharma","40117013409","darbhanga","7004881120");
        lc.bal=15000;
        System.out.println("Account type loan");
        System.out.println("account name: "+lc.getName());
        System.out.println("account number: "+lc.getAccN0());
        System.out.println("customer address: "+lc.getAddress());
        System.out.println("customer mobile no: "+lc.getPhno());
        System.out.println("total balance avalible :"+lc.bal);
        lc.payemi(5000);
        System.out.println("available balance after emi paid : " +lc.bal);
        lc.repay(10000);
        System.out.println("bal after repayment "+lc.bal);

    }


}
