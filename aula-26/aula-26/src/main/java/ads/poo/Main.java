package ads.poo;


import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

//        Caixa<String> c = new Caixa<>("Olá mundo!");
//        Caixa<Pessoa> d = new Caixa<>(new Pessoa("Joao"));
//
//        String s = c.getConteudo();
//
//        // String errado = d.getConteudo();
        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número: ");
            b = ler.nextInt();

            int  res = a / b;
            System.out.println(a + " divido por " + b + " = " + res);
        } catch (InputMismatchException e){
            System.err.println("Só permitido números inteiros");
            ler.nextLine();
        }catch (ArithmeticException e){
            System.err.println("Divisão por 0 não são possível");
            ler.nextLine();
        }
        System.out.println("Fim do programa");

    }
}
