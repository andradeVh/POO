package ads.poo;

public class Horario {
    private int hora, minuto, segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public boolean setHora(int a){
        boolean horaCerta;
        hora = a;
        if (hora > 24){
            horaCerta = false;
        } else {
            horaCerta = true;
        }
        return horaCerta;
    }

    public boolean setMinuto(int a){
        boolean minutoCerto;
        minuto = a;
        if (minuto > 60){
            minutoCerto = false;
        } else {
            minutoCerto = true;
        }
        return minutoCerto;
    }

    public boolean setSegundo(int a){
        boolean segundoCerto;
        segundo = a;
        if (segundo > 60){
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
}
