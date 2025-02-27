import java.time.LocalDate;

public class hiPrioConcrete implements RequestProduct {

    public String priority;
    public String status;
    public String expireDate;

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expireDate = LocalDate.now().toString();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}