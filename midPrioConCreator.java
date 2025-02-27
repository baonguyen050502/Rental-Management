public class midPrioConCreator extends reqCreator {
    @Override
    public RequestProduct createRequest() {
        return new midPrioConcrete();
    }
}