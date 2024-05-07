package Polimorfismo;

public class TelegramMessenger extends ServicoMenssagemInstantenea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Recebe mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebe mensagem pelo Telegram");
    }

}
