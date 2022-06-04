package ultraemojoCombat;

import java.util.Random;

public class Luta {
    //1 Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;



    //Métodos Púlblicos
    public void marcarLuta(Lutador l1, Lutador l2 ){
        if(l1.getCategoria().equals(l2.getCategoria()) 
        && (l1 != l2)){
        
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;

        }

    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// gera 0, 1, ou 2
            System.out.println("==== RESULTADO DA LUTA =====");
            switch (vencedor){
                case 0:// Empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 1:// Ganhou desafiado
                System.out.println(this.desafiado.getNome() + " Ganhou a Luta");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

                case 2: //Ganhou desafiante
                System.out.println(this.desafiante.getNome() + " Ganhou a Luta");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                System.out.println("==========================");
                break;
            default:
            }

           

        }else{

            System.out.println("A luta não pode ser realizada!");
                     
                    
        }




    }
    // sem o construtor//
    /*public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }*/

  

    //2 Métodos especiais getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
