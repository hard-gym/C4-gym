class monkey{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    monkey(String s)
    {
        this.name=s;
    }
    public void speak()
    {
        System.out.println("咿咿呀呀......");
    }
}
class people extends monkey{
    public people(String b) {
        super(b);
    }

    public void speak()
    {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    void think()
    {
        System.out.println("别说话！认真思考!");
    }
}
public class Task5 {
    public static void main(String args[])
    {
        monkey m=new monkey("dasv");
        System.out.println(m.getName());
        m.speak();
        people n=new people("adfa");
        System.out.println(n.getName());
        n.speak();
        n.think();
    }
}
