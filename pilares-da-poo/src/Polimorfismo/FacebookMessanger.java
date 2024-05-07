package Polimorfismo;

public class FacebookMessanger extends ServicoMenssagemInstantenea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Recebe mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebe mensagem pelo Facebook");
    }

}
