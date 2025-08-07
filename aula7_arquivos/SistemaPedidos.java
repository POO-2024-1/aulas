package aula7_arquivos;

import java.io.IOException;

public class SistemaPedidos {
    public static void main(String[] args) {
        ClientePF clienteArquivo = new ClientePF("Leitor de Arquivo", "file@system.com", "999.888.777-66");
        String nomeArquivo = "novo_pedido.csv";

        try {
            System.out.println("Lendo pedido do arquivo: " + nomeArquivo);
            Pedido pedidoDoArquivo = LeitorDePedidos.carregarPedidoDeArquivo(nomeArquivo, clienteArquivo);
            System.out.println("Pedido carregado com sucesso!");

            System.out.println("\n" + pedidoDoArquivo.gerarRecibo());

        } catch (IOException e) {
            System.err.println("ERRO AO LER O ARQUIVO DE PEDIDO: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("ERRO DE FORMATAÇÃO EM UM NÚMERO NO ARQUIVO: " + e.getMessage());
        }
    }
}