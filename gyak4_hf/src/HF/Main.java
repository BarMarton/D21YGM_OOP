package HF;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        szemely aSzemely = new szemely(null, 0, 0);
        aSzemely.setNev(input.next());
        aSzemely.setSuly(input.nextInt());
        aSzemely.setMagassag(input.nextFloat());
        System.out.println(aSzemely.toString());
    }
}
