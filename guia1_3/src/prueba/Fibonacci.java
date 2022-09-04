package prueba;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un numero para mostrar los primeros n numeros de Fibonacci: ");
        
        int n = sc.nextInt();
        
        System.out.println(primerosN(n));
    }
    
    public static String primerosN(int num) {
        if (num < 1)
            return "Num no valido";
        if (num == 1)
            return "0";
        if (num == 2)
            return "0 1";
        
        String res = "0 1";
        
        long nums[] = new long[3];
        
        nums[0] = 0;
        nums[1] = 1;
        
        for (int i = 2; i < num; i++) {
            nums[2] = nums[0] + nums[1];            
            res += " " + nums[2];
            nums[0] = nums[1];
            nums[1] = nums[2];            
        }
        
        return res;     
    }

}
