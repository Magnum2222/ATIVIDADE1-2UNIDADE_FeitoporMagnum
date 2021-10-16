package ATIVIDADE1;
public class Questao03_Luta {

    public static void main(String[] args){

        Questao03_Lutador l1 = new Questao03_Lutador(100, 10, "Ryu");
        Questao03_Lutador l2 = new Questao03_Lutador(100, 12, "Bison");

        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);

        System.out.println("Energia ( "+l2.nome+"): "+l2.energia);

        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);

        System.out.println("Energia ( "+l1.nome+"): "+l1.energia);

    }
}
