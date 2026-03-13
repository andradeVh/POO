package ads.poo;

public class Disciplina {
    private String horario;
    private String dia;
    private String materia;
    private String professor;
    private String info;

    public void setHorario(String h){
        horario = h;
    }
    public String getHorario(){
        return horario;
    }
    public void setDia(String d){
        dia = d;
    }
    public String getDia(){
        return dia;
    }
    public void setMateria(String m){
        materia = m;
    }
    public String getMateria(){
        return materia;
    }
    public void setProfessor(String p){
        professor = p;
    }
    public String getProfessor(){
        return professor;
    }
    /* 
    public void setInfo(String dia, String horario, String professor, String materia){
        dia = "Dia: " + dia;
        horario = "Horário: " + getHorario();
        professor = "Professor: " + getProfessor();
        materia = "Matéria: " + getMateria();

    }

    public String getInfo(){
        return info;
    }
*/
}
