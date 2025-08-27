package reservaSala;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservaMes {
    private List<Reserva> reservas;

    public ReservaMes() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void realocarReserva(Reserva reserva, Date novaData, Sala novaSala) {
        reserva.setDataHora(novaData);
        reserva.setSala(novaSala);
    }

    public List<Reserva> consultarReservasPorData(Date data) {
        List<Reserva> result = new ArrayList<>();
        for (Reserva r : reservas) {
            if (r.getDataHora().equals(data)) {
                result.add(r);
            }
        }
        return result;
    }

    public boolean salaDisponivel(Sala sala, Date dataHora) {
        for (Reserva r : reservas) {
            if (r.getSala().equals(sala) && r.getDataHora().equals(dataHora)) {
                return false;
            }
        }
        return true;
    }
}