import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       var scanner = new Scanner(System.in);
       /*entende que está criando uma variavel, tipando ou instanciando */
        System.out.println("Olá, informe seu nome");
        //String name = scanner.next();
        var name = scanner.next();
        System.out.println("Informe a sua idade");
        //int age = scanner.nextInt();
        var age = scanner.nextInt();
        System.out.printf("Ola %s sua idade é %s \n" , name, age);
    }
}
