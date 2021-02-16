import java.util.ArrayList;

class  Information{
    private int id;
    private String name;
    private int salary;
    private String managerid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public Information(int id, String name, int salary, String managerid) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managerid = managerid;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", managerid='" + managerid + '\'' +
                '}';
    }

    public Information() {
    }
}
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Information> p=new ArrayList<>();
        p.add(new Information(1,"joe",7000,"513"));
        p.add(new Information(2,"herry",8000,"555"));
        p.add(new Information(3,"bob",1000,null));
        System.out.println(p);
    }
}
