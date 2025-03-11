import java.util.Random;

class Car extends Thread {
  public int carro;
  public int posicao = 0;
  public int contador = 0; 

  Random gerador = new Random();

  public void run() {
    int passos;
    
    while (posicao < 100) {
      passos = gerador.nextInt(11);
      posicao += passos;
      contador++;
      System.out.println("Carro " + carro + " andou " + passos + " e está na posição: " + posicao);

      if (posicao >= 100) {
        System.out.println("O carro " + carro + " acabou a corrida");
        System.out.println(contador);
      }             
    }
  }

}