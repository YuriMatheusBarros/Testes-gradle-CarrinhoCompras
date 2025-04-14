package com.seuusuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoComprasTest {

    @Test
    public void testCalcularTotal() {
        System.out.println("Testando o cálculo total:");
        double[] precos = {29.90, 49.90, 15.00};
        double resultadoEsperado = 94.80;
        double resultadoObtido = CarrinhoCompras.calcularTotal(precos);

        System.out.println("Entrada: {29.90, 49.90, 15.00}");
        System.out.println("Resultado esperado: " + resultadoEsperado);
        System.out.println("Resultado obtido: " + resultadoObtido);

        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
        System.out.println("Teste bem-sucedido.\n");
    }

    @Test
    public void testAplicarDesconto() {
        System.out.println("Testando a aplicação de desconto:");
        double total = 100.00;
        double desconto = 10;
        double resultadoEsperado = 90.00;
        double resultadoObtido = CarrinhoCompras.aplicarDesconto(total, desconto);

        System.out.println("Entrada: Total = 100.00, Desconto = 10%");
        System.out.println("Resultado esperado: " + resultadoEsperado);
        System.out.println("Resultado obtido: " + resultadoObtido);

        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
        System.out.println("Teste bem-sucedido.\n");
    }

    @Test
    public void testMostrarProdutos() {
        System.out.println("Testando a exibição de produtos:");
        double[] precos = {29.90, 49.90, 15.00};
        String resultadoEsperado = "Produto: R$ 29.90\nProduto: R$ 49.90\nProduto: R$ 15.00\n";
        String resultadoObtido = CarrinhoCompras.mostrarProdutos(precos);

        System.out.println("Entrada: {29.90, 49.90, 15.00}");
        System.out.println("Resultado esperado:\n" + resultadoEsperado);
        System.out.println("Resultado obtido:\n" + resultadoObtido);

        assertEquals(resultadoEsperado, resultadoObtido);
        System.out.println("Teste bem-sucedido.\n");
    }

    @Test
    public void testMostrarResumo() {
        System.out.println("Testando o resumo final:");
        double[] precos = {29.90, 49.90, 15.00};
        double total = CarrinhoCompras.calcularTotal(precos);
        double totalComDesconto = CarrinhoCompras.aplicarDesconto(total, 10);
        String resultadoEsperado = "Total: R$ 94.80\nTotal com Desconto: R$ 85.32";
        String resultadoObtido = CarrinhoCompras.mostrarResumo(total, totalComDesconto);

        System.out.println("Entrada: {29.90, 49.90, 15.00}, Desconto de 10%");
        System.out.println("Resultado esperado:\n" + resultadoEsperado);
        System.out.println("Resultado obtido:\n" + resultadoObtido);

        assertEquals(resultadoEsperado, resultadoObtido);
        System.out.println("Teste bem-sucedido.\n");
    }
}