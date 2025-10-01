package secao16_interfaces.projeto1.models.entities;
import java.time.LocalDateTime;


public class CarRental {
    private LocalDateTime Start;
    private LocalDateTime Finish;

    private Vehicle vehicle;
    private Invoice invoice;


    public CarRental() {
    }

    public CarRental(LocalDateTime Start, LocalDateTime Finish,  Vehicle vehicle, Invoice invoice) {
        this.Start = Start;
        this.Finish = Finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return Start;
    }

    public void setStart(LocalDateTime start) {
        Start = start;
    }

    public LocalDateTime getFinish() {
        return Finish;
    }

    public void setFinish(LocalDateTime finish) {
        Finish = finish;
    }

}
