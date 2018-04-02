


/**
 *
 * @author Nathaly Alvarenga
 */

import java.util.Scanner;
public class Ejemplo_Promedio_Notas {

    public static void main(String[] args) {
        int total=0,i=0;
        float sum=0;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite el total de notas ha ingresar: ");
        total= input.nextInt();
        
        
        while(i<total){
            
            System.out.println("Digite la "+(i+1)+"° nota :");
            float note=input.nextFloat();
            sum+=note;
            i+=1;
        }
        System.out.println("El promedio de notas es: "+ ((sum/total)));
                
    }
    
}
