# Calculadora en Java

Proyecto en Java que implementa una clase `Calculadora` con las operaciones básicas (suma, resta, multiplicación y división), usando la palabra reservada `return` para devolver los resultados y **sobrecarga de métodos** para aceptar distinta cantidad de parámetros.

## Características

- Métodos `sumar`, `restar` y `multiplicar` con **2, 3 y 4 parámetros** enteros (sobrecarga).
- Método `dividir` con **2 parámetros** enteros (sin sobrecarga).
- Todos los métodos retornan el resultado con `return`.
- Incluye un método `main` con ejemplos de uso.

## Estructura del proyecto

```
proyecto/
└── calculadora/
    └── Calculadora.java
```

## Métodos disponibles

| Operación     | Parámetros | Resultado         |
|---------------|------------|-------------------|
| `sumar`       | 2, 3 o 4   | `a + b (+ c + d)` |
| `restar`      | 2, 3 o 4   | `a - b (- c - d)` |
| `multiplicar` | 2, 3 o 4   | `a * b (* c * d)` |
| `dividir`     | 2          | `a / b`           |

## Cómo compilar y ejecutar

Desde la carpeta `proyecto` (la que contiene la carpeta `calculadora`):

```bash
javac calculadora/Calculadora.java
java calculadora.Calculadora
```

## Ejemplo de salida

```
Suma (2): 15
Resta (2): 5
Multiplicación (2): 50
División: 2
Suma (3): 17
Resta (3): 3
Multiplicación (3): 100
Suma (4): 18
Resta (4): 2
Multiplicación (4): 100
```

## Notas

- Al trabajar con enteros (`int`), la división descarta los decimales. Por ejemplo, `dividir(7, 2)` devuelve `3`.
- Dividir entre `0` lanza una `ArithmeticException`.

## Conceptos aplicados

- Clases y métodos
- Parámetros y retorno de valores (`return`)
- Sobrecarga de métodos (*method overloading*)
- Paquetes (`package`)

## Autor

Matthews Batista
