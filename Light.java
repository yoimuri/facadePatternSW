class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Lights are ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are OFF.");
    }
}
