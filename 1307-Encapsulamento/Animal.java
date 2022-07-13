public class Animal {
  private String nome;
  private String sexo;
  private Int idade;
  private String especie;
  private boolean tratamentoIniciado;

  public Animal Animal() {
  }

  public Animal Animal(String nome, String sexo, Int idade, String especie) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
    this.especie = especie;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setIdade(Int Idade) {
    this.idade = idade;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  // Getters
  public String getNome() {
    return nome;
  }

  public String getSexo() {
    return sexo;
  }

  public Int getIdade() {
    return idade;
  }

  public String getEspecie() {
    return especie;
  }

  // Demais métodos
  public void iniciarTratamento() {
    this.tratamentoIniciado = true;
  }

  public void finalizarTratamento() {
    this.tratamentoIniciado = False;
  }
 
}