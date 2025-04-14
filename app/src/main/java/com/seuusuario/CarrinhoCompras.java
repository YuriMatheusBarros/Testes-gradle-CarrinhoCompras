package com.seuusuario;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CarrinhoCompras {

    public static double calcularTotal(double[] precos) {
        double total = 0.0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }

    public static double aplicarDesconto(double total, double porcentagem) {
        return total - (total * porcentagem / 100);
    }

    public static String mostrarProdutos(double[] precos) {
        StringBuilder sb = new StringBuilder();
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); 
        DecimalFormat df = new DecimalFormat("R$ #0.00", symbols); // Configura o formato com ponto
        for (double preco : precos) {
            sb.append("Produto: ").append(df.format(preco)).append("\n");
        }
        return sb.toString();
    }
    
    public static String mostrarResumo(double total, double totalComDesconto) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); // Forçar ponto como separador
        DecimalFormat df = new DecimalFormat("R$ #0.00", symbols);
        return "Total: " + df.format(total) + "\n" +
               "Total com Desconto: " + df.format(totalComDesconto);
    }    
}