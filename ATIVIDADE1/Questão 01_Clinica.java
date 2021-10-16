package ATIVIDADE1;
public class Questao01_Clinica{

    public static void main(String[] args){

        Questao01_Clinica Magnum = new Questao01_Clinica("Magnum Soares", 40, "23/09/1981", "Masculino", "Morango", "Nenhum", "A+");
        System.out.println("\nTipo Sanguíneo: "+ Magnum.Tiposanguineo);
        System.out.println("Codigo: "+Magnum.Codigo);
        System.out.println("Nome: "+ Magnum.Nome);
        System.out.println("Data de Nascimento: "+ Magnum.DatadeNascimento);
        System.out.println("Sexo: "+ Magnum.Sexo);
        System.out.println("Plano de saude: "+ Magnum.PlanoSaude);
        System.out.println("Alergia: "+ Magnum.Alergia);

        Magnum.Nome = "Marco Antonio";
        Magnum.DatadeNascimento = "23/03/1969";
        Magnum.Sexo = "Masculino";
        Magnum.Tiposanguineo = "A+";
        Magnum.Alergia = "Nenhuma";
        Magnum.PlanoSaude = "Nenhum";
        Magnum.Codigo(50) = 80;

        System.out.println("\nTipo Sanguíneo: "+ Magnum.Tiposanguineo);
        System.out.println("Codigo: "+Magnum.Codigo);
        System.out.println("Nome: "+ Magnum.Nome);
        System.out.println("Data de Nascimento: "+ Magnum.DatadeNascimento);
        System.out.println("Sexo: "+ Magnum.Sexo);
        System.out.println("Plano de saude: "+ Magnum.PlanoSaude);
        System.out.println("Alergia: "+ Magnum.Alergia);

    }
}
