
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public String ligar(String numero) {
        System.out.println("A ligar para número: " + numero);
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public String exibirPagina(String url) {
        System.out.println("A exibir página: " + url);
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba");
    }

    @Override
    public void atualizarpagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("A selecionar música: " + musica);
        return musica;
    }
}