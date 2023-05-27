import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Rupiah");
        System.out.println("Enter 2 for Dollar");
        System.out.println("Enter 3 for Euro");
        System.out.println("Choose the currency");

        // getting input user
        int choice = sc.nextInt();
        System.out.println("Enter the amount: ");
        double amount = sc.nextInt();

        // define a switch case to get a choice from user
        switch (choice){
            case 1:
                rupiahToOther(amount);
                break;
            case 2:
                dollarToOther(amount);
                break;
            case 3:
                euroToOther(amount);
                break;
        }
        sc.close();
    }

    public static void rupiahToOther(double amount){
        System.out.println("1 rupiah = " + 0.000067 + " dollar \n");
        System.out.println(amount + " rupiah " + (amount*0.000067) + " dolar \n");

        System.out.println("1 rupiah = " + 0.000062 + " euro \n");
        System.out.println(amount + " rupiah " + (amount*0.000062) + " euro \n");
    }

    public static void dollarToOther(double amount){
        System.out.println("1 dollar = " + 14.950 + " rupiah \n");
        System.out.println(amount + " dollar " + (amount*14.950) + " rupiah\n");

        System.out.println("1 dollar = " + 0.95 + " euro\n");
        System.out.println(amount + " dolar " + (amount*0.95) + " euro\n");
    }

    public static void euroToOther(double amount){
        System.out.println("1 euro = " + 16.032 + " rupiah");
        System.out.println(amount + " euro " + (amount*16.032) + " rupiah");

        System.out.println("1 euro = " + 1.07 + " dolar \n");
        System.out.println(amount + " euro " + (amount*1.07) + " dolar\n");
    }
}
