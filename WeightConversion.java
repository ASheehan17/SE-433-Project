public class WeightConversion {
    public static double weightLogic(String mode, double num1){
        double out =0;
        if(mode.equals("LBtoKG")){
            out = LBtoKG(num1);
        } else if (mode.equals("KGtoLB")){
            out = KGtoLB(num1);
        } else if (mode.equals("OZtoG")){
            out = OZtoG(num1);
        } else if (mode.equals("GtoOZ")){
            out = GtoOZ(num1);
        }
        return out;

    }
    public static double LBtoKG(double input){
        return input * .453592;
    }
    public static double KGtoLB(double input){
        return input * 2.20462;
    }
    public static double OZtoG(double input){
        return input * 28.3495;
    }
    public static double GtoOZ(double input){
        return input * .035274;
    }
}
