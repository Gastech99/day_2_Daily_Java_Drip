package parts;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Procedures {

    public void print1(){
        System.out.println("Procédure sans argument");
    }
    public void print2(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Procedures test = new Procedures();
        test.print1();
        test.print2("Procédure avec argument");
    }
}