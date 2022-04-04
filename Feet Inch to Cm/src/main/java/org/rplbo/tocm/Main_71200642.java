package org.rplbo.tocm;

public class Main_71200642 {
    public static double FeetIncToCm(double feet, double inch) {
        if (feet > 0 && inch > 0 && inch <= 12) {
            double inchtocm =  inch *2.54;
            double feettocm = feet *30.48;
            double total = inchtocm + feettocm;
            System.out.println("Nilai dalam centimeter : "+total+" cm");
            return total;
            }
        else {
            return -1;
        }
        }
    public static double FeetIncToCm(int inch){
        if (inch >0 ){
            double inchtofeed = (double)inch / 12;
            int print = (int)inchtofeed;
            double sisa = (inchtofeed - (int)inchtofeed)*12;
            System.out.println(inch+" inc = " + (double)print + " feet "+ sisa + " inc ");
            return FeetIncToCm((int)inchtofeed,sisa);
            }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
    FeetIncToCm(1,3);
    FeetIncToCm(15);
    FeetIncToCm(12,5);
    FeetIncToCm(30);
    }
}
