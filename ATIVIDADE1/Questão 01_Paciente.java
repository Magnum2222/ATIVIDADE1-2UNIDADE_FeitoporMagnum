package ATIVIDADE1;
public class Questao01_Paciente {
    int Codigo;
    String Nome, DatadeNascimento, Sexo, PlanoSaude, Alergia, Tiposanguineo;
    public Questao01_Paciente(String Nome, int cod, String DatadeNascimento, String Sexo, String Alergia, String saude, String Tiposanguineo){
        this.Codigo = cod;
        this.PlanoSaude = saude;
        this.Alergia = Alergia;
        this.Nome = Nome;
        this.DatadeNascimento = DatadeNascimento;
        this.Tiposanguineo = Tiposanguineo;
        this.Sexo = Sexo;
    }
}
