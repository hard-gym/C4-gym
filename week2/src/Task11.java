import java.util.Scanner;
abstract class animal {
    public  String species;  //种类
    public  String name;    //名字
    public  String sex;  //雌雄
    public  int age;  //年龄
    public animal() {

    }
    public animal(String species,String name,String sex,int age) {
        this.species=species;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public abstract void pet1();

    public void setspecies(String species) {
        this.species=species;
    }
    public String getspecies() {
        return species;
    }

    public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return name;
    }

    public void setsex(String sex) {
        this.sex=sex;
    }
    public String getsex() {
        return sex;
    }

    public void setage(int age) {
        this.age=age;
    }
    public int getage() {
        return age;
    }
}
class shop extends animal{

    public shop(String species,String name,String sex,int age) {
        super(species, name, sex,age);
    }

    public void pet1() {
        System.out.println("宠物种类："+species+"\t宠物名称："+name+"\t宠物性别"+sex+"\t宠物年龄"+age+"岁");
    }
    static shop doug1=new shop("金毛","豆豆","雄性",1);
    static shop doug2=new shop("牧羊犬","花花","雌性",2);
    static shop doug3=new shop("泰迪","毛毛","雄性",1);
    static shop doug4=new shop("二哈","笨笨","雌性",2);
    static shop cat1=new shop("加菲猫","胖胖","雄性",1);
    static shop cat2=new shop("波斯猫","玲玲","雌性",2);
}
class downshop {
    public static void XJ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("现在本店有以下宠物：");
        shop.doug1.pet1();
        shop.doug2.pet1();
        shop.doug3.pet1();
        shop.doug4.pet1();
        shop.cat1.pet1();
        shop.cat2.pet1();
        System.out.println("请您选择要下架的宠物名称");
        String name = scanner.next();
        System.out.println("您好，您已成功下架名字为："+name+"的宠物");
    }
}
class upshop {
    public static  String species;  //种类
    public static String name;    //名字
    public static String sex;  //雌雄
    public static int age;  //年龄
    public static  void SJ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要上架宠物的种类：");
        species=scanner.next();
        System.out.println("请输入你要上架宠物的名字：");
        name=scanner.next();
        System.out.println("请输入你要上架宠物的雌雄：");
        sex=scanner.next();
        System.out.println("请输入你要上架宠物的年龄：");
        age=scanner.nextInt();
        shop cw=new shop(species,name,sex,age);
        System.out.println("恭喜您，您已经成功上架：");
        cw.pet1();
        System.out.println("现在本商店有：");
        shop.doug1.pet1();
        shop.doug2.pet1();
        shop.doug3.pet1();
        shop.doug4.pet1();
        shop.cat1.pet1();
        shop.cat2.pet1();
        cw.pet1();
    }
}
class 查询类 {
    public static void CX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("尊敬的顾客您好，我会为您提供最优的服务");
        System.out.println("1：查询本店宠物种类\t2：查询本店宠物信息");
        int n = scanner.nextInt();
        if(n==1) {
            System.out.println("尊敬的顾客，目前本店有：1、宠物狗\t2、宠物猫");
        }
        if(n==2) {
            System.out.println("请输入您要查询宠物的种类信息：");
            String name = scanner.next();
            if(name.equals("狗")||name.equals("gou")) {
                System.out.println("本店提供"+name+"的品种为：");
                shop.doug1.pet1();
                shop.doug2.pet1();
                shop.doug3.pet1();
                shop.doug4.pet1();
            }
            else if(name.equals("猫")||name.equals("mao")) {
                System.out.println("本店提供"+name+"的品种为：");
                shop.cat1.pet1();
                shop.cat2.pet1();
            }
            else {
                System.out.println("给常抱歉，本店不能提供你所需要的宠物："+name);
            }
        }
    }

}
public class Task11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("**********欢迎来到宠物商店在线系统**********");
        System.out.println("我们将为您提供最优秀的服务，请您做以下选择");
        System.out.println("1：员工登录\t2:尊敬的顾客");
        int i = in.nextInt();
        if(i==1){
            System.out.println("亲爱的员工您好，请选择您要进行的操作：");
            System.out.println("1：对宠物进行上架操作\t2：对宠物进行下架操作");
            int n = in.nextInt();
            if(n==1) {
                //转到上架类
                upshop.SJ();
            }
            if(n==2) {
                //转到下架类
                downshop.XJ();
            }
        }
        if(i==2) {
            查询类.CX();
        }
    }
}
