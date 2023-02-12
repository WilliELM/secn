public abstract class Computer {
    String cpu;
    String nameOfDevice;
    Boolean isItHandy;

    public void isNowRunning(){
        System.out.println("The device is now running");
    }
    public boolean canRecieveCalls(){
        if (isItHandy = true)
            return true;

        return false;
    }

    public Computer(String cpu, String nameOfDevice, Boolean isItHandy){
        this.cpu = cpu;
        this.nameOfDevice = nameOfDevice;
        this.isItHandy = isItHandy;

    }
}
