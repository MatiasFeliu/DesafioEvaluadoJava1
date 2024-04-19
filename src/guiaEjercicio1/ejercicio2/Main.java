package guiaEjercicio1.ejercicio2;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el temporizador");
        int num;
        num = sc.nextInt();

        if(num <= 0){
            System.out.println("El numero ingresado no es correcto");
        }else{
            for(int i = num; i>=0; i--){
                try{
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(i);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                }
            }
        }
    }
}
