import kotlin.math.PI

fun main() {
    var opcion: Int

    do {
        println("---- Menú ----")
        println("1. Calcular el área de un triángulo.")
        println("2. Ingresar dos números por teclado y sumarlos.")
        println("3. Ingresar un número y visualizar el número elevado al cuadrado.")
        println("4. Escribir un algoritmo que convierta de euros a dólares.")
        println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro.")
        println("6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.")
        println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.")
        println("8. Calcular el promedio de tres (3) números ingresados por teclado.")
        println("9. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.")
        println("10. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.")
        println("11. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.")
        println("12. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.")
        println("13. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.")
        println("14. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.")
        println("15. Escribir un algoritmo que determine si un año es bisiesto o no.")
        println("16. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
        println("17. Imprimir los números impares entre 0 y 100.")
        println("18. Imprimir los números pares del 1 al 100.")
        println("19. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.")
        println("20. Escribir un programa que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.")
        println("21. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.")
        println("22. Sumar todos los números que se digitan por teclado mientras no sea cero.")
        println("23. Salir")

        print("Ingrese una opción (1-23): ")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> calcularAreaTriangulo()
            2 -> sumarDosNumeros()
            3 -> elevarNumeroAlCuadrado()
            4 -> convertirEurosADolares()
            5 -> calcularAreaYPerimetroCuadrado()
            6 -> calcularAreaYVolumenCilindro()
            7 -> calcularLongitudCircunferenciaYAreaCirculoInscrito()
            8 -> calcularPromedioDeTresNumeros()
            9 -> determinarSignoNumero()
            10 -> encontrarMayorYMenorDeDosNumeros()
            11 -> calcularMayorYMenorTresNumeros()
            12 -> sumarOrestarDosNumerosSegunCondicion()
            13 -> calcularCocienteEntreDosNumeros()
            14 -> sumarOMultiplicarDosNumerosSegunCondicion()
            15 -> determinarSiEsBisiesto()
            16 -> imprimirMultiplosDeTres()
            17 -> imprimirNumerosImpares()
            18 -> imprimirNumerosPares()
            19 -> imprimirCuadradosDel1Al30()
            20 -> sumarCuadradosPrimerosCienNumerosNaturales()
            21 -> generarYMostrarNumerosAscendentes()
            22 -> sumarNumerosHastaCero()
            23 -> println("Hasta luego. ¡Adiós!")
            else -> println("Opción inválida. Intente nuevamente.")
        }

        println() // Línea en blanco para separar las iteraciones del menú
    } while (opcion != 23)
}

// Funciones correspondientes a las opciones del menú

