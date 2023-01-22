package Task8;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.jar.JarOutputStream;

public class Validator {
    private void isDimensionViable(Parcel parcel){
        if(parcel.getxLenght() + parcel.getyLenght() + parcel.getzLenght() <= 300){
            System.out.println("Paczka: " + parcel.toString() + " jest dobrych rozmiarów");
        } else {
            System.out.println("Paczka: " + parcel.toString() + " ma złe wymiary");
        }
    }
    private void isWeightAlright(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){
            System.out.println("Paczka" + parcel + " jest dobrej wagi i nie jest ekspresowa");
        } else if (parcel.getWeight() <= 15 && parcel.isExpress()){
            System.out.println("Paczka" + parcel + " jest dobrej wagi i jest ekspresowa");
        } else {
            System.out.println("Paczka " + parcel + " jest złej wagi");
        }
    }

    public void validate(Parcel parcel){
        isDimensionViable(parcel);
        isWeightAlright(parcel);
    }
}
