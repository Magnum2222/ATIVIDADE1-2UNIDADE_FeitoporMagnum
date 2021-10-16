package ATIVIDADE1;
public class Questao03_Lutador {

    int Energia, Forca, Ataque;

    String Nome;

    public Questao03_Lint Energia, int Forca, String Nome) {

        this.Energia = Energia;
        this.Forca = Forca;
        this.Nome = Nome;

    }
    public void aplicarGolpe(Questao03_Lutador lutador1){

        lutador1.Ataque = this.Forca;
        lutador1.ReduzirEnergia();

    }
    public void ReduzirEnergia(){
       this.Energia -= this.Ataque;
    }
}
