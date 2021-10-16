package ATIVIDADE1;
public class Questao04_Facebook {
    public static void main(String[] args){
        Questao04_Facebook X = new Questao04_Facebook("Aprendendo a fazer Feijoada, mas, sem feijão e sem carne?: ");
        X.curtiPost();
        X.curtiPost();
        X.curtiPost();
        System.out.println("Quantas curtidas esse post recebeu: "+X.numeroCurtidas);
        X.compartilharPost();
        X.compartilharPost();
        System.out.println("Quantas vezes esse post foi compartilhado: "+X.numeroCompartilhamento);

    }
}
