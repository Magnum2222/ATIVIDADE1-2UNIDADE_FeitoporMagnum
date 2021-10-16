package ATIVIDADE1;
public class Questao04_Postagem {

    String Texto, Links;
    int Numerodecurtidas, NumerodeCompartilhamentos;

    public Questao04_Postagem(String Texto, String Links){

        this.Texto = Texto;
        this.Links = Links;

    }

    public void curtiPost(){
        this.Numerodecurtidas++;
    }

    public void compartilharPost(){
        this.NumerodeCompartilhamentos++;
    }

}
