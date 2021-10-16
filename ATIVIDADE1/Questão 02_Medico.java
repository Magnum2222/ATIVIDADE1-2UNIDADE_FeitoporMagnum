package ATIVIDADE1;
public class Questao02_Medico {
    public static void main(String[] args) {

        Questao02_Medico Endereco = new Questao02_Medico("123456", "4355665", "Frederico Sollto", "Avenida carlloos", "Centro", "Palmeiras", "BA");

        Questao02_Medico Medico = new Questao02_Medico(222333, "Lucas Paulo", "Masculino", "Geral", Endereco);

        System.out.println("\nDados Medico:");
        System.out.println("Codigo: " + medico.Codigo);
        System.out.println("Sexo: " + medico.Sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Nome: " + medico.Nome);
        System.out.println("Dados Endereco:");
        Endereco.Endereco();

        Endereco.numero = "333222";
        Endereco.cep = "12312312";
        Endereco.rua = "Souza de Araujo";
        Endereco.complemento = "Sem";
        Endereco.bairro = "Casinha";
        Endereco.cidade = "Rio de Janeiro";
        Endereco.uf = "RJ";

        medico.Codigo = 213123;
        medico.Nome = "Magnum";
        medico.Sexo = "Masculino";
        medico.especialidade = "Cirurgião";

        System.out.println("\nDados Medico:");
        System.out.println("Codigo: " + medico.Codigo);
        System.out.println("Sexo: " + medico.Sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Nome: " + medico.Nome);
        System.out.println("Dados Endereco:");
        Endereco.Endereco();

    }
}
