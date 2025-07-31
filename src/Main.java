public class Main {
    public static void main(String[] args) {
        double valorEmDolares = 59;
        double cotacaoDoDolar = 5.59;

        double valorEmReais = valorEmDolares * cotacaoDoDolar;

        String mensagem = """
                Valor em dólar($): %.0f
                Valor em reais(R$): %.2f
                """.formatted(valorEmDolares, valorEmReais);

        System.out.println(mensagem);
    }
}
