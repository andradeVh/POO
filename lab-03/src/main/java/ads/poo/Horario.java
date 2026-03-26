package ads.poo;

public class Horario {
    private int hora, minuto, segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        this(hora, 0, 0);
    }

    public Horario(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Horario(int hora, int minuto, int segundo) {
        this();
        if (hora < 24 && minuto < 60 && segundo < 24){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

    }

    public boolean setHora(int a) {
        boolean horaCerta;
        hora = a;
        if (hora > 24) {
            horaCerta = false;
        } else {
            horaCerta = true;
        }
        return horaCerta;
    }

    public boolean setMinuto(int a) {
        boolean minutoCerto;
        minuto = a;
        if (minuto > 60) {
            minutoCerto = false;
        } else {
            minutoCerto = true;
        }
        return minutoCerto;
    }

    public boolean setSegundo(int a) {
        boolean segundoCerto;
        segundo = a;
        if (segundo > 60) {
            segundoCerto = false;
        } else {
            segundoCerto = true;
        }
        return segundoCerto;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public String porExtenso() {
        return numeroHoraPorExtenso(hora) + " " + unidadeTempo(hora, "hora", "horas") + ", " + numeroPorExtenso(minuto) + " " + unidadeTempo(minuto, "minuto", "minutos") + " e " + numeroPorExtenso(segundo) + " " + unidadeTempo(segundo, "segundo", "segundos");
    }

    private String numeroHoraPorExtenso(int valor) {
        if (valor == 1) {
            return "uma";
        }
        if (valor == 2) {
            return "duas";
        }
        return numeroPorExtenso(valor);
    }

    private String numeroPorExtenso(int valor) {
        return switch (valor) {
            case 0 -> "zero";
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "tres";
            case 4 -> "quatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "sete";
            case 8 -> "oito";
            case 9 -> "nove";
            case 10 -> "dez";
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            case 19 -> "dezenove";
            case 20 -> "vinte";
            case 30 -> "trinta";
            case 40 -> "quarenta";
            case 50 -> "cinquenta";
            default -> numeroPorExtenso((valor / 10) * 10) + " e " + numeroPorExtenso(valor % 10);
        };
    }

    private String unidadeTempo(int valor, String singular, String plural) {
        if (valor == 1) {
            return singular;
        }
        return plural;
    }

    public long tempoSegundos(){
        return (this.hora * 3600L) + (this.minuto * 60L) + this.segundo;
    }

    public long diferencaHora(Horario h){
        return tempoSegundos() - h.tempoSegundos();
    }

}
