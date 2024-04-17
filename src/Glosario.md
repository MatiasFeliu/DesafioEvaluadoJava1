# Glosario

### Package: (paquete) es un mecanismo utilizado para organizar y estructurar clases y otros elementos relacionados dentro de un proyecto. Un paquete puede contener clases, interfaces, subpaquetes u otros recursos relacionados.
    Ejemplo: package com.ejemplo.miproyecto;
### Clase: Es un componente fundamental que se utiliza para definir objetos. Proporcionan un conjunto de variables (llamados atributos) y metodos (funcionalidad) que pueden operar estas variables (atributos). Opera como una plantilla o plano para crear objetos.
    Ejemplo:public class MiClase {
    // Atributos (variables)
    private int numero;
    private String texto;

    // Constructor
    public MiClase(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }
### Atributo de una clase: En java un atiburo es una variable que esta asociada a una clase. Tambien se le conoce como campo o propiedad de la clase. Los atributos representan el estado de los objetos creados a partir de la clase y pueden se de diferentes tipos de datos, como enteros, cadenas, boolean u otros objetos.
    Ejemplo:public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String genero;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
### Metodo:Un metodo es un bloque de codigo que define el comportamiento de un objeto o una clase. Los metodos encapsulan la funcionalidad y la logica de una clase, permitiendo realizar diferentes operaciones y acciones sobre los objetos creados a partir de una clase.
    Ejemplo: public class MiClase {
    // Atributo de la clase
    private int numero;

    // Constructor de la clase
    public MiClase(int numero) {
        this.numero = numero;
    }

    // Método de la clase que suma un valor al atributo numero
    public void sumar(int valor) {
        this.numero += valor;
    }

    // Método de la clase que multiplica el atributo numero por un valor
    public void multiplicar(int valor) {
        this.numero *= valor;
    }

    // Método de la clase que imprime el valor del atributo numero
    public void imprimirNumero() {
        System.out.println("Número: " + numero);
    }
    }
### Clase "Main": La clase main es comunmente como punto de entrada principal para la ejecuiòn de un programa java. Dentro de la clase "main", se define el metodo main, que es el punto de entrada principal para la ejecucion del programa.
    Ejemplo: Public class Main {
    // Método main, punto de entrada principal del programa

    public static void main(String[] args) {

        // Código de inicio del programa
        System.out.println("Hola, mundo!");
    }
    }
///*Explicaciòn: En este ejemplo, la clase main, tiene un metodo main que es estatico ( static) y devuelve void. Este metodo recibe un parametro de tipo String[] que se utiliza para pasar argumentos de linea de comandos (CLI) al programa.*

### import: Se utiliza para acceder a clases y otros elementos (como interfaces, enumeraciones o miembros estaticos) de otros paquetes(packages) em tu programa. La declaracion *import* permite utilizar los nombres de las clases sin la necesidad de especificar el nombre completo del paquete cada vez que se accede a ellas.
    Ejemplo: import java.util.Scanner;
             import static java.lang.Math.*;
             import java.util.*
### Static: Se utiliza para declarar miembros de clase que pertenecen a la clase en si misma, en lugar de pertenecer a instancias individuales de la clase. Los miembros estaticos son compartidos por todas las instancias de clase y pueden ser accedidos directamente desde el nombre de la clase, sin necesidad de crear una instancia de la clase.
