//完全抄书上的，题目看不懂π_π
class Message{
    private String title;
    private String content;
    private boolean flag=true;//flag=true表示可以生产，但是不能取走，flag=false表示可以取走，但是不能生产
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public synchronized void set(String title,String content){
        if(this.flag==false){//已经生产过了，不能生产
            try{
                super.wait();//等待
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.title=title;
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;//已经生产完成，修改标志位
        super.notify();//唤醒生产线程
    }
    public synchronized void get(){
        if(this.flag==true){//未生产，不能取走
            try{
                super.wait();//等待
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
        this.flag=true;//已经取走了，可以继续生产
        super.notify();//唤醒等待线程
    }
}
class Producer implements Runnable{       //定义生产者
    private Message msg=null;

    public Producer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int x=0;x<50;x++){//生产50次数据
            if(x%2==0){
                this.msg.set("李兴华","Java讲师");//设置属性
            }
            else{
                this.msg.set("mldn","www.mldnjava.com");//设置属性
            }
        }
    }
}
class Consumer implements Runnable{//定义消费者
    private Message msg=null;

    public Consumer(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){//取走50次数据
            this.msg.get();//取得属性
        }
    }
}
public class Task11 {
    public static void main(String[] args) throws Exception{
        Message msg=new Message();
        new Thread(new Producer(msg)).start();//启动生产者线程
        new Thread(new Consumer(msg)).start();//启动消费者线程
    }
}