public class EvenOrOdd {
    public static void main(String[] args)
    {
        int numToExamine = 2;
        int moduloResult;
        moduloResult = numToExamine % 2;
        if (moduloResult == 0)
            System.out.println(numToExamine + " modulo 2 is " + moduloResult + " so the number is Even");
        else
            System.out.println(numToExamine + " modulo 2 is " + moduloResult + " so the number is Odd");

    }
}