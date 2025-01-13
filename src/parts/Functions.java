package parts;

public class Functions {
    public int function1(){
        return 0;
    }

    public float function2(float val1, float val2){
        return val1 + val1;
    }

    public static void main(String[] args){
        Functions test = new Functions();
        System.out.println(test.function1());
        System.out.println(test.function2(5, 9));
    }
}
