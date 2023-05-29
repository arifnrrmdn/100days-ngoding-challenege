public class MainApp {
    public static void main(String[] args){

        StudentDetails student1 = new StudentDetails();
        student1.setName("Abdul");
        student1.setAge(20);
        student1.setMajor("Computer Science");

        StudentDetails student2 = new StudentDetails();
        student2.setName("Alex");
        student2.setAge(18);
        student2.setMajor("Information Technology");

        student1.showProfileStudent();
        student2.showProfileStudent();

    }
}
