package aula7_arquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeitorDePedidos {

    public static Pedido carregarPedidoDeArquivo(String nomeArquivo, Cliente cliente) throws IOException {
        Pedido pedido = new Pedido(cliente);

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length < 4) continue;

                String tipo = campos[0].trim();
                String nome = campos[1].trim();
                double precoBase = Double.parseDouble(campos[2].trim());
                int quantidade = Integer.parseInt(campos[4].trim());

                Produto produto;
                if ("FISICO".equalsIgnoreCase(tipo)) {
                    double frete = Double.parseDouble(campos[3].trim());
                    produto = new ProdutoFisico(nome, precoBase, frete);
                } else if ("DIGITAL".equalsIgnoreCase(tipo)) {
                    produto = new ProdutoDigital(nome, precoBase);
                } else {
                    continue;
                }

                produto.adicionarEstoque(10);

                ItemPedido item = new ItemPedido(produto, quantidade);
                pedido.adicionarItem(item);
            }
        }
        return pedido;
    }
}