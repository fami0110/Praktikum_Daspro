public class ContohVariabel14 {
    public static void main(String[] args) {
        String hobby = "Jalan-jalan";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 18;
        double ipk = 3.8, tinggi = 1.68;
        System.out.println(hobby);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya ber-ipk %s, dengan ringgi badan %s", ipk, tinggi));
    }
}