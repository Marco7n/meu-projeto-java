package reservaSala;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
    	Scanner sc = new Scanner(System.in);
        ReservaMes reservaMes = new ReservaMes();
        List<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do{
            System.out.println("\n--- Sistema de Reservas ---");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Adicionar Reserva");
            System.out.println("3 - Remover Reserva");
            System.out.println("4 - Realocar Reserva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1: 
                System.out.println("Nome do Funcionário");
                String nomeFunc = sc.nextLine();
                System.out.println("Setor: ");
                String setor = sc.nextLine();
                System.out.println("Cargo: ");
                String cargo = sc.nextLine();
                System.out.println("Salário: ");
                float salario = sc.nextFloat();

                sc.nextLine();

                Setor s1 = new Setor();
                s1.setNome(setor);

                Cargo c1 = new Cargo();
                c1.setNome(cargo);
                c1.setSalario(salario);

                Funcionario f1 = new Funcionario();
                f1.setNome(nomeFunc);
                f1.setCargo(c1);
                f1.setSetor(s1);

                funcionarios.add(f1);
                System.out.println("Funcionário Cadastrado com sucesso");
                break;


                case 2:
                if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado!");
                        break;
                    }

                System.out.println("Escolha o funcionário:");
                for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println(i + " - " + funcionarios.get(i).getNome());
                    }
                int indiceFunc = sc.nextInt();
                sc.nextLine();
                Funcionario funcEscolhido = funcionarios.get(indiceFunc);  
                
                
                System.out.println("Número da Sala: ");
                int numeroSala = sc.nextInt();
                sc.nextLine();

                System.out.println("Informe o numero da sala: ");
                int salaEscolhida = sc.nextInt();
                sc.nextLine();

                Sala sala = new Sala();
                sala.setSala(salaEscolhida);
                sala.setQntLugar(10);
                System.out.println("Sala cadastrada com sucesso!");
                
                    Date data = new Date(); 
                    Reserva r = new Reserva();
                    r.setFuncionario(funcEscolhido);
                    r.setSala(sala);
                    r.setDataHora(data);
                    reservaMes.adicionarReserva(r);
                    System.out.println("Reserva adicionada com sucesso!");

                break;
                case 3:
                List<Reserva> reservas = reservaMes.getReservas(); 
                if (reservas.isEmpty()) {
                    System.out.println("Nenhuma reserva cadastrada!");
                    break;
                }
                for(int i = 0; i < reservas.size(); i++) {
                    Reserva res = reservas.get(i);
                    System.out.println(i + " - Sala: " + res.getSala().getSala() + ", Funcionário: " + res.getFuncionario().getNome() + ", Data: " + res.getDataHora());
                }
                System.out.println("Escolha o índice da reserva que deseja remover:");
                int indiceRemover = sc.nextInt();
                sc.nextLine();
                if(indiceRemover < 0 || indiceRemover >= reservas.size()) {
                    System.out.println("Índice inválido!");
                } else {
                    Reserva reservaARemover = reservas.get(indiceRemover);
                    reservaMes.removerReserva(reservaARemover);
                    System.out.println("Reserva removida com sucesso!");
                }
                break;
                case 4:
                if (reservaMes.getReservas().isEmpty()) {
                    System.out.println("Nenhuma reserva cadastrada!");
                    break;
                }
                for (int i = 0; i < reservaMes.getReservas().size(); i++) {
                    Reserva res = reservaMes.getReservas().get(i);
                    System.out.println(i + " - Sala: " + res.getSala().getSala() + ", Funcionário: " + res.getFuncionario().getNome() + ", Data: " + res.getDataHora());
                }
                System.out.println("Escolha o índice da reserva que deseja realocar:");
                int indiceRealocar = sc.nextInt();
                sc.nextLine();
                if (indiceRealocar < 0 || indiceRealocar >= reservaMes.getReservas().size()) {
                    System.out.println("Índice inválido!");
                    break;
                }
                Reserva reservaARealocar = reservaMes.getReservas().get(indiceRealocar);
                
                System.out.println("Informe o novo número da sala: ");
                int novaSalaNum = sc.nextInt();
                sc.nextLine();
                Sala novaSala = new Sala();
                novaSala.setSala(novaSalaNum);
                novaSala.setQntLugar(10);
                
                Date novaData = new Date(); 
                
                reservaMes.realocarReserva(reservaARealocar, novaData, novaSala);
                System.out.println("Reserva realocada com sucesso!");
                break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        new Main();
    }
}
