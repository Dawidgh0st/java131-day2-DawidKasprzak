package Task8;

public class Task8Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10,100,10,40.5F,true);
        Parcel parcel2 = new Parcel(100,100,101,12,true);
        Parcel parcel3 = new Parcel(100,100,101,30.5F,false);
        Parcel parcel4 = new Parcel(100,100,101,12,false);

        Validator validator = new Validator();


        validator.validate(parcel1);
        System.out.println();
        validator.validate(parcel2);
        System.out.println();
        validator.validate(parcel3);
        System.out.println();
        validator.validate(parcel4);



    }
}
