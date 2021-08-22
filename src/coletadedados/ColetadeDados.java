
package coletadedados;

public class ColetadeDados {
String nome, sNome, lagradouro, bairro, cidade, estado;
    int numero, cep;

    public static void main(String[] args) {
        ColetadeDados coleta = new ColetadeDados();
        coleta.nome = "Ricardo";
        coleta.sNome = "Nunes";
        coleta.lagradouro = "Rua das flores";
        coleta.numero = 320;
        coleta.bairro = "Piritura";
        coleta.cep = 7903973;
        coleta.cidade = "São Paulo";
        coleta.estado = "São Paulo";
        System.out.println(coleta.nome);
        System.out.println(coleta.sNome);
        System.out.println(coleta.lagradouro);
        System.out.println(coleta.numero);
        System.out.println(coleta.bairro);
        System.out.println(coleta.cep);
        System.out.println(coleta.cidade);
        System.out.println(coleta.estado);
    }
}
    
