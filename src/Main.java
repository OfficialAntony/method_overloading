public class Main {
    public static void main(String[] arg){
        double Inches=convertToCentimeters(17);
        System.out.println(Inches +" Cm");
       double JustInches= convertToCentimeters(5,8);
       System.out.println(JustInches +" Inches");
    }
    public static double convertToCentimeters(int HeightInch){
        System.out.println(HeightInch +" Inches,Converted to Centimeters = " );
        return HeightInch *2.54;
    }
    public static double convertToCentimeters(int HeightFeet,int HeightInch){
        System.out.println(HeightFeet +" Feet and "+ HeightInch +" Inches, Converted to just inches =");
        return (HeightFeet * 12) +HeightInch;
    }
}