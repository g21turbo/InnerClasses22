public class Main {

    public static void main(String[] args) {


        GearBox ae86 = new GearBox(5);

        //Reference outer class first, then inner class, object name, inner class name and parameters
        ae86.addGear(1, 3.587);
        ae86.addGear(2, 2.022);
        ae86.addGear(3, 1.384);
        ae86.addGear(4, 1.00);
        ae86.addGear(5, 0.861);
        ae86.operateClutch(true);
        ae86.changeGear(1);
        ae86.operateClutch(false);
        System.out.println(ae86.wheelSpeed(1000));
        ae86.operateClutch(true);
        ae86.changeGear(2);
        ae86.operateClutch(false);
        System.out.println(ae86.wheelSpeed(2500));


    }


}
