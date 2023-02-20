package org.example;
import java.util.*;
import java.text.DecimalFormat;

public class Conversion {
    public static void main(String[] args) {
        double amount;
        double rupee, dollar, pound, euro, yen, ringgit, Saudi_Riyal, Ruble, Kuwaiti_Dinars, Egyptian_Pounds;

        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Ruppe");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5: Yen");
        System.out.println("Enter 6: Ringgit");
        System.out.println("Enter 7: Saudi Riyal");
        System.out.println("Enter 8: Ruble");
        System.out.println("Enter 9: Kuwaiti Dinars");
        System.out.println("Enter 10: Egyptian Pounds");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice)
        {
            case 1:  // Ruppe Conversion
                dollar = amount * 0.012;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                pound = amount * 0.010;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                euro = amount * 0.011;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");

                yen = amount * 1.62;
                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

                ringgit = amount * 0.054;
                System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 0.045;
                System.out.println(amount + " Rupee = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 0.89;
                System.out.println(amount + " Rupee = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.0037;
                System.out.println(amount + " Rupee = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 0.37;
                System.out.println(amount + " Rupee = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 2:  // Dollar Conversion
                rupee = amount * 81.52;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");

                pound = amount * 0.81;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount * 0.92;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yen = amount * 129.95;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                ringgit = amount * 4.24;
                System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 3.75;
                System.out.println(amount + " Dollar = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 69.52;
                System.out.println(amount + " Dollar = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.31;
                System.out.println(amount + " Dollar = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 29.89;
                System.out.println(amount + " Dollar = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 3:  // Pound Conversion
                rupee = amount * 101.03;
                System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");

                dollar = amount * 1.24;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount * 1.14;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");

                yen = amount * 161.03;
                System.out.println(amount + " pound = " + f.format(yen) + " Yen");

                ringgit = amount * 5.26;
                System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 4.65;
                System.out.println(amount + " pound = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 86.16;
                System.out.println(amount + " pound = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.38;
                System.out.println(amount + " pound = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 37.04;
                System.out.println(amount + " pound = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 4:  // Euro Conversion
                rupee = amount * 88.89;
                System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");

                dollar = amount * 1.09;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                pound = amount * 0.88;
                System.out.println(amount + " euro = " + f.format(pound) + " Pound");

                yen = amount * 141.68;
                System.out.println(amount + " euro = " + f.format(yen) + " Yen");

                ringgit = amount * 4.63;
                System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 4.09;
                System.out.println(amount + " euro = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 75.80;
                System.out.println(amount + " euro = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.33;
                System.out.println(amount + " euro = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 32.58;
                System.out.println(amount + " euro = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 5:  // Yen Conversion
                rupee = amount * 0.63;
                System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.0077;
                System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

                pound = amount * 0.0062;
                System.out.println(amount + " yen = " + f.format(pound) + " Pound");

                euro = amount * 0.0071;
                System.out.println(amount + " yen = " + f.format(euro) + " Euro");

                ringgit = amount * 0.033;
                System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 0.029;
                System.out.println(amount + " yen = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 0.54;
                System.out.println(amount + " yen = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.0055;
                System.out.println(amount + " yen = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 0.23;
                System.out.println(amount + " yen = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 6:  // Ringgit Conversion
                rupee = amount * 19.25;
                System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.24;
                System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");

                pound = amount * 0.19;
                System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");

                euro = amount * 0.22;
                System.out.println(amount + " ringgit = " + f.format(euro) + " euro");

                yen = amount * 30.69;
                System.out.println(amount + " ringgit = " + f.format(yen) + " yen");

                Saudi_Riyal = amount * 0.88;
                System.out.println(amount + " ringgit = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 16.38;
                System.out.println(amount + " ringgit = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.072;
                System.out.println(amount + " ringgit = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 7.04;
                System.out.println(amount + " ringgit = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 7:  // Saudi Riyal Conversion
                rupee = amount * 21.71;
                System.out.println(amount + " SAR = " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.27;
                System.out.println(amount + " SAR = " + f.format(dollar) + " dollar");

                pound = amount * 0.21;
                System.out.println(amount + " SAR =: " + f.format(pound) + " pound");

                euro = amount * 0.24;
                System.out.println(amount + " SAR = " + f.format(euro) + " euro");

                yen = amount * 34.61;
                System.out.println(amount + " SAR = " + f.format(yen) + " yen");

                ringgit = amount * 1.13;
                System.out.println(amount + " SAR = " + f.format(ringgit) + " ringgit");

                Ruble = amount * 18.52;
                System.out.println(amount + " SAR = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.19;
                System.out.println(amount + " SAR = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 7.96;
                System.out.println(amount + " SAR = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 8:  // Ruble Conversion
                rupee = amount * 1.17;
                System.out.println(amount + " Ruble = " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.014;
                System.out.println(amount + " Ruble = " + f.format(dollar) + " dollar");

                pound = amount * 0.012;
                System.out.println(amount + " Ruble =: " + f.format(pound) + " pound");

                euro = amount * 0.013;
                System.out.println(amount + " Ruble = " + f.format(euro) + " euro");

                yen = amount * 1.87;
                System.out.println(amount + " Ruble = " + f.format(yen) + " yen");

                ringgit = amount * 0.061;
                System.out.println(amount + " Ruble = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 0.054;
                System.out.println(amount + " Ruble = " + f.format(Saudi_Riyal) + " SAR");

                Kuwaiti_Dinars = amount * 0.0044;
                System.out.println(amount + " Ruble = " + f.format(Kuwaiti_Dinars) + " KWD");

                Egyptian_Pounds = amount * 0.43;
                System.out.println(amount + " Ruble = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 9:  // Kuwaiti Dinar Conversion
                rupee = amount * 266.94;
                System.out.println(amount + " KWT = " + f.format(rupee) + " Ruppes");

                dollar = amount * 3.28;
                System.out.println(amount + " KWT = " + f.format(dollar) + " dollar");

                pound = amount * 2.64;
                System.out.println(amount + " KWT =: " + f.format(pound) + " pound");

                euro = amount * 3.00;
                System.out.println(amount + " KWT = " + f.format(euro) + " euro");

                yen = amount * 425.66;
                System.out.println(amount + " KWT = " + f.format(yen) + " yen");

                ringgit = amount * 13.90;
                System.out.println(amount + " KWT = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 12.30;
                System.out.println(amount + " KWT = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 227.75;
                System.out.println(amount + " KWT = " + f.format(Ruble) + " Ruble");

                Egyptian_Pounds = amount * 97.93;
                System.out.println(amount + " KWT = " + f.format(Egyptian_Pounds) + " EGP");
                break;


            case 10:  // Egyptian Pound Conversion
                rupee = amount * 2.73;
                System.out.println(amount + " EGP = " + f.format(rupee) + " Ruppes");

                dollar = amount * 0.033;
                System.out.println(amount + " EGP = " + f.format(dollar) + " dollar");

                pound = amount * 0.027;
                System.out.println(amount + " EGP =: " + f.format(pound) + " pound");

                euro = amount * 0.031;
                System.out.println(amount + " EGP = " + f.format(euro) + " euro");

                yen = amount * 4.35;
                System.out.println(amount + " EGP = " + f.format(yen) + " yen");

                ringgit = amount * 0.14;
                System.out.println(amount + " EGP = " + f.format(ringgit) + " ringgit");

                Saudi_Riyal = amount * 0.13;
                System.out.println(amount + " EGP = " + f.format(Saudi_Riyal) + " SAR");

                Ruble = amount * 2.33;
                System.out.println(amount + " EGP = " + f.format(Ruble) + " Ruble");

                Kuwaiti_Dinars = amount * 0.010;
                System.out.println(amount + " EGP = " + f.format(Kuwaiti_Dinars) + " KWT");
                break;


            //Default case
            default:
                System.out.println("Invalid Input");
        }
    }
}