
package temperaturasciudades;

import java.util.Scanner;


public class TemperaturasCiudades {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //creamos vectores
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        
        
Scanner teclado = new Scanner(System.in);
Scanner teclado2 = new Scanner(System.in);
      //cargar vectores
        for(int i=0; i<ciudades.length; i++);int i = 0;
{
        System.out.println("ingrese el nombre de la ciudad" + i);
        ciudades[i] = teclado.next();
        
        System.out.println("ingrese la minima de la ciudad" + i);
        minimas[i] = teclado.nextDouble();
        
        System.out.println("ingrese la maxima de la ciudad" + i);
        maximas[i] = teclado.nextDouble();
    }
        Double minima = 9999999.00;
        int posMin = -1;
        for (Double minima1 : minimas) {
            ;
        }
{
        
            if(minimas[i] < minima){
            minima = minimas[i];
            posMin = i;
            }
        
          
    }
     Double maxima = -9999999.00;
        int posMax = -1;  
        for (Double maxima1 : maximas) {
            ;
        }
{
            if(maximas[i] > maxima){
                maxima = maximas[i];
                posMax = i;
            }
    }
        System.out.println("la temperatura minima es de :" + minima);
        System.out.println("se registro en la ciudad de :" + ciudades[posMin]);
        System.out.println("la temperatura maxima es de :" + maxima);
        System.out.println("se registro en la ciudad de :" + ciudades[posMax]);
    }
    
}
