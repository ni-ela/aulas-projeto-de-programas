public class Dono {
  private String nome;
  private String endereco;
  private String telefone;
  private Boolean consultaMarcada;
  private Boolean tratamentoMarcado;
  private Boolean consultaPaga;
  private Boolean tratamentoPago;  

  public Dono Dono() {
  }

  public Dono Dono(String nome, String endereco, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  // Getters
  public String getNome() {
    this.nome = nome;
  }

  public String getEndereco() {
    this.endereco = endereco;
  }

  public String getTelefone() {
    this.telefone = telefone;
  }

  // Demais métodos
  public void marcarConsulta() {
    this.consultaMarcada = true;
  }

  public void marcarTratamento() {
    this.tratamentoMarcado = true;
  }

  public void pagarConsulta() {
    this.consultaPaga = true;
  }

  public void pagarTratamento() {
    this.tratamentoPago = true;
  }
}