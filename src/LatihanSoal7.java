/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author santuy
 */
public class LatihanSoal7 {
    public static void main(String [] args){
        int x = 12;
        int y = 20;
        
        int z = 20;
        z = x | y;
        System.out.println("Hasil operasi bitwise OR : " + z );
        
        z = x & y ; 
        System.out.println("Hasil operasi bitwise AND :" + z );
        
        z = x ^ y ;
        System.out.println("Hasil operasi bitwise XOR: " + z );
       
        z = ~x;
        System.out.println("Hasil operasi bitwise NOT: " + z );
        
        z = x << 3;
        System.out.println("Hasil operasi bitwise shift left :" + z );
        
        z = y >> 2 ;
        System.out.println("Hasil operasi bitwise shift right :" + z );
    }    
}
