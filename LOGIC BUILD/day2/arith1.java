 import java.util.Scanner;
 class arith1
  {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
         
		System.out.print("input first no: ");
		int num1 = in.nextInt();
		
		System.out.print("input second no: ");
		int num2 = in.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
 
    }
  }	
 
 
 
 
 
 