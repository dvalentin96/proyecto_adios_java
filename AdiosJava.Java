import java.util.scanner;

public class AdiosJava {

    public static int resta (int a, int b) {
        return a - b;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Escribe el número 1");
    int numero1 = sc.nextInt();

    System.out.println("Escribe el segundo número 2");
    int numero2 = sc.nextInt();

    int resta = resta(numero1, numero2);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("");

    // clase persona 

    Persona = persona1;
    persona persona1 = new persona("Valentin", "Rocha", "Sanchez",);

    persona1.setEdad(20);
    persona1.settelefono(2472043336);
    persona1.setDomicilio("Calle 5 de mayo");

    System.out.println("======Datos de la persona=====" + persona1.toString());
    System.out.println("");

    scanner.close();



    
    
