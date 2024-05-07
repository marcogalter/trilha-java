package Polimorfismo;

public abstract class ServicoMenssagemInstantenea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Valindando se está conectado a internet");
    }
}
