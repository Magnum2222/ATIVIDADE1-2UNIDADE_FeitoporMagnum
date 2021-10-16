package ATIVIDADE1;
public class Questao02_Localiza {
    String Rua, Complemento, Bairro, Cidade, uf, Numero, CEP;
    public Questao02_Localiza(String N, String CEP, String Rua, String Complemento, String B, String C, String uf){

        this.N = N;
        this.CEP = CEP;
        this.Rua = Rua;
        this.Complemento = Complemento;
        this.B = B;
        this.C = C;
        this.uf = uf;
    }
    public void Endereco(){
        System.out.println("CEP: "+this.CEP);
        System.out.println("UF: "+this.uf);
        System.out.println("N: "+this.N);
        System.out.println("Complemento: "+this.Complemento);
        System.out.println("B: "+this.B);
        System.out.println("C: "+this.C);
        System.out.println("Rua: "+this.Rua);
    }

}
