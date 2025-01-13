package parts;

public class Functions {
    public int function1(){
        return 0;
    }

    public float function2(float val1, float val2){
        return val1 + val1;
    }

    // Approche itérative
    public int factoriel_iterative(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Approche récursive
    public int factoriel_recursive(int n){
        if (n == 0) return 1;
        else return factoriel_recursive(n-1)*n;
    }
    public static void main(String[] args){
        Functions test = new Functions();
        System.out.println("Résultat de la fonction 1 = "+test.function1());
        System.out.println("Résultat de la fonction 2 = "+test.function2(5, 9));
        System.out.println("L'approche itérative = "+test.factoriel_iterative(5));
        System.out.println("L'approche récursive = "+test.factoriel_recursive(5));
    }
}
