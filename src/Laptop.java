public class Laptop extends Computer{
    public Integer ageOfDevice;
    public Laptop(String cpu, String nameOfDevice, Boolean isItHandy, Integer ageOfDevice) {
        super(cpu, nameOfDevice, isItHandy);

    }
    @Override
    public void isNowRunning(){
        System.out.println("The device is now running");
    }
    @Override
    public boolean canRecieveCalls(){
        if (isItHandy = true)
            return true;

        return false;
    }
    public void printName(){
        System.out.println(super.nameOfDevice);
    }

}
