package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;// do método construtos

    // método construtor mesmo nome da classe
    public  Caneta(){
        this.tampar();
        this.cor = "Azul";

    }
    // método get e set
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m ;
    }
    public float getPonta(){
        return this.ponta;

    }
    public void setPonta(float p){
        this.ponta = p;
    }

    // faz parte do método tampar
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);

        System.out.println("Cor" + this.cor);

        System.out.println("Tampada" + this.);

        // mesma coisa
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
    }

    }
       


    
