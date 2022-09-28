//package junits;
//
//import static calculators.BMRCalculator.clearInput;
//import static calculators.BMRCalculator.calculateBMR;
//import static calculators.BMRCalculator.getHeight;
//import static calculators.BMRCalculator.getWeight;
//import static calculators.BMRCalculator.getLowEndHealthyWeight;
//import static calculators.BMRCalculator.getHighEndHealthyWeight;
//import static calculators.BMRCalculator.start;
//
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//
//public class BMRCalculatorJUnitTest {
//
//    @Test
//    void testCalculateBMI(){
//
//        int  height = getHeight(new Scanner("5,9"));
//
//        double  weight1 = 120.8;
//        double  weight2 = 145.3;
//        double  weight3 = 180.4;
//        double  weight4 = 210.4;
//
//        double bmiValue1 = calculateBMI(height, weight1);
//        double bmiValue2 = calculateBMI(height, weight2);
//        double bmiValue3 = calculateBMI(height, weight3);
//        double bmiValue4 = calculateBMI(height, weight4);
//
//        double expectedBMIValue1 = (weight1 / (height * height)) * 703.0;
//        double expectedBMIValue2 = (weight2 / (height * height)) * 703.0;
//        double expectedBMIValue3 = (weight3 / (height * height)) * 703.0;
//        double expectedBMIValue4 = (weight4 / (height * height)) * 703.0;
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("-------------- TEST VALID INPUT  --------------------");
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmiValue1, expectedBMIValue1);
//        assertEquals(bmiValue1, expectedBMIValue1);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmiValue2, expectedBMIValue2);
//        assertEquals(bmiValue2, expectedBMIValue2);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmiValue3, expectedBMIValue3);
//        assertEquals(bmiValue3, expectedBMIValue3);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmiValue4, expectedBMIValue4);
//        assertEquals(bmiValue4, expectedBMIValue4);
//
//        System.out.println();
//        System.out.println();
//    }
//
//
//    @Test
//    void testCalculateFemaleBMR(){
//
//        int  height = getHeight(new Scanner("5,7"));
//
//        double  weight1 = 120.8;
//        double  weight2 = 145.3;
//        double  weight3 = 180.4;
//        double  weight4 = 210.4;
//
//        int age1 = 24;
//        int age2 = 35;
//        int age3 = 42;
//        int age4 = 61;
//
//        double bmrValue1 = calculateBMR(height, weight1, age1);
//        double bmrValue2 = calculateBMR(height, weight2, age2);
//        double bmrValue3 = calculateBMR(height, weight3, age3);
//        double bmrValue4 = calculateBMR(height, weight4, age4);
//        double bmrValue5 = calculateBMR(height, weight3, age2);
//        double bmrValue6 = calculateBMR(height, weight1, age4);
//        double bmrValue7 = calculateBMR(height, weight4, age3);
//        double bmrValue8 = calculateBMR(height, weight2, age1);
//
//        double expectedBMRValue1 = 4.54545 * weight1 + 15.875 * height - 5 * age1 - 161;
//        double expectedBMRValue2 = 4.54545 * weight2 + 15.875 * height - 5 * age2 - 161;
//        double expectedBMRValue3 = 4.54545 * weight3 + 15.875 * height - 5 * age3 - 161;
//        double expectedBMRValue4 = 4.54545 * weight4 + 15.875 * height - 5 * age4 - 161;
//        double expectedBMRValue5 = 4.54545 * weight3 + 15.875 * height - 5 * age2 - 161;
//        double expectedBMRValue6 = 4.54545 * weight1 + 15.875 * height - 5 * age4 - 161;
//        double expectedBMRValue7 = 4.54545 * weight4 + 15.875 * height - 5 * age3 - 161;
//        double expectedBMRValue8 = 4.54545 * weight2 + 15.875 * height - 5 * age1 - 161;
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("-------------- TEST VALID INPUT  --------------------");
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue1, expectedBMRValue1);
//        assertEquals(bmrValue1, expectedBMRValue1);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue2, expectedBMRValue2);
//        assertEquals(bmrValue2, expectedBMRValue2);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue3, expectedBMRValue3);
//        assertEquals(bmrValue3, expectedBMRValue3);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue4, expectedBMRValue4);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue5, expectedBMRValue5);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue6, expectedBMRValue6);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue7, expectedBMRValue7);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue8, expectedBMRValue8);
//
//        System.out.println();
//        System.out.println();
//    }
//
//    @Test
//    void testCalculateMaleBMR(){
//
//        int  height = getHeight(new Scanner("5,10"));
//
//        double  weight1 = 120.8;
//        double  weight2 = 145.3;
//        double  weight3 = 180.4;
//        double  weight4 = 210.4;
//
//        int age1 = 24;
//        int age2 = 35;
//        int age3 = 42;
//        int age4 = 61;
//
//        double bmrValue1 = calculateBMR(height, weight1, age1);
//        double bmrValue2 = calculateBMR(height, weight2, age2);
//        double bmrValue3 = calculateBMR(height, weight3, age3);
//        double bmrValue4 = calculateBMR(height, weight4, age4);
//        double bmrValue5 = calculateBMR(height, weight3, age2);
//        double bmrValue6 = calculateBMR(height, weight1, age4);
//        double bmrValue7 = calculateBMR(height, weight4, age3);
//        double bmrValue8 = calculateBMR(height, weight2, age1);
//
//        double expectedBMRValue1 = 4.54545 * weight1 + 15.875 * height - 5 * age1 + 5;
//        double expectedBMRValue2 = 4.54545 * weight2 + 15.875 * height - 5 * age2 + 5;
//        double expectedBMRValue3 = 4.54545 * weight3 + 15.875 * height - 5 * age3 + 5;
//        double expectedBMRValue4 = 4.54545 * weight4 + 15.875 * height - 5 * age4 + 5;
//        double expectedBMRValue5 = 4.54545 * weight3 + 15.875 * height - 5 * age2 + 5;
//        double expectedBMRValue6 = 4.54545 * weight1 + 15.875 * height - 5 * age4 + 5;
//        double expectedBMRValue7 = 4.54545 * weight4 + 15.875 * height - 5 * age3 + 5;
//        double expectedBMRValue8 = 4.54545 * weight2 + 15.875 * height - 5 * age1 + 5;
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("-------------- TEST VALID INPUT  --------------------");
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue1, expectedBMRValue1);
//        assertEquals(bmrValue1, expectedBMRValue1);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue2, expectedBMRValue2);
//        assertEquals(bmrValue2, expectedBMRValue2);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue3, expectedBMRValue3);
//        assertEquals(bmrValue3, expectedBMRValue3);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue4, expectedBMRValue4);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue5, expectedBMRValue5);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue6, expectedBMRValue6);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue7, expectedBMRValue7);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", bmrValue4, expectedBMRValue4);
//        assertEquals(bmrValue8, expectedBMRValue8);
//
//        System.out.println();
//        System.out.println();
//    }
//
//
//    @Test
//    void testClearInput(){
//        String line   = "----------- ";
//        String _info  = "CLEAR INPUT";
//        String _start = "START | ";
//        String _test  = " TEST ";
//        String _end   = "END   | ";
//
//        System.out.println();
//        System.out.printf("\n%s %s %s %s %s\n", line, _start, _info, _test, line);
//
//        // TEST : INPUT WITH RANDOM STRING OF VALUES
//        String str1       = "8pop, 95" ;
//        String str2       = "115, -95.20, 38" ;
//        Scanner scanner1  = new Scanner(str1);
//        Scanner scanner2  = new Scanner(str2);
//
//        scanner1.useDelimiter(", ");
//        scanner2.useDelimiter(", ");
//
//        assertEquals("pop95", clearInput(new Scanner("pop95")));
//        System.out.println();
//        System.out.printf("\n%s %s %s %s %s\n", line, _end, _info, _test, line);
//        System.out.println();
//    }
//
//
//    @Test
//    void testGetHeight(){
//
//        System.out.println("************* START -> TEST HEIGHT ******************");
//
//        double  height1 = 12 * 5 + 9;   // 5ft , 9 in.
//        double  height2 = 12 * 4 + 10;  // 4ft , 10 in.
//        double  height3 = 12 * 6 + 11;  // 6ft , 11 in.
//
//        System.out.println();
//        System.out.println("++++++++++++++++ TEST VALID ENTRY  ++++++++++++++++++");
//        assertEquals(height1, getHeight(new Scanner("5 ft, 9 in")));
//        assertEquals(height2, getHeight(new Scanner("4 ft, 10 in")));
//        assertEquals(height3, getHeight(new Scanner("6 ft, 11 in")));
//        System.out.println("\nSUCCESS\n");
//
//        System.out.println();
//        System.out.println("++++++++++++++++ TEST INVALID ENTRY  ++++++++++++++++++");
//
//        String  inputValues = "5,6\nfin5,8\nfeet5.7\n5,6inches\n5 ft, 9 in";
//        Scanner scanner     = new Scanner(inputValues);
//        scanner.useDelimiter("\n");
//
//        assertEquals(height1, getHeight(scanner));
//        assertThrows(Exception.class, () -> getHeight(new Scanner("5ft9inches")));
//
//        System.out.println();
//        System.out.println("\nSUCCESS\n");
//        System.out.println();
//        System.out.println("*************** END -> TEST HEIGHT ******************");
//        System.out.println();
//    }
//
//
//    @Test
//    void testGetHighEndHealthyWeight(){
//
//        System.out.println("******* START -> TEST HEALTHY WEIGHT HIGH END ********");
//
//        int  height1 = getHeight(new Scanner("5,9"));
//        int  height2 = getHeight(new Scanner("5,1"));
//        int  height3 = getHeight(new Scanner("5,8"));
//
//        double  weight1 = getHighEndHealthyWeight(height1);
//        double  weight2 = getHighEndHealthyWeight(height2);
//        double  weight3 = getHighEndHealthyWeight(height3);
//
//        double  expectedWeight1 = (24.9 / 703.0) * (height1 * height1);
//        double  expectedWeight2 = (24.9 / 703.0) * (height2 * height2);
//        double  expectedWeight3 = (24.9 / 703.0) * (height3 * height3);
//
//        System.out.println();
//        System.out.println();
//        System.out.println("-------------- TEST VALID INPUT  --------------------");
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight1, expectedWeight1);
//        assertEquals(weight1, expectedWeight1);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight2, expectedWeight2);
//        assertEquals(weight2, expectedWeight2);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight3, expectedWeight3);
//        assertEquals(weight3, expectedWeight3);
//
//        System.out.println();
//        System.out.println();
//        System.out.println("***************** END -> TEST WEIGHT ******************");
//        System.out.println();
//        System.out.println();
//    }
//
//
//    @Test
//    void testGetLowEndHealthyWeight(){
//
//        System.out.println("******* START -> TEST HEALTHY WEIGHT HIGH END ********");
//
//        int  height1 = getHeight(new Scanner("5,9"));
//        int  height2 = getHeight(new Scanner("5,1"));
//        int  height3 = getHeight(new Scanner("5,8"));
//
//        double  weight1 = getLowEndHealthyWeight(height1);
//        double  weight2 = getLowEndHealthyWeight(height2);
//        double  weight3 = getLowEndHealthyWeight(height3);
//
//        double  expectedWeight1 = (18.5 / 703.0) * (height1 * height1);
//        double  expectedWeight2 = (18.5 / 703.0) * (height2 * height2);
//        double  expectedWeight3 = (18.5 / 703.0) * (height3 * height3);
//
//        System.out.println();
//        System.out.println();
//        System.out.println("-------------- TEST VALID INPUT  --------------------");
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight1, expectedWeight1);
//        assertEquals(weight1, expectedWeight1);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight2, expectedWeight2);
//        assertEquals(weight2, expectedWeight2);
//        System.out.printf("Actual : %5.1f    ,    Expected : %5.1f \n", weight3, expectedWeight3);
//        assertEquals(weight3, expectedWeight3);
//
//        System.out.println();
//        System.out.println();
//        System.out.println("***************** END -> TEST WEIGHT ******************");
//        System.out.println();
//        System.out.println();
//    }
//
//
//    @Test
//    void testGetWeight(){
//
//        System.out.println("************* START -> TEST WEIGHT ******************");
//
//        double  weight1 = 120.8;
//        double  weight2 = 145.3;
//        double  weight3 = 181.4;
//
//        System.out.println();
//        System.out.println("++++++++++++++++ TEST VALID INPUT  ++++++++++++++++");
//        assertEquals(weight1, getWeight(new Scanner("120.8")));
//        assertEquals(weight2, getWeight(new Scanner("145.3")));
//        assertEquals(weight3, getWeight(new Scanner("181.4 lbs")));
//        System.out.println("\nSUCCESS\n");
//        System.out.println();
//
//        System.out.println("++++++++++++++++ TEST INVALID INPUTS  ++++++++++++++++++");
//        String values = "pop95, globe81, true, 'a', 145.8";
//        Scanner scanner = new Scanner(values);
//        scanner.useDelimiter(", ");
//
//        assertEquals(145.8, getWeight(new Scanner(values)));
//        assertThrows(NoSuchElementException.class, () -> getWeight(new Scanner("push85")));
//        assertThrows(NoSuchElementException.class, () -> getWeight(new Scanner("156.34pop")));
//        System.out.println("\nSUCCESS\n");
//        System.out.println();
//
//        System.out.println("***************** END -> TEST WEIGHT ******************");
//        System.out.println();
//        System.out.println();
//    }
//
//
//    @Test
//    void testStart(){
//
//        System.out.println("************* START -> START ******************");
//        System.out.println();
//        System.out.println();
//        System.out.println("++++++++++++++++ SHOW OUTPUT  ++++++++++++++++++");
//        System.out.printf("Start -> STOP : %s", start('q'));
//        assertEquals('q', start('q'));
//        System.out.println();
//        System.out.println("***************** END -> TEST WEIGHT ******************");
//        System.out.println();
//        System.out.println();
//    }
//
//}
