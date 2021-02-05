class poultry
{
    private String name;
    private String illness;
    private String symptom;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public String getSymptom() {
        return symptom;
    }
    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public poultry(String name, String illness, String symptom, int age) {
        super();
        this.name = name;
        this.illness = illness;
        this.symptom = symptom;
        this.age = age;
    }

    public void showsymptom()
    {
    }
    public void showmsg(String name,String illness,int age)
    {
        System.out.println("动物种类:"+name+",年龄:"+age);
        System.out.println("入院原因:"+illness);
    }
}
class duck extends poultry
{
    public duck(String name, String illness, String symptom, int age) {
        super(name, illness, symptom, age);
    }
    public void showsymptom()
    {
        System.out.println("症状为:"+getSymptom());
    }
}
public class Task7 {
    public static void main(String args[])
    {
        duck a=new duck("hello","发烧","感冒",11);
        a.showmsg("hello","发烧",11);
        a.showsymptom();
    }
}
