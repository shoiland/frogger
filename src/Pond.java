public class Pond {
    public static void main(String[] args) {
//        Frog peepo = new Frog("Peepo");
//        Frog pepe = new Frog("Pepe", 10, 15.0);
//        Frog peepaw = new Frog("Peepaw", 4.6, 5.0);
        Frog scott = new Frog("Scott", 25, 30);
//        Fly scott = new Fly(10.0, 50.0);
//        scott.grow(45);
//        Fly first = new Fly(1, 3);
//        Fly second = new Fly(6);
//        Fly third = new Fly();
        scott.grow(10);

//        //Todo: 1. Set Species of any frog to 1331
//        Frog.setSpecies("1331 Frogs");
//        //Todo: 2. Print on new line description of Frog Peepo
//        System.out.println("2: " + peepo.toString());
//        //Todo: 3. Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
//        peepo.eat(second);
//        //Todo: 4. Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
//        System.out.println("4: " + second.toString());
//        //Todo: 5. Have the Frog named Peepo grow by 8 months.
//        peepo.grow(8);
//        //Todo: 6. Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
//        peepo.eat(second);
//        //Todo: 7. Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
//        System.out.println("7: " + second.toString());
//        //Todo: 8. Print out on a new line the description of the Frog named Peepo given by the toString method.
//        System.out.println("8: " + peepo.toString());
//        //Todo: 9. Print out on a new line the description of your own Frog given by the toString method.
//        System.out.println("9: " + third.toString());
//        //Todo: 10. Have the Frog named Peepaw grow by 4 months.
//        peepaw.grow(4);
//        //Todo: 11. Print out on a new line the description of the Frog named Peepaw given by the toString method.
//        System.out.println("11: " + peepaw.toString());
//        //Todo: 12. Print out on a new line the description of the Frog named Pepe given by the toString method.
//        System.out.println("12: " + pepe.toString());
    }
}


/*

Failed: Frog had initial age 20 and initia
l tongue speed 20. It was grown by 8 months and di
d not have proper final age.
     expected:<28> but was:<20>

Failed: Frog had initial age 213 and initial ton
gue speed 9. It was grown by 0 months and did not have p
roper final tongue speed.
     expected:<9> but was:<5>

Failed: Should have printed a fly as such expected:
<m dead, but I used to be a fly with a speed of 11.00.>
<m a speedy fly with 12.00 speed and 8.00 mass.>

Failed: Frog had initial age 31 and initial tongue speed 20. It was grown by 8 months and did not have proper final tongue speed.
expected:<12>
but was:<11>

Failed: Frog had initial age 5 and initial tongue speed 5. It was grown by 8 months and did not have proper final tongue speed.
expected:<12>
but was:<5>

Failed: Something is wrong with your output, please check for your format. expected:
<... has a speed of 3.78[].>
but was:
<... has a speed of 3.78[1].>

Failed: Frog does not have correct tongueSpeed expected:<39.0> but was:<41.0>

Failed: Fly had initial mass 10.0 and initial speed 50.0. It was grown by 45 mass units and did not have proper final speed.
expected:<42.5> but was:<27.5>

 */