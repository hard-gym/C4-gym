interface usb{
    void start();
    void stop();
}
 class mouse implements usb{
    @Override
    public void start() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void stop() {
        System.out.println("鼠标关闭了");
    }
}
class keyboard implements usb{
    @Override
    public void start() {
        System.out.println("键盘启动了");
    }

    @Override
    public void stop() {
        System.out.println("键盘关闭了");
    }
}
class microphone implements usb{
    @Override
    public void start() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void stop() {
        System.out.println("麦克风关闭了");
    }
}
class computer{
    private usb[] u=new usb[3];
    public void add(usb item){
        for (int i=0;i<u.length;i++)
        {
            if(u[i]==null){
                u[i]=item;
            break;}
        }
    }
    public void comon(){
        for(int i=0;i<u.length;i++)
        {
            if(u[i]!=null)
                u[i].start();
        }
        System.out.println("电脑开机成功");
    }
    public void comoff(){
        for(int i=0;i< u.length;i++)
        {
            if (u[i]!=null)
                u[i].stop();
        }
        System.out.println("电脑关机成功");
    }
}
public class Task10 {
    public static void main(String args[])
    {
        computer c=new computer();
        c.add(new mouse());
        c.add(new keyboard());
        c.add(new microphone());
        c.comon();
        System.out.println("----------");
        c.comoff();
    }
}
