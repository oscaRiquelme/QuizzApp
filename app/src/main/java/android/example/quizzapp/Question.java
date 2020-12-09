package android.example.quizzapp;

public class Question {

    int id;

    String pregunta;

    String op1;
    String op2;
    String op3;
    String op4;


    int opCorrecta;

    public Question(int id,String pregunta, String op1, String op2, String op3, String op4, int opCorr){
        this.id = id;
        this.pregunta = pregunta;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.opCorrecta = opCorr;
    }
}
