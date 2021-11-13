import javax.xml.namespace.QName;

public class BasicOperations {

    public static void printHelp(){
        System.out.println("HELP");
    }
    public static double calculate(String operation, double num1, double num2){
        double result = 0;
        if(operation == "add"){
            result = num1 + num2;
            System.out.println("Adding......");
            System.out.println(result);
        } else if ( operation == "subtract"){
            result = num1 - num2;
            System.out.println("Subtracting......");
        } else if (operation == "multiply"){
            result = num1 * num2;
            System.out.println("Multiplying....");
        } else if (operation == "divide"){
            result = num1/num2;
            System.out.println("Dividing.....");
        }
        return(result);
    }
    /*public static float ops(float float1, float float2){
        return answer;
    }*/
}
