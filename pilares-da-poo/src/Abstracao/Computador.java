package Abstracao;

public class Computador {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Facebook");
        FacebookMessanger fcb = new FacebookMessanger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Telegram");
        TelegramMessenger tlg = new TelegramMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        System.out.println("-------------------------------------------------------");
    }
}
