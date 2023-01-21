package Task7;

public class MainGun {
    public static void main(String[] args) {
        GunMagazine gunMagazine = new GunMagazine(6);
        checkIfGunLoaded(gunMagazine);
        gunMagazine.loadBullet("Bullet 1");
        gunMagazine.loadBullet("Bullet 2");
        gunMagazine.loadBullet("Bullet 3");
        gunMagazine.loadBullet("Bullet 4");
        gunMagazine.loadBullet("Bullet 5");
        gunMagazine.loadBullet("Bullet 6");
        gunMagazine.loadBullet("Bullet 7");
        gunMagazine.loadBullet("Bullet 8");

        checkIfGunLoaded(gunMagazine);
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
    }

    private static void checkIfGunLoaded(GunMagazine gunMagazine) {
        System.out.println("Broń naładowana: " + gunMagazine.isLoaded());
    }

    private static void loadWithBullets(GunMagazine gunMagazine, int numberOfBullets){
        for (int i = 0; i <= numberOfBullets; i++){
            gunMagazine.loadBullet("Bullet" + 1);
        }
    }
}
