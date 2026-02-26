public class Main {


    static void main() {

        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ");

        if ((mes.equals("dezembro") && dia > 20 ) || mes.equals("janeiro") || mes.equals("fevereiro") || (mes.equals("março") && dia < 20)){
            IO.println("Verão");
        }
        if (mes.equals("março") || mes.equals("abril") || mes.equals("maio") || (mes.equals("junho") && dia < 22)){
            IO.println("Outono");
        }
        if (mes.equals("março") || mes.equals("abril") || mes.equals("maio") || (mes.equals("junho") && dia < 22)){
            IO.println("Inverno");
        }
        if (mes.equals("março") || mes.equals("abril") || mes.equals("maio") || (mes.equals("junho") && dia < 22)){
            IO.println("Primavera");
        }


    }
}
