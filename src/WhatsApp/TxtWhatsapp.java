package WhatsApp;

public class TxtWhatsapp implements Internal{
    private int volume;
    private boolean isPowerOn;

    public TxtWhatsapp() {
        // penguin standard Volume
        this.volume = 50;
    }

    @Override
    public void whatsappOn() {
        isPowerOn = true;
        System.out.println("Membuka Whatsapp...");
        System.out.println("GetStarted WhatsApp Aplications");
        System.out.println("Android version 24.23.9");
    }

    @Override
    public void whatsappOff() {
        isPowerOn = false;
        System.out.println("Keluar dari Aplikasi");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Suara Maksimal !");
                System.out.println("Sound " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Suara Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Sound = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Suara Sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void telponIlham() {
        if (isPowerOn) {
            System.out.println("Maaf. Nomor yang ada hubungi sedang tidak aktif");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void chatIlham() {
        if (isPowerOn) {
            System.out.println("Ojo Chat. Aku jek push rank !");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void chatMom() {
        if (isPowerOn) {
            System.out.println("Ibu lagi sibuk. Makanan udh ada di meja");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void telponMom() {
        if (isPowerOn) {
            System.out.println("Maaf. Nomor ibu sedang tidak aktif. Silahkan hubungi beberapa saat lagi");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    @Override
    public void status() {
        if (isPowerOn) {
            System.out.println("Kamu tidak memiliki pengguna lain!");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }
    @Override
    public void mabarFf() {
        if (isPowerOn) {
            System.out.println("Salah Aplikassi kamu Bogeng!");
        } else {
            System.out.println("Anda belum membuka WhatsApp, Silahkan buka WhatsApp terlebih dahulu!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
