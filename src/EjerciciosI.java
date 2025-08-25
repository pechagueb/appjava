import java.util.Scanner;

public class EjerciciosI {

    //  20 Ejercicios de Java: Operaciones, Condicionales y Bucles
    public static void main(String[] args) {

        // *******
        System.out.print(" 1. Suma de dos números. Pide al usuario dos números enteros y muestra la sumaIn en pantalla.\n");
        // *******

        Scanner sc = new Scanner(System.in);

        // Pedir los números
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        // Calcular la sumaIn
        int suma = num1 + num2;

        // Mostrar el resultado
        System.out.println("La sumaIn es: " + suma);

        // *******
        System.out.print(" 2. Área de un rectángulo Solicita la base y la altura de un rectángulo y calcula su área.\n");
        // *******

        // Pedir la base y la altura
        System.out.print("Ingresa la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular el área
        double area = base * altura;

        // Mostrar resultado
        System.out.println("El área del rectángulo es: " + area);

        // *******
        System.out.println("3. Conversión de grados Celsius a Fahrenheit Pide la temperatura en Celsius y conviértela a Fahrenheit.\n");
        // *******

        // Pedir temperatura en Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        // Conversión a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostrar resultado
        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");


        // [x] 4. Número par o impar (básico sin condicionales) Muestra el resto de la división de un número por 2 y explica qué significa.


        // *******
        System.out.print("5. Operaciones con tres números Solicita tres números y muestra: la sumaIn, el producto y el promedio.\n");
        // *******

        // Pedir tres números
        System.out.print("Ingresa el primer número: ");
        double numIn1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numIn2 = sc.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numIn3 = sc.nextDouble();

        // Operaciones
        double sumaIn = numIn1 + numIn2 + numIn3;
        double producto = numIn1 * numIn2 * numIn3;
        double promedio = sumaIn / 3;

        // Mostrar resultados
        System.out.println("La sumaIn es: " + sumaIn);
        System.out.println("El producto es: " + producto);
        System.out.println("El promedio es: " + promedio);

        // *******
        System.out.print(" 6. Número positivo, negativo o cero Pide un número y determina si es positivo, negativo o igual a cero.\n");
        // *******

        // Pedir un número
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        // Verificar si es positivo, negativo o cero
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es igual a cero.");
        }

        // *******
        System.out.print("7. Mayor de dos números Solicita dos números enteros e indica cuál es el mayor (o si son iguales).\n");
        // *******

        // Solicitar el primer número
        System.out.print("Por favor, introduce el primer número entero: ");
        int Int1 = sc.nextInt();

        // Solicitar el segundo número
        System.out.print("Ahora, introduce el segundo número entero: ");
        int Int2 = sc.nextInt();

        // Comparar los números usando una estructura condicional
        if (Int1 > Int2) {
            System.out.println("El primer número (" + Int1 + ") es el mayor.");
        } else if (Int2 > Int1) {
            System.out.println("El segundo número (" + Int2 + ") es el mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // *******
        System.out.print("8. Mayor de tres números Pide tres números y determina el mayor de ellos.\n");
        // *******

        // Solicitar los tres números
        System.out.print("Introduce el primer número: ");
        int numA = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numB = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numC = sc.nextInt();

        // Determinar el mayor usando una variable auxiliar
        int mayor = numA; // Suponemos que el primer número es el mayor inicialmente

        if (numB > mayor) {
            mayor = numB; // Si el segundo es mayor que el actual 'mayor', lo actualizamos
        }

        if (numC > mayor) {
            mayor = numC; // Si el tercer es mayor que el actual 'mayor', lo actualizamos
        }

        // Mostrar resultado
        System.out.println("El número mayor es: " + mayor);


        // [x] 9. Número par o impar (con condicionales) Pide un número y muestra si es par o impar.


        // *******
        System.out.print("10. Año bisiesto Solicita un año y determina si es bisiesto o no.\n");
        // *******

        // Solicitar al usuario que introduzca un año
        System.out.print("Introduce un año para comprobar si es bisiesto: ");
        int anio = sc.nextInt();

        // Determinar si el año es bisiesto
        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            esBisiesto = true;
        }

        // Imprimir el resultado
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        // 11. Nota aprobada o suspendida Pide una nota (0–10) y muestra si es "Aprobado" (≥5) o "Suspenso".


        // 12. Menú de operaciones matemáticas Muestra un menú con 4 opciones: sumaIn, resta, multiplicación, división. El usuario elige una y se realiza con dos números dados.


        // 13. Contar del 1 al 10 Muestra en pantalla los números del 1 al 10 usando un bucle for.


        // 14. Tabla de multiplicar Pide un número y muestra su tabla de multiplicar del 1 al 10.


        // 15. Suma de los primeros N números Pide un número N y calcula la sumaIn desde 1 hasta N.


        // 16. Factorial de un número Pide un número y calcula su factorial (ej: 5! = 5×4×3×2×1).


        // 17. Contar pares e impares Pide un número N y muestra cuántos números pares e impares hay entre 1 y N.


        // 18. Adivinar el número Genera un número aleatorio entre 1 y 100. El usuario debe adivinarlo. El programa da pistas: "mayor" o "menor".


        // 19. Serie de Fibonacci Pide un número N y muestra los primeros N números de la serie de Fibonacci.


        // 20. Menú repetitivo con bucle Crea un menú con opciones (ej: sumar, restar, salir). El programa se repite hasta que el usuario elija “Salir”.


    }
}
