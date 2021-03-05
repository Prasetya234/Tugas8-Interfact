package WhatsApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // membuat objek Komponent Aplikasi
        Internal android = new TxtWhatsapp();

        // membuat objek Sistem Aplikasi
        Exsternal app = new Exsternal(android);

        // WhatsApp Mode ON
        app.turnOnWhatsapp();

        // Program
        Scanner input = new Scanner(System.in);
        String hasil;

        while (true) {
            System.out.println("=== APLIKASI WhatsApp ===");
            System.out.println("[1] Buka WhatsApp ");
            System.out.println("[2] Keluar dari aplikasi WhatsApp");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[5] Telpon Ilham");
            System.out.println("[6] Chat Ilham");
            System.out.println("[7] Telpon Mom");
            System.out.println("[8] Chat Mom");
            System.out.println("[9] Status Wa");
            System.out.println("[10] Main Free Fire");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            hasil = input.nextLine();

            if(hasil.equalsIgnoreCase("1")){
                app.turnOnWhatsapp();
            } else if (hasil.equalsIgnoreCase("2")){
                app.turnOffWhatsapp();
            } else if (hasil.equalsIgnoreCase("3")){
                app.makePhoneLouder();
            } else if (hasil.equalsIgnoreCase("4")){
                app.makePhoneSilent();
            } else if (hasil.equalsIgnoreCase("5")){
                app.nowTelponIlham();
            } else if (hasil.equalsIgnoreCase("6")){
                app.nowChatIlham();
            } else if (hasil.equalsIgnoreCase("7")){
                app.nowTelponIlham();
            } else if (hasil.equalsIgnoreCase("8")){
                app.nowChatMom();
            } else if (hasil.equalsIgnoreCase("9")){
                app.nowOpenStatus();
            } else if (hasil.equalsIgnoreCase("10")){
                app.nowMabarFf();
            } else if (hasil.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
