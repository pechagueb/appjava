import java.util.Scanner;

public class EjerciciosI {

    //  20 Ejercicios de Java: Operaciones, Condicionales y Bucles
    public static void main(String[] args) {

        // 1. Suma de dos números. Pide al usuario dos números enteros y muestra la suma en pantalla.

        Scanner sc = new Scanner(System.in);

        // Pedir los números
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        // Calcular la suma
        int suma = num1 + num2;

        // Mostrar el resultado
        System.out.println("La suma es: " + suma);

        sc.close();

        // 2. Área de un rectángulo Solicita la base y la altura de un rectángulo y calcula su área.

        Scanner sc = new Scanner(System.in);

        // Pedir la base y la altura
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular el área
        double area = base * altura;

        // Mostrar resultado
        System.out.println("El área del rectángulo es: " + area);

        sc.close();


        // 3. Conversión de grados Celsius a Fahrenheit Pide la temperatura en Celsius y conviértela a Fahrenheit.


        // 4. Número par o impar (básico sin condicionales) Muestra el resto de la división de un número por 2 y explica qué significa.


        // 5. Operaciones con tres números Solicita tres números y muestra: la suma, el producto y el promedio.


        // 6. Número positivo, negativo o cero Pide un número y determina si es positivo, negativo o igual a cero.


        // 7. Mayor de dos números Solicita dos números enteros e indica cuál es el mayor (o si son iguales).


        // 8. Mayor de tres números Pide tres números y determina el mayor de ellos.


        // 9. Número par o impar (con condicionales) Pide un número y muestra si es par o impar.


        // 10. Año bisiesto Solicita un año y determina si es bisiesto o no.


        // 11. Nota aprobada o suspendida Pide una nota (0–10) y muestra si es "Aprobado" (≥5) o "Suspenso".


        // 12. Menú de operaciones matemáticas Muestra un menú con 4 opciones: suma, resta, multiplicación, división. El usuario elige una y se realiza con dos números dados.


        // 13. Contar del 1 al 10 Muestra en pantalla los números del 1 al 10 usando un bucle for.


        // 14. Tabla de multiplicar Pide un número y muestra su tabla de multiplicar del 1 al 10.


        // 15. Suma de los primeros N números Pide un número N y calcula la suma desde 1 hasta N.


        // 16. Factorial de un número Pide un número y calcula su factorial (ej: 5! = 5×4×3×2×1).


        // 17. Contar pares e impares Pide un número N y muestra cuántos números pares e impares hay entre 1 y N.


        // 18. Adivinar el número Genera un número aleatorio entre 1 y 100. El usuario debe adivinarlo. El programa da pistas: "mayor" o "menor".


        // 19. Serie de Fibonacci Pide un número N y muestra los primeros N números de la serie de Fibonacci.


        // 20. Menú repetitivo con bucle Crea un menú con opciones (ej: sumar, restar, salir). El programa se repite hasta que el usuario elija “Salir”.


    }
}
