

package Kendaraan;

public class mobil {
    public static void main(String[] args){
        //Membuat Objek dari Class Mesin
        mesin data = new mesin();
        data.setKecepatan(360.0);
        System.out.println("Kecepatan Mobil: "+data.getKecepatan()+" Km/Jam");
    }
}
class mesin{
    
    double kecepatan;
    
    void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    double getKecepatan(){
        return kecepatan;
    }