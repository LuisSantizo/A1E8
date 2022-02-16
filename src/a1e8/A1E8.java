import java.util.Scanner;

public class A1E8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        int Primero;
        int Segundo;
        int Tercero;
        float suma;
        double Promedio;

        //pedir los datos 
        System.out.println("Ingrese el primer numero");
        Primero = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        Segundo = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        Tercero = scanner.nextInt();
        
        //hacer las operaciones 
        suma = Primero +Segundo +Tercero;
        Promedio = suma/3;

        System.out.println("El promedio de los tres numeros ingresados es: " + Promedio);
    }

}
