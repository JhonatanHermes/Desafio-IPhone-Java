public class Main {
  public static void main(String[] args) {
      IPhone iphone = new IPhone("iPhone 8");

      // Testando funcionalidades de ReprodutorMusical
      iphone.tocarMusica("Shape of You");
      iphone.pausarMusica();
      iphone.pararMusica();

      // Testando funcionalidades de AparelhoTelefonico
      iphone.ligar("123456789");
      iphone.atender();
      iphone.desligar();

      // Testando funcionalidades de NavegadorInternet
      iphone.abrirPagina("https://www.apple.com");
      iphone.buscar("iPhone 8 specs");
      iphone.fecharNavegador();
  }
}
