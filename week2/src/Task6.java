import java.util.Scanner;

class vehicle{
    private int wheels;
    private double weight;
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public vehicle(int wheels, double weight) {
        super();
        this.wheels = wheels;
        this.weight = weight;
    }
}
class car extends vehicle{
    private double loader=5.0;
    public double getLoader() {
        return loader;
    }
    public void setLoader(double loader) {
        this.loader = loader;
    }

    public car(int wheels, double weight, double loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void situation(double m,double loader)
    {
        if(m<=loader)
            System.out.println("这是一辆小车,能载"+loader+"人,实载"+m+"人");
        else
            System.out.println("这是一辆小车,能载"+loader+"人,实载"+m+"人,你超员了");
    }
}
class trunk extends vehicle{
    private double loader=3.0;
    private double payload=5000.0;
    public double getLoader() {
        return loader;
    }
    public void setLoader(double loader) {
        this.loader = loader;
    }
    public double getPayload() {
        return payload;
    }
    public void setPayload(double payload) {
        this.payload = payload;
    }

    public trunk(int wheels, double weight, double loader, double payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }
    public void situation(double m,double n,double loader,double payload)
    {
        if(m<=loader)
            System.out.println("这是一辆卡车,能载"+loader+"人,实载"+m+"人");
        else
            System.out.println("这是一辆卡车,能载"+loader+"人,实载"+m+"人,你超员了");
        System.out.println();
        if(n<payload)
            System.out.println("这是一辆卡车,核载"+payload+"kg,你已经装载"+n+"kg");
        else
            System.out.println("这是一辆卡车,核载"+payload+"kg,你已经装载"+n+"kg,你超载了");
    }
}
public class Task6 {
//了解super的含义及判断该super是否使用正确
    public static void main(String args[])
    {
        car c=new car(4,1150.0,5);
        System.out.println("车轮个数是:"+c.getWheels()+"车重是:"+c.getWeight());
        c.situation(6, c.getLoader());
        c.situation(4, c.getLoader());
        System.out.println("--------------------");
        trunk t=new trunk(6,15000.0,3,5000);
        System.out.println("车轮个数是:"+t.getWheels()+"车重是:"+t.getWeight());
        t.situation(3,4000,t.getLoader(),t.getPayload());
        t.situation(4,6000, t.getLoader(), t.getPayload());
    }

}
