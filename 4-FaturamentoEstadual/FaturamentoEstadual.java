public class FaturamentoEstadual {
    public static void main(String[] args) {
        // Faturamento mensal por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calcula o valor total mensal da distribuidora
        double valorTotalMensal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calcula o percentual de representação de cada estado
        double percentualSP = (faturamentoSP / valorTotalMensal) * 100;
        double percentualRJ = (faturamentoRJ / valorTotalMensal) * 100;
        double percentualMG = (faturamentoMG / valorTotalMensal) * 100;
        double percentualES = (faturamentoES / valorTotalMensal) * 100;
        double percentualOutros = (faturamentoOutros / valorTotalMensal) * 100;

        // Exibe os resultados
        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + percentualSP + "%");
        System.out.println("RJ: " + percentualRJ + "%");
        System.out.println("MG: " + percentualMG + "%");
        System.out.println("ES: " + percentualES + "%");
        System.out.println("Outros: " + percentualOutros + "%");
    }
}

