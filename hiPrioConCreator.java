public class hiPrioConCreator extends reqCreator {
    @Override
    public RequestProduct createRequest() {
        return new hiPrioConcrete();
    }
}
