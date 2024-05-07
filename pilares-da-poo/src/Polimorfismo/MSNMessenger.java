package Polimorfismo;

public class MSNMessenger extends ServicoMenssagemInstantenea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Envia mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebe mensagem pelo MSN");
    }

}
