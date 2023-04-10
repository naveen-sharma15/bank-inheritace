package myoops;

class fourWheeler{
    String height;
    String weight;
    fourWheeler(String ht,String wt)
    {
        height=ht;
        weight=wt;
    }
}
class publicV extends fourWheeler{
    String ticket,fare;
    publicV(String ht,String wt,String t,String f)
    {
        super(ht,wt);
        ticket=t;
        fare=f;
    }
}
class privateV extends fourWheeler{
    String petrolPrice;
    privateV(String ht,String wt,String pp)
    {
        super(ht,wt);
        petrolPrice=pp;
    }
}
class bus extends publicV{
    String duration;
    bus(String ht,String wt,String t,String f,String d)
    {
        super(ht,wt,t,f);
        duration=d;
    }
    void display1()
    {
        System.out.println("height of bus is "+height);
        System.out.println("weight of bus is "+weight);
        System.out.println("ticket from "+ticket);
        System.out.println("total fare is "+fare);
        System.out.println("total travel duration is "+duration);
    }
}
class minibus extends publicV{
    String source,destination;
    minibus(String ht,String wt,String t,String f,String s,String d) {
        super(ht, wt, t, f);
        source = s;
        destination = d;
    }
    void display2()
    {
        System.out.println("height of minibus is "+height);
        System.out.println("weight of minibus is "+weight);
        System.out.println("ticket from "+ticket);
        System.out.println("total fare is "+fare);
        System.out.println("source from "+source);
        System.out.println("last destination is "+destination);
    }
}
class tata extends privateV{
    String colour;
    tata(String ht,String wt,String pp,String c)
    {
        super(ht,wt,pp);
        colour=c;
    }
void display3()
{
    System.out.println("height of tata car is "+height);
    System.out.println("weight of tata car is "+weight);
    System.out.println("petrol price of tata car is "+petrolPrice);
    System.out.println("colour of tata car is "+colour);
}
}
class maruti extends privateV{
    String mileage;
    maruti(String ht,String wt,String pp,String m )
    {
        super(ht,wt,pp);
        mileage=m;
    }
}
class swift extends  maruti{
    String mfd;
    swift(String ht,String wt,String pp,String m,String md)
    {
        super(ht,wt,pp,m);
        mfd=md;
    }
    void display4(){
        System.out.println("swift car height will be :"+height);
        System.out.println("swift car weight will be :"+weight);
        System.out.println("price of petrol:"+petrolPrice);
        System.out.println("mileage of a swift car will be :"+mileage);
        System.out.println("manufacturing date will be :"+mfd);
    }
}
class dezire extends maruti{
    String gear;
    dezire(String ht,String wt,String pp,String m,String g){
        super(ht,wt,pp,m);
        gear=g;
    }
    void display5(){
        System.out.println("desire car height will be :"+height);
        System.out.println("desire car weight will be:"+weight);
        System.out.println("price of petrol for a desire car :"+petrolPrice);
        System.out.println("mileage of a desire car will be :"+mileage);
        System.out.println("no of gears in the desire car will be :"+gear);
    }
}

public class fourwheelers {
    public static void main(String[] args) {
        bus b=new bus("25ft","200kg","kolkata","240 rs","2 hour");
        b.display1();
        System.out.println();
        minibus m =new minibus("22ft","200kg","jaipur","600rs","jaipur","lucknow");
        m.display2();
        System.out.println();
        tata t=new tata("10ft","175kg","107rs/l","blue");
        t.display3();
        System.out.println();
        swift s=new swift("15ft","121kg","107rs/l","25km/hr","2019");
        s.display4();
        System.out.println();
        dezire d=new dezire("16ft","128kg","107rs/l","22km/hr","6");
        d.display5();

    }
}
