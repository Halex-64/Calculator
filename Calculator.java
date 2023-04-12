public class Calculator {
    int a = 5;
    int b = 10;

    public Calculator () {

    }
    public int add (int a, int b){
        int Results = a+b;
        return Results;
    }

    public int subtract (int a, int b){
        int rEsults = a-b;
        return rEsults;

    }

    public int multiply (int a, int b){
        int reSults = a*b;
        return reSults;
    }

    public int divide (int a, int b){
        int resUlts = a/b;
        return resUlts;
    }

    public int modulo (int a, int b){
        int resuLts = a%b;
        return resuLts;
    }

    public static void main(String[] args) {
        Calculator MyCalculator = new Calculator();

        int addResult = MyCalculator.add(5,7);
        System.out.println (addResult);

        int subtractResult= MyCalculator.subtract(45,11);
        System.out.println(subtractResult);

        int multiplyResult= MyCalculator.multiply(10,5);
        System.out.println(multiplyResult);

        int divideResult= MyCalculator.divide(50,5);
        System.out.println(divideResult);

        int moduloResult = MyCalculator.modulo(10,20);
        System.out.println(moduloResult);
    }
}
