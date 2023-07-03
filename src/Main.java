import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 24;
        int intDifferent = 35;
        int intQuotient = 46;
        int intModulo = 57;
        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum = 5.50;
        double doubleProduct = 6.50;
        double doubleDifferent = 7.50;
        double doubleQuotient = 8.50;
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifferent = intOperandB - intOperandA;
        intQuotient = intOperandB / intOperandA;
        intModulo = intOperandB % intOperandA;

        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The multiplication using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The subtraction using ints of " + intOperandA + " " + intOperandB + " is " + intDifferent);
        System.out.println("The  division ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The percentage using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifferent = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The sum using ints of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The multiplication using ints of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The subtraction using ints of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifferent);
        System.out.println("The  division ints of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("----------------------------------------");

        // Part 1.b
        int KidsInFamily = 3;
        boolean isRaining = true;
        double priceOfGas = 2.99;
        int favoriteNumber = 0;
        double shoeSize = 8.0;
        String birthMonth = "January";
        String fullName = "Chau Ngoc Hoang Thy";

        System.out.println("The number of kids in my house is: " + KidsInFamily);
        System.out.println("Is it raining?" + isRaining);
        System.out.println("Price of a gallon of gas: $" + priceOfGas);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Shoe size: " + shoeSize);
        System.out.println("Birth month: " + birthMonth);
        System.out.println("Full name: " + fullName);





    }
}

