import java.lang.*;

public class TemperatureOperations {
    public static double temperatureLogic(String temperature, double num1){
        double out = 0;
        if(temperature.equals("CtoF")){
            out = CtoF(num1);
        }
        else if (temperature.equals("FtoC")){
            out = FtoC(num1);
        }
        else if (temperature.equals("CtoK")){
            out = CtoK(num1);
        }
        else if (temperature.equals("KtoC")){
            out = KtoC(num1);
        }

        return out;
    }


    public static double CtoF(double num1){
        return (num1*1.8) + 32;
    }
    public static double FtoC(double num1){
        return (num1 - 32) * 5/9;
    }
    public static double CtoK(double num1){

        return num1 + 273.15;
    }
    public static double KtoC(double num1){
        return num1 - 273.15;
    }
    


}
