
import main.list.OperacaoBasica.ListaTarefas;
import main.list.Ordenacao.OrdenacaoPessoas;

import main.set.Operacaobasica.ConjuntoConvidado;
import main.set.Ordenacao.CadastroProdutos;
import main.set.Pesquisa.AgendaContatos;
 
import main.list.Pesquisa.CatalagoLivros;

public class App {
    public static void main(String[] args) throws Exception {

        //Operação basica em List 
        
        ListaTarefas tarefas = new ListaTarefas();
        System.out.println(tarefas.obterNumeroTotalTarefas()); //Saida deve ser 0
        tarefas.adicionarTarefa("Estudar Java");
        System.out.println(tarefas.obterNumeroTotalTarefas()); //Saida deve ser 1
        tarefas.removerTarefa("Estudar Java");
        System.out.println(tarefas.obterNumeroTotalTarefas()); //Saida deve ser 0
        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Estudar Javascript");
        tarefas.adicionarTarefa("Estudar Python");
        tarefas.adicionarTarefa("Estudar C++");
        tarefas.obterListaTarefas();

        //Operação pesquisa em list
        CatalagoLivros livros = new CatalagoLivros();
        livros.adicionarLivro("Aprendendo Java", "William", 2023);
        livros.adicionarLivro("Aprendendo Javascript", "William", 2022);
        livros.adicionarLivro("Aprendendo Python", "Joao", 2020);
        livros.adicionarLivro("Aprendendo C++", "William", 2021);
        livros.adicionarLivro("Aprendendo Java", "William", 1995);

        System.out.println(livros.pesquisarPorAutor("William"));
        System.out.println(livros.pesquisarPorAno(2021, 2023));
        System.out.println(livros.pesquisarPorTitulo("Aprendendo Java"));
         
        //Operação ordenacao em list
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adicionarPessoa("William", 20, 180);
        pessoas.adicionarPessoa("João", 30, 170);
        pessoas.adicionarPessoa("Maria", 40, 160);
        pessoas.adicionarPessoa("José", 50, 150);

        System.out.println(pessoas.ordenarPessoasPorAltura());
        System.out.println(pessoas.ordenarPessoasPoridade());

         

        //Metódos da collections Set 
        //testando o set com metódo padrões.
        ConjuntoConvidado convidados = new ConjuntoConvidado();
        convidados.adicionarConvidado("João", 123);
        //Testanto o se de fato o set não permite a duplicação de info:
        convidados.adicionarConvidado("João", 124);
        convidados.adicionarConvidado("João", 124);
        System.out.println(convidados.quantidadeConvidados());
        System.out.println(convidados.getConvidados());
        convidados.removerConvidado("João");
        System.out.println(convidados.getConvidados());
        System.out.println(convidados.quantidadeConvidados());

        //Testando o set com metödos de pesquisa do Set;
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("William", "11957159902");
        agenda.exibirContatos();
        agenda.atualizarContato("William", "11957159903");
        System.out.println(agenda.pesquisarContatos("William"));

        //Testando o set com metödos de ordenação do Set;
        System.out.println("Testando metódos do treeset");
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(6, "Bola", 10.0, 10);
        produtos.adicionarProduto(2, "Dola", 30.0, 10);
        produtos.adicionarProduto(3, "Cola", 10.0, 10);
        produtos.adicionarProduto(4, "Aola", 5.0, 10);
        produtos.adicionarProduto(5, "Fola", 9.0, 10);
        produtos.adicionarProduto(1, "Pola", 10.0, 10);
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());

        
        //Testando o map operação básica:
        

    }
    
}
