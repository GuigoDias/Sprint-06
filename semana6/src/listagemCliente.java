public class listagemCliente {

    public static String funcaoIdade(int idade) {
        if (idade <= 17){
            return "ADOLESCENTE";
        } else if (idade >= 18 && idade <= 29) {
            return "JOVEM";
        } else if (idade >= 30 && idade <= 59) {
            return "ADULTO";
        } else if (idade >= 60) {
            return "IDOSO";
        } else {
            return "IDADE INVÁLIDA";
        }
    }
    public static void main(String[] args) {
        String nomeFulano = " Fulano";
        String nomeSicrano = " Sicrano";
        int anoAtual = 2023;
        int nascimentoFulano = 1980;
        int nascimentoSicrano = 2000;
        int idadeFulano = anoAtual - nascimentoFulano;
        int idadeSicrano = anoAtual - nascimentoSicrano;
        String etariaFulano = funcaoIdade(idadeFulano);
        String etariaSicrano = funcaoIdade(idadeSicrano);

        System.out.println(">>> Listagem dos Clientes");
        System.out.println("Ano Atual: " + anoAtual);
        System.out.println("_________________________");
        System.out.println("Nome: " + nomeFulano);
        System.out.println("Data de Nascimento: " + nascimentoFulano);
        System.out.println("Idade: " + idadeFulano);
        System.out.println("Característica Etária: " + etariaFulano);
        System.out.println("_________________________");
        System.out.println("Nome: " + nomeSicrano);
        System.out.println("Data de Nascimento: " + nascimentoSicrano);
        System.out.println("Idade: " + idadeSicrano);
        System.out.println("Característica Etária: " + etariaSicrano);
    }
}
