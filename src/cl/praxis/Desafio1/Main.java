package cl.praxis.Desafio1;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fecha1;
        String fecha2;
        System.out.println("Ingrese la primera fecha (como DD/MM/AAAA): ");
        fecha1 = sc.nextLine();
        System.out.println("Ingrese la segunda (como DD/MM/AAAA): ");
        fecha2 = sc.nextLine();
        LocalDate fechaPersona1 = LocalDate.parse(fecha1, formateo);
        LocalDate fechaPersona2 = LocalDate.parse(fecha2, formateo);
        System.out.println(fechaPersona1 + " " + fechaPersona2);

        //Calculo de edades
        Period edadPersona1 = Period.between(fechaPersona1, LocalDate.now());
        Period edadPersona2 = Period.between(fechaPersona2, LocalDate.now());
        System.out.println(edadPersona1 + " " + edadPersona2);

        //compara edades y determinacion de quien es mayor

        if (edadPersona1.getYears() > edadPersona2.getYears()) {
            System.out.println("Persona1 es Mayor");

        } else if (edadPersona2.getYears() > edadPersona1.getYears()){
            System.out.println("Persona2 es Mayor");
        }else {
            if (edadPersona1.getMonths() > edadPersona2.getMonths()){
                System.out.println("Persona1 es Mayor");

            } else if (edadPersona2.getMonths() > edadPersona1.getMonths()) {
                System.out.println("Persona2 es Mayor");


            }else{
                if (edadPersona1.getDays() > edadPersona2.getDays()){
                    System.out.println("Persona1 es Mayor");

                } else if (edadPersona2.getDays() > edadPersona1.getDays()) {
                    System.out.println("Persona2 es Mayor");


                }else {
                    System.out.println("Tienen la misma edad");
                }
            }

        }
    }
}
