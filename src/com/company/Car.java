package com.company;

public class Car  implements AutoCloseable{

    public void close(){
        System.out.println("Машина жабылып жатат");
    }

    public void drive ()throws RuntimeException{

        try {
            int mashinaJurupJatkandaMashinadanTushuu = 0;
            int mashinaJurupJatkandaMashinagaOturuu = 0;

            boolean mashinadanTushuu1 = true;
            boolean mashinagaOturuu1 = true;
            if (mashinadanTushuu1) {
                int mashinadanTushuu = 1;
                System.out.println(mashinadanTushuu / mashinaJurupJatkandaMashinadanTushuu);
            } else if (mashinagaOturuu1) {
                int mashinagaOturuu = 1;
                System.out.println(mashinagaOturuu / mashinaJurupJatkandaMashinagaOturuu);
            }
        } catch(RuntimeException exception){
            System.out.println("Машина журуп жатат");
        }
    }


}


