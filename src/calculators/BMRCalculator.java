package calculators;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class BMRCalculator {

    public static void main(String[] args) {

        intro();
        start('s');

    }

    public static double computeBMI(double weight,int height){
        double BMI=703*(weight)/(height*height);

        return BMI;

    }
    public static double computeBMR(int age,char bodyType,double weight, int height){
        if (bodyType=='f'||bodyType=='F'){
            double BMR=4.54545*weight+15.875*height-5*age-161;
            return BMR;
        } else if (bodyType=='m'||bodyType=='M') {
            double BMR = 4.54545 * weight + 15.875 * height - 5 * age + 5;
            return BMR;
        }
        else
        {
            return 0;
        }

    }

    public static double computeHighEndHealthyWeight(int height)
    {
        if (height==64||height==67)
        {
            System.out.println("Recommended Weight 110-140lb");
            return 1;
        }
        else if (height==68||height==72)
        {
            System.out.println("Recommended Weight 125-158lb");
            return 1;
        }
        else if (height==73||height==76)
        {
            System.out.println("Recommended Weight 148-186lb");
            return 1;
        }
        else
        {
            return 0;
        }


    }
    public static double computeLowEndHealthyWeight(int height)
    {
        if (height==64||height==67)
        {
            System.out.println("Recommended Weight 100-130lb");
            return 1;
        }
        else if (height==68||height==72)
        {
            System.out.println("Recommended Weight 105-130lb");
            return 1;
        }
        else if (height==73||height==76)
        {
            System.out.println("Recommended Weight 130-160lb");
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void displayResults(Scanner scanner, PrintStream stream)
    {
        String name=getName(scanner);
        int age=getAge(scanner);
        char bodytype=getBodyType(scanner);
        double weight=getWeight(scanner);
        int height= getHeight(scanner);
        stream.println("name:"+ name);
        stream.println("age:"+ age);
        stream.println("bodytype:"+ bodytype);
        stream.println("weight:"+ weight);
        stream.println("height:"+ height);

    }
    public static int getAge(Scanner scanner)
    {
        System.out.println("Enter Age");


        int age=scanner.nextInt();
        return age;

    }
    public static String getBurnRate(double calories)
    {
        if (calories<1200)
        {
            System.out.println("LOW");
            return "LOW";
        }
        else if (calories>=1200||calories<=2000)
        {
            System.out.println("MODERATE");
            return "MODERATE";
        }
        else if (calories>2000)
        {
            System.out.println("HIGH");
            return "HIGH";
        }
        else
        {
            return "";
        }


    }


    public static char getBodyType(Scanner scanner)
    {

        System.out.println("Enter Body Type");



        isValidBodyType(scanner.next());
        //char body=Bodytype.charAt(0);
        return 'm';
    }


    public static int getFeet(String value)
    {
        int feets= Integer.parseInt(value);
        return feets;

    }


    public static int getHeight(Scanner scanner){

        try {
            System.out.println("Enter your height in feet. (e.g, 5 if your height is 5'7) : ");
            String feet = scanner.nextLine();
            int getFeet = getFeet(scanner.nextLine());
            System.out.println(feet);
            System.out.println("Enter your height in inches (e.g, 7 if your height is 5'7) : ");
            int getiches = getInches(scanner.nextLine());
            return getTotalHeightInInches(getFeet, getiches);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return 0;

    }

    public static int getInches(String value)
    {
        int inches=Integer.parseInt(value);
        return inches;
    }
    public static String getName(Scanner scanner)
    {

        System.out.println("Enter First Name");
        String firstname=scanner.nextLine();

        System.out.println("Enter Last Name");
        String lastname=scanner.nextLine();
        return firstname+lastname;
    }
    public static int getTotalHeightInInches(int feet,int inches)
    {
        int feetintooininches=feet*12;
        return feetintooininches+inches;


    }
    public static double getWeight(Scanner scanner)
    {

        try {
            System.out.println("Enter weight in lbs");


            double weight = scanner.nextDouble();
            return weight;
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }
    public static String getWeightCategory(double results)
    {
        if (results<18.5)
        {
            System.out.println("UNDERWEIGHT");
            return "UNDERWEIGHT";
        }
        else if (results>=18.5 && results<=24.9)
        {
            System.out.println("HEALTHY");
            return "HEALTHY";
        }
        else if (results>=25.0&&results<=29.9)
        {
            System.out.println("OVERWEIGHT");
            return "OVERWEIGHT";
        }
        else
        {
            System.out.println("OBESE");
            return "OBESE";
        }


    }
    public static void intro()
    {
        String intro="Welcome to BMR Calculator";
        System.out.println(intro);

    }
    public static boolean isValidBodyType(String value)
    {
        try {
            if (Objects.equals(value, "M") || Objects.equals(value, "m"))
            {
                return true;
            } else if (Objects.equals(value, "F") || Objects.equals(value, "f")) {
                return true;
            }
            else
            {
                System.out.println("Wrong body Type");
                System.exit(0);
                return false;
            }
        }catch (Exception e)
        {
            System.out.println("Wrong input");
            return false;
        }

    }

    public static boolean isValidHeight(String value){
        try {
            getFeet(value);
            getInches(value);
            return true;
        }catch (Exception exception){
            System.out.println("Try Something like 5'6");
            return false;
        }
    }


    public static boolean isValidInteger(String value)
    {
        try {
            Integer.parseInt(value);
            return true;

        }catch (Exception e)
        {
            System.out.println("Wrong input");
            return false;
        }
    }

    public static boolean isValidWeight(String value){
        try {
            //Test for the error first
            Double.parseDouble(value);
            return true;
        }catch (Exception exception){
            //If it returns an error, give a response and return a false value
            System.out.println("Try a real number like 134.2");
            return false;
        }
    }

    public static char start(char key){
        if (key=='s') {
            Scanner myObj   = new Scanner(System.in);
            String name     =getName(myObj);
            int age         =getAge(myObj);
            char bodytype   =getBodyType(myObj);
            double weight   =getWeight(myObj);
            int height      = getHeight(myObj);
            System.out.println("The Body Mass Index(BMI) is used to calculate weight related health problems in conjunction with other indicators such as BMR");
            System.out.println("The Body Metabolic Rate(BMR) is number of calories a body burns in 24 hours while at rest.");
            System.out.println("Enter q to Exit or press any key to continue:");
            String key1;
            key1=myObj.nextLine();
            if (Objects.equals(key1, "q")){

                return key;
            }
            else{
                double bmi= computeBMI(weight,height);
                double bmr= computeBMR(age,bodytype,weight,height);

                System.out.println("BMI:"+bmi);
                System.out.println("BMR:+"+bmr);
                System.out.println(getWeightCategory(bmi));
                System.out.println(computeHighEndHealthyWeight(height));
                System.out.println(computeLowEndHealthyWeight(height));
                System.out.println("Enter Your Caloric intake");
                getBurnRate(myObj.nextInt());
                return key;
            }

        }
        else if (key=='q')
        {
            System.exit(0);
            return key;
        }
        else
        {
            System.exit(0);
            return key;
        }
    }

}
