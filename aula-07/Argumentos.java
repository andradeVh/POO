public class Argumentos{
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            
        
        if (args.length == 0){
            IO.println("Não forneceu argumentos de linha de comando");
        }else{
            IO.println("Argumento número "+ (i + 1) +" : "+ args[i]);
        }
    }

    }
}