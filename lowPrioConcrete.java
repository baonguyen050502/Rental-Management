import java.time.LocalDate;

public class lowPrioConcrete implements RequestProduct {

    public String priority;
    public String status;
    public String expireDay;

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}