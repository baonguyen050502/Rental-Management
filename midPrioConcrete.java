import java.time.LocalDate;

public class midPrioConcrete implements RequestProduct {
    public String priority;
    public String status;
    public String expireDay;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated cmpletion date is " + expireDay);
    }
}