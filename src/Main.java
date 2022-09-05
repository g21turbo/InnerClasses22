public class Main {

    public static void main(String[] args) {


        GearBox ae86 = new GearBox(5);

        //Reference outer class first, then inner class, object name, inner class name and parameters
        GearBox.Gear first = ae86.new Gear(1, 3.587);
        GearBox.Gear second = ae86.new Gear(2, 2.022);
        GearBox.Gear third = ae86.new Gear(3, 1.384);
        GearBox.Gear fourth = ae86.new Gear(4, 1.00);
        GearBox.Gear fifth = ae86.new Gear(5, 0.861);

        System.out.println(first.driveSpeed(1000));


    }


}
