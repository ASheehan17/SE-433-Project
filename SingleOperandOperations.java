import java.lang.*;
public class SingleOperandOperations {

    public static double calculationLogic(String singleoperand, double num1){
        double output  = 0;

        if(singleoperand.equals("percent")){
            output =  calculatePercentage(num1);
        }
        else if(singleoperand.equals("exp")){
            output = calculateE(num1);
        } else if(singleoperand.equals("square")){
            output = calculateSquared(num1);
        } else if(singleoperand.equals("squareroot")){
            output = calculateSqrt(num1);
        }
        return output;
    }

    public static double calculatePercentage(double input){
        double ans = input/100;
        return ans;
    }
    
    public static double calculateE(double input){
        double ans = Math.exp(input);
        return ans;
    }

    public static double calculateSquared(double input){
        double ans = Math.pow(input, 2);
        return ans;
    }

    public static double calculateSqrt(double input){
        double ans = Math.sqrt(input);
        return ans;
    }
    
}
