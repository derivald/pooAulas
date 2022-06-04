
package aula03;

/**
 *
 * @author LINCOLN
 */
public class Aula03 {

    //criando objeto c1
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Faber Castel";
        c1.cor = "Preta";
        //c1.ponta = 0.7f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
             
        c1.status();

     
        
        
       
       
    }
    
}
