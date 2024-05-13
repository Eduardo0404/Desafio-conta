import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //TODO: conhecer e importar a classe scanner
        Scanner s = new Scanner(System.in);

        int NumAgencia;
        String Nome,NomeAgencia;
        Double Saldo;

        //Exibir mensagens para o usuario
        System.out.println("Informe o numero da Agencia");
        //Obter valores digitados no terminal no Scanner
        NumAgencia = s.nextInt();

        //Exibir mensagens para o usuario
        System.out.println("Informe o nome da Agencia");
        //Obter valores digitados no terminal no Scanner
        NomeAgencia = s.next();

       //Exibir mensagens para o usuario
        System.out.println("Informe o seu nome");
        //Obter valores digitados no terminal no Scanner
        Nome = s.next();
        
        //Exibir mensagens para o usuario
        System.out.println("Informe o seu saldo");
        //Obter valores digitados no terminal no Scanner
        Saldo = s.nextDouble();

        //Exibir a mensagem de conta criada
        System.out.println("Ola " + Nome +", obrigado por criar uma conta em nosso banco, sua agencia e "+ NomeAgencia + ", conta " + NumAgencia + " e seu saldo " + Saldo + " ja esta disponivel para saque");
    }
}
