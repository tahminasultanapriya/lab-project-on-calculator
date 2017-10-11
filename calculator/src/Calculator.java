import java.util.Scanner;


public class Calculator 
{
    public int plus(int a, int b)
    {
        int c = a + b; 
        return c;
    }
    
      public int multiply(int a, int b)
    {
        int c = a * b; 
        return c;
    }
      
        public int subtract(int a, int b)
    {
        int c = a - b; 
        return c;
    }
        
        public int divide(int a, int b)
    {
        int c = a / b;    
        return c;
    }

public class ScientificCalculator extends Calculator 
{
    public int power(int a, int b)
    {
        int c = (int)Math.pow(a, b);  
        return c;
    }
    
    public int factorial (int a)
    {
         if(a <= 1)
         {
             return 1;
         }
         else
             return a * factorial(a-1);
    }
}

    public static void main(String[] args) 
    {
        int a,b;
        String sign;
        
        Scanner keyboard = new Scanner(System.in);
        Calculator yourCal = new Calculator();
        
        System.out.println("Enternumbers");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        
        System.out.println("Enter operation (+, -, * or /)");
        sign = keyboard.next();
        
        if(sign.equals("+"))
        {
            int c = yourCal.plus(a, b);
            System.out.println("Answer" + c);
        }
        else if(sign.equals("-"))
        {
            int c = yourCal.subtract(a, b);
            System.out.println("Answer" + c);
        }
        else if(sign.equals("*"))
        {
            int c = yourCal.multiply(a, b);
            System.out.println("Answer" + c);
        }
        else if(sign.equals("/"))
        {
            try
            {
            int c = yourCal.divide(a, b);
            System.out.println("Answer" + c);
            }
            catch(ArithmeticException d)
            {
                System.out.println("devided by zero");
            }
        }
        else
            System.out.println("Invalid");
        Scanner keyboard1 = new Scanner(System.in); 
        ScientificCalculator yourScCal=yourCal.new ScientificCalculator();
        int j,k;
        
        System.out.println("This Sc. Cal. Enter your two num:");
        j = keyboard1.nextInt();
        k = keyboard1.nextInt();
        
        int l = yourScCal.power(j, k);
        System.out.println("Ther is " + l);
        
        System.out.println("Find factorial:");
        int m = keyboard.nextInt();
        
        int n = yourScCal.factorial(m);
        System.out.println(m + " factorial is " + n);
        
    }
}