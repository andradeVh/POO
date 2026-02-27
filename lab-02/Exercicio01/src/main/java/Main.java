public class Main {

    static void main() {

        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));
        String mes = IO.readln("Entre com o mês: ").toLowerCase();

        if (dia > 31 || dia < 1) {
            IO.println("Dia inválido");
            return;

        } else if ((mes.equals("dezembro") && dia > 20) || mes.equals("janeiro") || mes.equals("fevereiro")
                || (mes.equals("março") && dia < 20)) {
            IO.println("Verão");
        } else if ((mes.equals("março") && dia >= 20) || mes.equals("abril") || mes.equals("maio")
                || (mes.equals("junho") && dia < 20)) {
            IO.println("Outono");
        } else if ((mes.equals("junho") && dia >= 20) || mes.equals("julho") || mes.equals("agosto")
                || (mes.equals("setembro") && dia < 22)) {
            IO.println("Inverno");
        } else if (mes.equals("setembro") || mes.equals("outubro") || mes.equals("novembro")
                || (mes.equals("dezembro") && dia < 22)) {
            IO.println("Primavera");
        } else {
            IO.println("Mês inválido");
        }

    }
}
