package reservaSala;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
    	Scanner sc = new Scanner(System.in);
        
        Setor s1 = new Setor();
        System.out.println("Informe seu Setor: ");
        String nomeSetor1 = sc.nextLine();
        
        s1.setNome(nomeSetor1);

        // Cargo
        Cargo c1 = new Cargo();
        System.out.println("Informe seu cargo: ");
        String cargo1 = sc.nextLine();
        c1.setNome(cargo1);
        System.out.println("Informe o Salário");
        float salario1 = sc.nextFloat();
        c1.setSalario(salario1);
        sc.nextLine();

        Funcionario f1 = new Funcionario();
        System.out.println("Informe seu Nome: ");
        String nome1 = sc.nextLine();
        f1.setNome(nome1);
        f1.setCargo(c1);
        f1.setSetor(s1);

        Sala sala1 = new Sala();
        sala1.setSala(1);
        sala1.setQntLugar(10);

        Sala sala2 = new Sala();
        sala2.setSala(2);
        sala2.setQntLugar(20);

        Sala sala3 = new Sala();
        sala3.setSala(3);
        sala3.setQntLugar(15);
        
        Reserva r1 = new Reserva();
        Date dt1 = new Date();
        r1.setFuncionario(f1);
        r1.setSala(sala1);
        r1.setDataHora(dt1);
        
        ReservaMes reservaMes = new ReservaMes();
        reservaMes.adicionarReserva(r1);

        boolean disponivel = reservaMes.salaDisponivel(sala1, dt1);
        System.out.println("Sala 1 disponível na data atual? " + disponivel);
        
        boolean disponivel2 = reservaMes.salaDisponivel(sala2, dt1);
        System.out.println("Sala 2 disponível na data atual? " + disponivel2);
        
        boolean disponivel3 = reservaMes.salaDisponivel(sala3, dt1);
        System.out.println("Sala 3 disponível na data atual? " + disponivel3);
        
        List<Reserva> dataDsp = reservaMes.consultarReservasPorData(dt1);
        if (dataDsp.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada na data " + dt1);
        } else {
            System.out.println("Reservas encontradas na data " + dt1 + ":");
            for (Reserva r : dataDsp) {
                System.out.println("- Sala " + r.getSala().getSala() + " reservada por " + r.getFuncionario().getNome());
            }
        }

    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        new Main();
    }
}
