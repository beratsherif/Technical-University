import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.##");
        double amount,converted;

        String currencyToConvert,currencyFromConvert;
        System.out.println("which currency You want to Convert ? ");
        currencyFromConvert= sc.nextLine();

        System.out.println("To which currency You want to Convert ? ");
        currencyToConvert= sc.nextLine();

        System.out.println("How much Money you want to convert ?");
        amount= Double.parseDouble(sc.nextLine());

        if(currencyFromConvert.equals("BGN")){
            if(currencyToConvert.equals("EUR")){
                converted= amount*0.51;
                System.out.println("Your " + amount + " lv is : " + f.format(converted) + " Euro");
            }
            if(currencyToConvert.equals("AUD")){
                converted= amount*1.28;
                System.out.println("Your " + amount + " lv is : " + f.format(converted) + " Australian dollar");
            }
            if(currencyToConvert.equals("TRY")){
                converted= amount*0.11;
                System.out.println("Your " + amount + " lv is : " + f.format(converted) + " Turkish lira");
            }
        }
        else if(currencyFromConvert.equals("EUR")){
            if(currencyToConvert.equals("BGN")){
                converted= amount*1.96;
                System.out.println("Your " + amount + " euro is : " + f.format(converted) + " Bulgarian lev");
            }
            if(currencyToConvert.equals("AUD")){
                converted= amount*1.53;
                System.out.println("Your " + amount + " euro is : " + f.format(converted) + " Australian dollar");
            }
            if(currencyToConvert.equals("TRY")){
                converted= amount*18.37;
                System.out.println("Your " + amount + " euro is : " + f.format(converted) + " Turkish lira");
            }
        }
        else if(currencyFromConvert.equals("AUD")){
            if(currencyToConvert.equals("BGN")){
                converted= amount*1.28;
                System.out.println("Your " + amount + " Australian dollar is : " + f.format(converted) + " Bulgarian lev");
            }
            if(currencyToConvert.equals("EUR")){
                converted= amount*0.65;
                System.out.println("Your " + amount + " Australian dollar is : " + f.format(converted) + " Euro");
            }
            if(currencyToConvert.equals("TRY")){
                converted= amount*12.01;
                System.out.println("Your " + amount + " Australian dollar is : " + f.format(converted) + " Turkish lira");
            }
        }
        else if(currencyFromConvert.equals("TRY")){
            if(currencyToConvert.equals("BGN")){
                converted= amount*0.11;
                System.out.println("Your " + amount + " Turkish lira is : " + f.format(converted) + " Bulgarian lev");
            }
            if(currencyToConvert.equals("EUR")){
                converted= amount*0.054;
                System.out.println("Your " + amount + " Turkish lira is : " + f.format(converted) + " Euro");
            }
            if(currencyToConvert.equals("AUD")){
                converted= amount*0.083;
                System.out.println("Your " + amount + " Turkish lira is : " + f.format(converted) + " Australian dollar");
            }
        }

    }
}