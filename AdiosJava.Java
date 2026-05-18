import java.util.Scanner;

public class AdiosJava {

    public static int resta (int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);

        int resta = resta(numero1, numero2);
        System.out.println("El resultado de la resta es: " + resta);

        System.out.println("");

        //clase persona

        Persona persona1;
        persona1 = new Persona("Juan", "Perez", "Lopez"); 
        persona1.setEdad(20);
        persona1.settelefono("2472043336");
        persona1.setDomicilio("Calle 5 de Mayo");

        System.out.println("====Datos de la persona====" + persona1.toString());
        System.out.println("");
        
        scanner.close();




        
    }
}