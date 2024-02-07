import java.util.List;

public class FaturamentoMensal {
    public static void main(String[] args) {
        // Dados do faturamento mensal em formato JSON
        double[] faturamentoDiario = {
            22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
            46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448,
            18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
            0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61
        };

        // Calcula o menor e o maior valor de faturamento
        double menorValor = faturamentoDiario[0];
        double maiorValor = faturamentoDiario[0];
        for (double valor : faturamentoDiario) {
            if (valor < menorValor) {
                menorValor = valor;
            }
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        // Calcula a média mensal de faturamento
        double soma = 0;
        int diasComFaturamento = 0;
        for (double valor : faturamentoDiario) {
            soma += valor;
            if (valor > 0) {
                diasComFaturamento++;
            }
        }
        double mediaMensal = soma / diasComFaturamento;

        // Calcula o número de dias em que o valor de faturamento diário foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        // Resultados
        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}
