public class TelevisoreTest {
    public static void main(String[] args){
        Televisore televisore= new Televisore(23,30,15,5);
        int Pollici= televisore.getPollici();
        System.out.println("Pollici: "+Pollici);
        int Volume= televisore.getVolume();
        System.out.println("Volume: "+Volume);
        int Lum= televisore.getLum();
        System.out.println("Luminosit√†: "+Lum);
        int Canale= televisore.getCanale();
        System.out.println("Canale: "+Canale);
        televisore.canaleSuccessivo();
        televisore.alzaVolume();
        televisore.aumentaLum();
        Volume= televisore.getVolume();
        Lum= televisore.getLum();
        Canale= televisore.getCanale();
        System.out.println("");
        System.out.println("Aumentiamo il volume, la luminosit√† e il canale.");
        System.out.println("Pollici: "+Pollici);
        System.out.println("Volume: "+Volume);
        System.out.println("Luminosit√†: "+Lum);
        System.out.println("Canale: "+Canale);
        
        
        //NUOVO OGGETTO
        Televisore televisore2 = new Televisore(23, 30, 15, 5);
        
        if(televisore2.equalas(televisore))
            System.out.println("Televisori uguali");
        else
            System.out,println("Televisori diversi");
    }
}
