import java.util.Scanner;

/**
 * Programa para hallar valores no duplicados entre 2 arreglos
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190817
 */
public class sin_repetir
{
    public static void main (String[] args)
    { 
        
        Scanner entrada = new Scanner(System.in);
        
        int i, j, k=0, l;
        int n, p;
        
        System.out.println("Por favor inserte el tamaño del arreglo A: ");
        n=entrada.nextInt();
        
        System.out.println("Por favor inserte el tamaño del arreglo B: ");
        p=entrada.nextInt();
        
        String a[] = new String [n];
        String b[] = new String [p];
        String c[] = new String [n+p];
        String d[] = new String [n+p];
        String res[] = new String [n+p];
        
        System.out.println("inserte los enteros del arreglo A: ");
        
        for (i = 0; i < n; ++i)
        {
            System.out.printf("Inserte el numero: ",i);
            a[i] = entrada.next();
        }
        
        System.out.println("inserte los enteros del arreglo B: ");
        
        for (i = 0; i < p; ++i)
        {
            System.out.printf("Inserte el numero: ",i);
            b[i] = entrada.next();
        } 
        
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < b.length; j++)
            {
                if (a[i].equals(b[j]))
                {
                    c[k] = a[i]; k = k+1;
                }
            }
        }
        
        k = 0;
        
        for (i = 0; i < a.length; i++)
        {
            d[k] = a[i]; k = k+1;
        }
        
        for (i = 0; i < b.length; i++)
        {
            d[k] = b[i]; k = k+1;
        }
        
        for (i = 0; i < c.length; i++)
        {
            for (j = 0; j < d.length; j++)
            {
                if (d[j].equals(c[i]))
                {
                    d[j]="";
                }
            }
        }
        
        k = 0;
        
        for (i = 0; i < d.length; i++)
        {
            if (!d[i].equals(""))
            {
                res[k] = d[i]; k = k+1;
            }
        }
        
        System.out.println("Los números que no se repiten en los arreglos A y B son: ");
        
        for (l = 0; l <k; ++l)
        {
            System.out.print(res[l]);
            System.out.print(", ");
        }
    }
}