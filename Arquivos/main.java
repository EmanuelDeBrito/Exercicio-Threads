public class Main {
  public static void main(String[] args) {
    Car carro1 = new Car();
    Car carro2 = new Car();
    Car carro3 = new Car();
    Car carro4 = new Car();

    carro1.carro = 1;
    carro2.carro = 2;
    carro3.carro = 3;
    carro4.carro = 4;

    carro1.start();
    carro2.start();  
    carro3.start();
    carro4.start();  

    try{
      carro1.join();
      carro2.join();
      carro3.join();
      carro4.join();
    }catch(InterruptedException e){
       System.out.println(e);
    }
    
    if((carro1.contador < carro2.contador) && (carro1.contador < carro3.contador) && (carro1.contador < carro4.contador)){
      System.out.println("Carro 1 venceu");
    }else if ((carro2.contador < carro1.contador) && (carro2.contador < carro3.contador) && (carro2.contador < carro4.contador)){
      System.out.println("Carro 2 venceu");
    }else if ((carro3.contador < carro1.contador) && (carro3.contador < carro2.contador) && (carro3.contador < carro4.contador)){
      System.out.println("Carro 3 venceu");
    }else{
        System.out.println("Carro 4 venceu");
    }

  }
}