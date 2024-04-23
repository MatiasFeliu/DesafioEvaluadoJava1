package guiaEjercicio1.ejercicio3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int num;
        int par = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero");
        num = sc.nextInt();

        if(num>0){
            for(int i=1; i<=num; i++){
                if(i%2==0){
                    System.out.println(i);
                    par=i+par;
                    //par acumulador
                }
            }
            System.out.println("el resultado es: " + par);
        }else{
            System.out.println("el numero ingresado no es valido");
        }
    }
}