package Heranca;

public class ServicoMenssagemInstantenea {
    public void enviarMensagem(){
        validarConectadoInter();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInter(){
        System.out.println("Validar se esta conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}