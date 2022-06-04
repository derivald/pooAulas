package aula05a;

public class ContaBanco {

  // Atributos
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;

  // Métodos personalizados
  public void estadoAtual(){
    System.out.println("--------------------------");
   System.out.println("Conta: " + this.getNumConta());
   System.out.println("Tipo: " + this.getTipo());
   System.out.println("Dono " + this.getDono());
   System.out.println("Conta: " + this.getSaldo());
   System.out.println("Status: " + this.getStatus());

   }



  public void abrirConta(String t) {
    this.setTipo(t);
    this.setStatus(true);
    if (t.equalsIgnoreCase("CC")) {
      this.setSaldo(50);
    } else if (t.equalsIgnoreCase("CP")) {
      this.setSaldo(150);
    }
    System.out.println("Conta aberta com sucesso!");

  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta com saldo, retirar dinheiro!");
    } else if (this.getSaldo() < 0) {
      System.out.println("Não pode fechar, Saldo Negativo!");
    } else {
      this.setStatus(false);
      System.out.println("Conta encerrada com sucesso!");
    }

  }

  public void depositar(float v) {
    if (this.getStatus()) {
      this.setSaldo(getSaldo() + v);
      System.out.println("Depósito realizado com sucesso! na conta de " + this.getDono());
    } else {
      System.out.println("Impossível depositar em conta fechada");
    }
  }

  public void sacar(float v) {
    if (this.getStatus()) {
      if (getSaldo() >= v) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Saque realizado na conta de " + this.getDono());
      } else {
        System.out.println("Saldo insuficiente na conta de " + this.getDono());
      }

    } else {
      System.out.println("Impossível sacar de conta fechada");
    }

  }

  public void pagarMensal() {
    int v = 0;
    if (this.getTipo().equalsIgnoreCase("CC")) {
      v = 12;
    } else if (this.getTipo().equalsIgnoreCase("CP")) {
      v = 20;
    }
    if (this.getStatus()) {
      if (this.getSaldo() > v) {
        this.setSaldo(getSaldo() - v);
        System.out.println(
            "Mensalidade paga com sucesso! por " + this.getDono());
      }else{
        System.out.println("Impossível pagar um conta fechada");
      }
    }
  }
  // Métodos Especiais getters && setters
 

  public ContaBanco() { // Começando pelo Construtor
    this.saldo = 0;
    this.status = false;

  }
  public int getNumConta(){
    return numConta;
  }
  public void setNumConta(int numConta){
    this.numConta = numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDono() {
    return dono;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

}
