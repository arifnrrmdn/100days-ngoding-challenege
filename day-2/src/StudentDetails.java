public class StudentDetails {

    private String name;
    private int age;
    private String major;

    StudentDetails(){

    }

    // getter setter name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //getter setter age
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // getter setter major
    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    // show profile student
    public void showProfileStudent(){
        System.out.println("Nama    : " + getName());
        System.out.println("Usia    : " + getAge());
        System.out.println("Jurusan : " + getMajor());
    }


}
