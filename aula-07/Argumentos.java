public class Argumentos{
    public static void main(String[] args) {
        if (args.length == 0){
            IO.println("Não forneceu argumentos de linha de comando");
        }else{
            IO.println("Primeiro argumento: " + args[0]);
        }
        
    }
}