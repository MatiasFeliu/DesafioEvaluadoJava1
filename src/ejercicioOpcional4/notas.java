package ejercicioOpcional4;

import java.util.ArrayList;

public class notas {
    public static void main(String[] args){
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(4.7);
        notas.add(2.2);
        notas.add(5.4);
        notas.add(6.9);
        notas.add(4.4);
        notas.add(2.6);

        System.out.println("Notas" + notas);
        MayorMenor(notas);

    }
    public static void MayorMenor(ArrayList<Double> notas){
        double mayor= notas.get(0);
        double menor= notas.get(0);

        for(double nota : notas){
            if(nota > mayor){
                mayor = nota;
            }
            else if(nota < menor){
                menor = nota;
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
