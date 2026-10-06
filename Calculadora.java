
package calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
     public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

       
        System.out.println("Suma (2): " + calc.sumar(10, 5));                
        System.out.println("Resta (2): " + calc.restar(10, 5));               
        System.out.println("Multiplicación (2): " + calc.multiplicar(10, 5));
        System.out.println("División: " + calc.dividir(10, 5));              

       
        System.out.println("Suma (3): " + calc.sumar(10, 5, 2));                
        System.out.println("Resta (3): " + calc.restar(10, 5, 2));               
        System.out.println("Multiplicación (3): " + calc.multiplicar(10, 5, 2));
        
        System.out.println("Suma (4): " + calc.sumar(10, 5, 2, 1));                 
        System.out.println("Resta (4): " + calc.restar(10, 5, 2, 1));               
        System.out.println("Multiplicación (4): " + calc.multiplicar(10, 5, 2, 1));
    }
}

