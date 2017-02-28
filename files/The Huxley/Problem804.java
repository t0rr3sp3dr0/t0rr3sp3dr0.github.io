import java.util.Scanner;

/**
 * Created by phts on 08/06/16.
 */
public class Lista {

    public static void main(String[] args) {
        String nome;
        double valor;
        int quantidade;

        Scanner in = new Scanner(System.in);

        Lista lista = new Lista();
        ListaProdutos lp = lista.new ListaProdutos();
        for (int codigo = 1; codigo <= 3; codigo++) {
            nome = in.nextLine();
            valor = Double.parseDouble(in.nextLine());
            quantidade = Integer.parseInt(in.nextLine());
            lp.inserir(lista.new Produto(codigo, nome, valor, quantidade));
        }

        System.out.println(lp.procurarProduto(1));
        System.out.println(lp.procurarProduto(3));
        System.out.println(lp.procurarProduto(5));
    }

    public class Produto {
        int codigo;
        String nome;
        double valor;
        int quantidade;

        public Produto(int codigo, String nome, double valor, int quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
            this.quantidade = quantidade;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
        }
    }

    public class ListaProdutos {
        Produto produto;
        ListaProdutos proximo;

        public ListaProdutos() {
            this.produto = null;
            this.proximo = null;
        }

        public String procurarProduto(int codigo) {
            if (this.proximo != null) {
                if (this.produto.getCodigo() == codigo)
                    return this.produto.toString();
                else
                    return this.proximo.procurarProduto(codigo);
            } else
                return "Produto Inexistente!";
        }

        public void inserir(Produto produto) {
            if (this.produto == null) {
                this.produto = produto;
                this.proximo = new ListaProdutos();
            } else
                this.proximo.inserir(produto);
        }
    }
}
