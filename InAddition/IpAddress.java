package sk.itsovy.kovalcik.inAddition;

public class IpAddress {

    private int[] numbers;

    public IpAddress(String address) {
        numbers = new int[4];
        String[] a = address.split("\\.", 4);
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            numbers[i] = Integer.parseInt(s);
            System.out.println(numbers[i]);
        }
        if (a.length!=4){
            System.out.println("Address doesn´t have 4 substrings!");
            numbers[0]=-78965412;
        }
    }

    public static void main(String[] args) {
        IpAddress address = new IpAddress("192.168.10.002");


        for (int a : address.getNumbers()) {
            System.out.println(a + " from Class");
        }

        System.out.println(address.isValid());


        System.out.println("\n\n\n\n");
        System.out.println(new IpAddress("192.168.5.15").isValid()); //true
        System.out.println("\n");
        System.out.println(new IpAddress("251.74.0.1").isValid()); //true
        System.out.println("\n");
        System.out.println(new IpAddress("13.256.25.30").isValid()); //false
        System.out.println("\n");
        System.out.println(new IpAddress("2020.45.8.9").isValid()); //false
        System.out.println("\n");
        System.out.println(new IpAddress("1.2.3").isValid()); //false
        System.out.println("\n");
        System.out.println(new IpAddress("1.2.3.4").isValid()); //true
        System.out.println("\n");
        try {
            System.out.println(new IpAddress("125.14.x.74").isValid()); //NumberFormatException!!!
        }
        catch(Exception e) {
            System.out.println("there is char in address!");
            System.out.println(false);
        }

    }

    public boolean isValid() {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        if (numbers[0]==-78965412)
            a=false;

        if (numbers[0] <= 255 && numbers[0] >= 0) {
            a = true;
        }
        if (numbers[1] <= 255 && numbers[1] >= 0)
            b = true;
        if (numbers[2] <= 255 && numbers[2] >= 0)
            c = true;
        if (numbers[3] <= 255 && numbers[3] >= 0)
            d = true;

        return a == b && b == c && c == d;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
