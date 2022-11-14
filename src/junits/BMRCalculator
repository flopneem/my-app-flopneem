package junits;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

// BMI Calculator in Java
// Uses metric units
class BMRCalculator {
    public static double computeBMI(double weight, int height) {
        return 703 * (weight) / (height * height);
    }

    public static double computeBMR(int age, char bodyType, double weight, int height) {
        double bmr = (4.54545) * (weight) + 15.875 * height - 5 * age;
        if (bodyType == 'F')
            return bmr - 161;
        else
            return bmr + 5;


    }

    public static double computeHighEndHealthyWeight(int height) {
        return 0.0;
    }

    public static double computeLowEndHealthyWeight(int height) {
        return 0.0;
    }

    public static void displayResults(String name, int age, char bodyType, double weight, double height){
    }
    public static int getAge(Scanner scanner){
        String value = scanner.next();
        return Integer.parseInt(value);
    }
    public static String getBurnRate(double calories){
        return "";
    }
    public static char getBodyType(Scanner scanner){
        String value = scanner.next();
        return value.toUpperCase().charAt(0);
    }
    public static int getFeet(String value){
        int feetEnd = value.indexOf("'");
        String feetEntry = value.substring(0, feetEnd);
        return Integer.parseInt(feetEntry);
    }
    public static int getHeight(Scanner scanner){
        String value = scanner.next();

        //convert from a string into an integer for both feet and inches values
        int feet = getFeet(value);
        int inches = getInches(value);

        //get the total result and return it in inches
        return getTotalHeightInInches(feet, inches);
    }
    public static int getInches(String value){
        int inchStart = value.indexOf("'") + 1;
        int inchEnd = value.indexOf("\"");
        String inchEntry =  value.substring(inchStart, inchEnd);
        return Integer.parseInt(inchEntry);
    }
    public static String getName(Scanner scanner){
        return scanner.next();
    }
    public static int getTotalHeightInInches(int feet, int inches){
        return 12 * feet + inches;
    }
    public static double getWeight(Scanner scanner){
        String value = scanner.next();
        return Double.parseDouble(value);
    }
    public static String getWeightCategory(double bmiValue){
        return "";
    }
    public static void intro(){

    }
    public static boolean isValidBodyType(String value){
        return false;
    }
    public static boolean isValidHeight(String value){
        return false;
    }
    public static boolean isValidInteger(String value){
        return false;
    }
    public static boolean isValidWeight(String value){
        return false;
    }
    public static char start(char key){
        return 'a';
    }
    public static void toFile() throws FileNotFoundException {

    }


    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, age, body Type in caps, weight and height with spaces");

        String name = getName(scanner);
        int age = getAge(scanner);
        char bodyType = getBodyType(scanner);
        double weight = getWeight(scanner);
        int height = getHeight(scanner);

        System.out.println("Your BMI is "+computeBMI(weight,height));
        System.out.println("Your BMR is "+computeBMR(age,bodyType,weight,height));


    }
}
