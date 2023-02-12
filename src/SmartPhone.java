public class SmartPhone extends Computer{
    public boolean isItAndroid;
    public SmartPhone(String cpu, String nameOfDevice, Boolean isItHandy, boolean isItAndroid) {
        super(cpu, nameOfDevice, isItHandy);
    }
   @Override
   public void isNowRunning(){
        System.out.println("The device is now running");
    }
   @Override
   public boolean canRecieveCalls(){
        if (isItHandy = true){
            return true;
        }
        return false;
    }
    public void printIsItHandy (){
        System.out.println(super.isItHandy);
    }


}
