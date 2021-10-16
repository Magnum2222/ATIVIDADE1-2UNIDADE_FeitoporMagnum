package ATIVIDADE1;
public class Questao05_SUAP {

    public static void main(String[] args) {

        double Media;

        Questao05_SUAP Nota1 = new Questao05_SUAP("Magnum", "171.717.171-71");

        Nota1-Aluno.Nota1 = 1;
        Nota1-Aluno.Nota2 = 1;
        Nota1-Aluno.Nota3 = 1;

        Media = Nota1-Aluno.Calcular();

        System.out.println("Media do aluno: " + Media);

        Nota1-Aluno.Nota2 = 10;

        Media = Nota1-Aluno.Calcular();

        System.out.println("Media do aluno: " + Media);

    }
}
