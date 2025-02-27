public class lowPrioConCreator extends reqCreator {
    @Override
    public RequestProduct createRequest() {
        return new lowPrioConcrete();
    }
}
