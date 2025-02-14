public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  private String modelo;

  public IPhone(String modelo) {
      this.modelo = modelo;
  }
  
  // Implementação de ReprodutorMusical
  @Override
  public void tocarMusica(String musica) {
      System.out.println("Tocando a música: " + musica);
  }
  
  @Override
  public void pausarMusica() {
      System.out.println("Música pausada.");
  }
  
  @Override
  public void pararMusica() {
      System.out.println("Música parada.");
  }
  
  // Implementação de AparelhoTelefonico
  @Override
  public void ligar(String numero) {
      System.out.println("Ligando para " + numero);
  }
  
  @Override
  public void atender() {
      System.out.println("Atendendo a ligação.");
  }
  
  @Override
  public void desligar() {
      System.out.println("Desligando a ligação.");
  }
  
  // Implementação de NavegadorInternet
  @Override
  public void abrirPagina(String url) {
      System.out.println("Abrindo a página: " + url);
  }
  
  @Override
  public void buscar(String termo) {
      System.out.println("Buscando por: " + termo);
  }
  
  @Override
  public void fecharNavegador() {
      System.out.println("Fechando o navegador.");
  }
  
  // Getters e Setters
  public String getModelo() {
      return modelo;
  }
  
  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
}
