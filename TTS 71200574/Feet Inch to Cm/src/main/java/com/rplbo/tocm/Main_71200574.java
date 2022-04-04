package com.rplbo.tocm;

public class Main_71200574 {
    class convert {
        static double FeetIncToCm(int Inches) {
            double centimeter;
            centimeter = 2.54 * Inches;
            System.out.printf("Nilai dalam Centimeter: %.2f \n", centimeter);
            return 0;
        }

        static double CmToFeetInch(int centimeter)
        {
            double inch, feet;
            inch  = 0.3937 * centimeter;
            feet = 0.0328 * centimeter;
            System.out.printf("Inches is: %.2f", inch);
            System.out.printf("Feet is: %.2f", feet);
            return 0;
        }

        public static void main(String args[]) {
            int Inches = 15;
            int centimeter = 30;
            FeetIncToCm(Inches);
            CmToFeetInch(centimeter);
        }
}
