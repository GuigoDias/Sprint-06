public class listagemProduto {
    public static void main(String[] args) {
        double precoLivro = 49.95;
        double precoCelular = 1470.76;
        System.out.println("""
                >>> Listagem dos Produtos
                _________________________
                Nome: Livro
                Preço: R$""" + precoLivro +
                """
                \n_________________________
                Nome: Celular
                Preço: R$""" + precoCelular);
    }
}
