
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        for (int inicio = 0; inicio < 1;){

            System.out.println("Bem vindo ao nosso caixa! O banco Galli agradece sua preferencia.");

            String cpf, senha, sair, resposta, banco;

            int menu, menu2;

            double saldo = 1000, saque = 0, deposito = 0, transferencia = 0, agencia, conta;

            Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu cpf para continuar:");
            cpf = ler.next();

            if (cpf.equals("123.456.789-00"))
            {
                System.out.println("Digite a senha para continuar:");
                senha = ler.next();

                for (int fsenha = 1; fsenha <= 4; fsenha++)
                {
                    if (senha.equals("01020304")){
                        System.out.println("Senha correta.");
                        fsenha = 4;
                    }else{
                        switch (fsenha){
                            case 1:
                                System.out.println("Senha incorreta, voce tem  mais 2 tentativas, digite sua senha novamente:");
                                senha = ler.next();
                                break;

                            case 2:
                                System.out.println("Voce tem essa e mais 1 tentativa, digite sua senha novamente:");
                                senha = ler.next();
                                break;

                            case 3:
                                System.out.println("Ultima tentativa, casso esteja errada sua conta sera bloqueada, digite sua senha novamente:");
                                senha = ler.next();
                                break;

                            case 4:
                                System.out.println("Sua conta foi bloqueada, venha para nosso banco para desbloquear ela.");
                                System.exit(0);
                                break;
                        }
                    }
                }
            }else{
                System.out.println("Nao foi permitido a sua solicitacao.");
                System.exit(0);
            }


            for (int fmenu = 0; fmenu < 1;){
                System.out.println("Menu\n"+"Escolha a opcao desejada:\n"+"1 - Saldo\n"+"2 - Deposito\n"+"3 - Saque\n"+"4 - Transferencia\n"+"0 - Sair\n");

                menu = ler.nextInt();

                switch (menu){
                    case 1:
                        System.out.println("Saldo total: " + saldo );
                        System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                        resposta = ler.next();
                        if (resposta.equals("cancelar"))
                        {
                            fmenu++;
                        }

                        break;

                    case 2:
                        System.out.print("Digite o valor que deseja depositar: ");
                        deposito = ler.nextDouble();
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo agora eh de: " + saldo );
                        System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                        resposta = ler.next();
                        if (resposta.equals("cancelar"))
                        {
                            fmenu++;
                        }
                        break;

                    case 3:
                        System.out.print("Digite o quanto deseja sacar: ");
                        saque = ler.nextDouble();
                        if (saque <= saldo){
                            saldo = saldo - saque;
                            System.out.println("Voce sacou: " + saque );
                            System.out.println("Seu saldo agora eh de: " + saldo );
                            System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                            resposta = ler.next();
                            if (resposta.equals("cancelar"))
                            {
                                System.out.println("Sua sessao foi encerrada.");
                                fmenu++;
                            }
                        }else{
                            System.out.println("Voce nao tem esse valor na conta.");
                            System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                            resposta = ler.next();
                            if (resposta.equals("cancelar"))
                            {
                                System.out.println("Sua sessao foi encerrada.");
                                fmenu++;
                            }
                        }

                        break;

                    case 4:
                        System.out.println("Digite o valor que deseja transferir: ");
                        transferencia = ler.nextDouble();
                        if (transferencia <= saldo){
                            saldo = saldo - transferencia;
                            System.out.println("Digite o numero da conta que deseja transferir: ");
                            conta = ler.nextDouble();
                            System.out.println("Digite o nome do banco que deseja transferir: ");
                            banco = ler.next();
                            System.out.println("Digite o numero da agencia: ");
                            agencia = ler.nextDouble();
                            System.out.println("O valor foi transferido e seu saldo agora eh de: " + saldo);
                            System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                            resposta = ler.next();
                            if (resposta.equals("cancelar"))
                            {
                                System.out.println("Sua sessao foi encerrada.");
                                fmenu++;
                            }
                        }else{
                            System.out.println("Voce nao pode transferir um valor mais alto que seu saldo.");
                            System.out.println("Digite uma tecla qualquer e aperte enter para voltar ao menu, caso contrario digite cancelar para encerrar a sessao.");
                            resposta = ler.next();
                            if (resposta.equals("cancelar"))
                            {
                                System.out.println("Sua sessao foi encerrada.");
                                fmenu++;
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Sessao encerrada.");
                        fmenu++;
                        break;





                }

            }

        }
    }
}
