public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.selecionarMusica("Lua de Cristal");
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        // Aparelho Telefônico
        iphone.ligar("912345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();

        // Navegador Internet
        iphone.exibirPagina("https://www.linkedin.com/in/tayara-cruz-0b055970/");
        iphone.adicionarNovaAba();
        iphone.atualizarpagina();
    }
}
