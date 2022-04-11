package com.company;

public class Car  implements AutoCloseable{

    private final int mashinadanTushuu = 1;
    private final int mashinagaOturuu = 1;
    boolean mashinadanTushuu1 = true;
    boolean mashinagaOturuu1 = true;

    public void close(){
        System.out.println("Машина жабылып жатат");
    }

    public void drive ()throws RuntimeException{

        try {
            int mashinaJurupJatkandaMashinadanTushuu = 0;
            int mashinaJurupJatkandaMashinagaOturuu = 0;

            if (mashinadanTushuu1) {
                System.out.println(mashinadanTushuu / mashinaJurupJatkandaMashinadanTushuu);
            } else if (mashinagaOturuu1) {
                System.out.println(mashinagaOturuu / mashinaJurupJatkandaMashinagaOturuu);
            }
        } catch(RuntimeException exception){
            System.out.println("Машина журуп жатат");
        }
    }


}


