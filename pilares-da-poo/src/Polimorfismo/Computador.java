package Polimorfismo;

public class Computador {
    public static void main(String[] args) {
        ServicoMenssagemInstantenea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fcb"))
            smi = new FacebookMessanger();
        else if (appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
}
}