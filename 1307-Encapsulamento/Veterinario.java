public class Veterinario {
  private String nome;
  private String endereco;
  private String telefone;
  private String numeroConselhoVeterinario;
  private Boolean consultaEfetuada;
  private Boolean tratamentoEfetuado;

  public Veterinario Veterinario() {
  }

  public Veterinario Veterinario(String nome, String endereco, String telefone, String numeroConselhoVeterinario) {
  this.nome = nome;
  this.endereco = endereco;
  this.telefone = telefone;
  this.numeroConselhoVeterinario = numeroConselhoVeterinario;
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

  public void setNumeroConselhoVeterinario(String numeroConselhoVeterinario) {
    this.numeroConselhoVeterinario = numeroConselhoVeterinario;
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

  public String getNumeroConselhoVeterinario() {
    this.numeroConselhoVeterinario = numeroConselhoVeterinario;
  }

  // Demais métodos
  public void efetuarConsulta() {
    this.consultaEfetuada = true;
  }
 
  public void efetuarTratamento() {
    this.tratamentoEfetuado = true;
  }  
}