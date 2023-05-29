import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthDateToAge {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth date in formate yyyy-MM-dd: ");
        String birthDate = sc.nextLine();

        System.out.println("Your age is " + convertDatetoAge(birthDate));

        sc.close();
    }

    public static int convertDatetoAge(String birthDate){

        LocalDate parseBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(parseBirthDate,currentDate);
        return period.getYears();
    }
}
