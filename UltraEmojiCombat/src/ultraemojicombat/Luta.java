
package ultraemojicombat;

import java.util.Random;


public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos publicos
    public void marcarLuta(Lutador lutador_1, Lutador lutador_2){
        if(lutador_1.getCategoria().equals(lutador_2.getCategoria())
                && lutador_1 != lutador_2){
            this.aprovada = true;
            this.desafiado = lutador_1;
            this.desafiante = lutador_2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("########################################");
            System.out.println("====== Desafiado ======");
            this.desafiado.apresentar();
            System.out.println("########################################");
            System.out.println("======Desafiante ======");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);    // 1  2  3
            System.out.println("########## Resultado da Luta #############");
            switch(vencedor){
                case 0: // Empate
                    System.out.println("A Luta Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vende
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("======================== FIM ===============");
            
            
        }else{
            System.out.println("A luta nao pode acontecer!!");
        }
    }
    
    //metodos especiais

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

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
