package ATIVIDADE1;
public class Questao05_TI {

    String Nome, CPF;

    double N1, N2, N3;

    public Questao05_TI(String Nome, String CPF){

        this.Nome = Nome;
        this.CPF = CPF;

    }
    public double Calcular(){
       return (this.N1 + this.N2 + this.N3)/3;
    }
}
