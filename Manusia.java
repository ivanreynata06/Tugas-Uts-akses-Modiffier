

package Makluk_Hidup;
    public class Manusia extends Kendaraan.mobil{
    public static void main(String[] args){
    Manusia data = new Manusia();
        data.setMerek("SUZUKI");
        data.setSpeed(360.0);
        System.out.println("Saya Mempunyai Mobil "+data.getMerek());
        System.out.println("Dengan Kecepatan "+data.getSpeed()+" Km/jam");
    }
    }