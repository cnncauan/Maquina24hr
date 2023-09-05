import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Marcos Cauan";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        boolean repetir = false;
        boolean parar = false;
        int operacao = 0;

        System.out.println("**********************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**********************************************\n\n\n");

        while (operacao >= 1 || operacao <=4) {

            System.out.println("""
                    Operações
                                    
                    1- Consultar saldo
                    2- Receber valor 
                    3- Transferir valor
                    4- Sair
                                    
                    Digite a opção desejada:
                    """);
            operacao = input.nextInt();

            if (operacao == 1) {
                System.out.println("Seu saldo em conta é: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Quanto você quer receber? ");
                double receberValor = input.nextDouble();
                System.out.println("\n Valor recebido R$ " + receberValor + "." + " Seu Saldo atual é R$: " + (saldo + receberValor));
            } else if (operacao == 3) {

                while (repetir == repetir) {

                    System.out.println("Quanto quer transferir? ");
                    double enviarValor = input.nextDouble();

                    if (enviarValor > saldo) {
                        System.out.println("Saldo insuficiente, por gentileza enviar valor dentro do seu saldo: " + saldo);
                        repetir = true;
                    } else {
                        System.out.println("Valor de R$ " + enviarValor + " enviado! " + " Seu saldo atual é R$ " + (saldo-enviarValor));
                        break;
                    }
                }
            } else if (operacao < 1 || operacao > 4) {
                System.out.println("As opção de serviço é apenas 1 à 4!");

            } else {
                System.out.println("Obrigado por utilizar nosso serviço!!!!");
                break;
            }
        }
    }
}