fun calcularAreaTriangulo() {
    println("Ingrese la base del triángulo:")
    val base = readLine()?.toDoubleOrNull()

    println("Ingrese la altura del triángulo:")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && altura != null) {
        val area = base * altura / 2
        println("El área del triángulo es: $area")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun sumarDosNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 != null && numero2 != null) {
        val suma = numero1 + numero2
        println("La suma de $numero1 y $numero2 es: $suma")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun elevarNumeroAlCuadrado() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        val cuadrado = numero * numero
        println("El número $numero elevado al cuadrado es: $cuadrado")
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun convertirEurosADolares() {
    val tipoCambio = 1.18 // Tipo de cambio actual (1 euro = 1.18 dólares)

    println("Ingrese la cantidad de euros a convertir:")
    val euros = readLine()?.toDoubleOrNull()

    if (euros != null) {
        val dolares = euros * tipoCambio
        println("$euros euros son equivalentes a $dolares dólares.")
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun calcularAreaYPerimetroCuadrado() {
    println("Ingrese el lado del cuadrado:")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null) {
        val area = lado * lado
        val perimetro = lado * 4

        println("El área del cuadrado es: $area")
        println("El perímetro del cuadrado es: $perimetro")
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun calcularAreaYVolumenCilindro() {
    println("Ingrese el radio del cilindro:")
    val radio = readLine()?.toDoubleOrNull()

    println("Ingrese la altura del cilindro:")
    val altura = readLine()?.toDoubleOrNull()

    if (radio != null && altura != null) {
        val areaBase = PI * radio * radio
        val areaLateral = 2 * PI * radio * altura
        val areaTotal = areaBase + areaLateral
        val volumen = PI * radio * radio * altura

        println("El área de la base del cilindro es: $areaBase")
        println("El área lateral del cilindro es: $areaLateral")
        println("El área total del cilindro es: $areaTotal")
        println("El volumen del cilindro es: $volumen")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun calcularLongitudCircunferenciaYAreaCirculoInscrito() {
    println("Ingrese el radio de la circunferencia:")
    val radio = readLine()?.toDoubleOrNull()

    if (radio != null) {
        val longitudCircunferencia = 2 * PI * radio
        val areaCirculoInscrito = PI * radio * radio

        println("La longitud de la circunferencia es: $longitudCircunferencia")
        println("El área del círculo inscrito es: $areaCirculoInscrito")
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun calcularPromedioDeTresNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    println("Ingrese el tercer número:")
    val numero3 = readLine()?.toDoubleOrNull()

    if (numero1 != null && numero2 != null && numero3 != null) {
        val promedio = (numero1 + numero2 + numero3) / 3
        println("El promedio de los tres números es: $promedio")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun determinarSignoNumero() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        if (numero > 0) {
            println("El número ingresado es positivo.")
        } else if (numero < 0) {
            println("El número ingresado es negativo.")
        } else {
            println("El número ingresado es cero.")
        }
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun encontrarMayorYMenorDeDosNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 != null && numero2 != null) {
        if (numero1 > numero2) {
            println("El primer número ($numero1) es mayor que el segundo número ($numero2).")
        } else if (numero1 < numero2) {
            println("El segundo número ($numero2) es mayor que el primer número ($numero1).")
        } else {
            println("Ambos números son iguales.")
        }
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun calcularMayorYMenorTresNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toIntOrNull()

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toIntOrNull()

    println("Ingrese el tercer número:")
    val numero3 = readLine()?.toIntOrNull()

    if (numero1 != null && numero2 != null && numero3 != null) {
        val mayor = maxOf(numero1, numero2, numero3)
        val menor = minOf(numero1, numero2, numero3)
        println("El mayor de los tres números es: $mayor")
        println("El menor de los tres números es: $menor")
    } else {
        println("Entrada inválida. Asegúrate de ingresar tres números enteros positivos.")
    }
}

fun sumarOrestarDosNumerosSegunCondicion() {
    println("Ingrese el número A:")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el número B:")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        val resultado = if (a < b) {
            a + b
        } else {
            a - b
        }
        println("El resultado es: $resultado")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun calcularCocienteEntreDosNumeros() {
    println("Ingrese el número A:")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el número B:")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        if (b != 0.0) {
            val cociente = a / b
            println("El cociente entre $a y $b es: $cociente")
        } else {
            println("Error: La división por cero no está definida. No es posible dividir entre cero (B debe ser diferente de cero).")
        }
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun sumarOMultiplicarDosNumerosSegunCondicion() {
    println("Ingrese el número A:")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el número B:")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        val resultado = if (a < 0 || b < 0) {
            a + b
        } else {
            a * b
        }
        println("El resultado es: $resultado")
    } else {
        println("Entrada inválida. Asegúrate de ingresar valores numéricos.")
    }
}

fun determinarSiEsBisiesto() {
    println("Ingrese un año:")
    val year = readLine()?.toIntOrNull()

    if (year != null) {
        val esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
        if (esBisiesto) {
            println("$year es un año bisiesto.")
        } else {
            println("$year no es un año bisiesto.")
        }
    } else {
        println("Entrada inválida. Asegúrate de ingresar un valor numérico.")
    }
}

fun imprimirMultiplosDeTres() {
    println("Múltiplos de 3 entre 1 y 100:")
    for (numero in 1..100) {
        if (numero % 3 == 0) {
            println(numero)
        }
    }
}

fun imprimirNumerosImpares() {
    println("Números impares entre 0 y 100:")
    for (numero in 1..100 step 2) {
        println(numero)
    }
}

fun imprimirNumerosPares() {
    println("Números pares del 1 al 100:")
    for (numero in 2..100 step 2) {
        println(numero)
    }
}

fun imprimirCuadradosDel1Al30() {
    println("Cuadrados de los números del 1 al 30:")
    for (numero in 1..30) {
        val cuadrado = numero * numero
        println("$numero al cuadrado es: $cuadrado")
    }
}

fun sumarCuadradosPrimerosCienNumerosNaturales() {
    var sumaCuadrados = 0
    for (numero in 1..100) {
        sumaCuadrados += numero * numero
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $sumaCuadrados")
}

fun generarYMostrarNumerosAscendentes() {
    println("Ingrese el primer número:")
    val numeroMenor = readLine()?.toIntOrNull()

    println("Ingrese el segundo número (mayor que el primero):")
    val numeroMayor = readLine()?.toIntOrNull()

    if (numeroMenor != null && numeroMayor != null && numeroMenor < numeroMayor) {
        println("Números comprendidos entre $numeroMenor y $numeroMayor en secuencia ascendente:")
        for (numero in numeroMenor..numeroMayor) {
            println(numero)
        }
    } else {
        println("Entrada inválida. Asegúrate de ingresar dos números naturales y que el primero sea menor que el segundo.")
    }
}

fun sumarNumerosHastaCero() {
    println("Ingrese los números a sumar (ingrese 0 para terminar):")

    var suma = 0
    var numero: Int

    do {
        numero = readLine()?.toIntOrNull() ?: 0
        suma += numero
    } while (numero != 0)

    println("La suma de los números ingresados es: $suma")
}
