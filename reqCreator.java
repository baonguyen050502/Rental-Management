public abstract class reqCreator {

    public abstract RequestProduct createRequest();

    public void processRequest() {
        RequestProduct request = createRequest();
        request.setPriority();
        request.setStatus();
        request.setExpire();
        request.processRequest();
    }
}
