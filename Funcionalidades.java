package UMLiphone;

import UMLiphone.aparelhoTelefonico;
import UMLiphone.reprodutorMusical;
import UMLiphone.navegadorInternet;

public class Funcionalidades implements reprodutorMusical, aparelhoTelefonico, navegadorInternet{

    public void tocar(){
        System.out.println("A música está tocando.");
    }
    public void pausar(){
        System.out.println("A música está pausada.");
    }
    public void selecionarMusica(String musica){
        System.out.println("A música: " + musica + " Foi selecionada.");
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero +"...");
    }
    public void atender(){
        System.out.println("em ligação...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz ativado");
    }

    public void exibirPagina(String urlPagina){
        System.out.println("Exibindo página.");
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }
}
