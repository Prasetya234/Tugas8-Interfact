package WhatsApp;

public class Exsternal {
    private Internal internal;

    public Exsternal(Internal internal) {
        this.internal = internal;
    }

    void turnOnWhatsapp(){
        this.internal.whatsappOn();
    }

    void turnOffWhatsapp(){
        this.internal.whatsappOff();
    }

    void nowChatIlham(){
        this.internal.chatIlham();
    }

    void nowTelponIlham(){
        this.internal.telponIlham();
    }

    void nowChatMom(){
        this.internal.chatMom();
    }

    void nowTelponMom(){
        this.internal.telponMom();
    }

    void nowMabarFf(){
        this.internal.mabarFf();
    }

    void nowOpenStatus(){
        this.internal.status();
    }

    void makePhoneSilent(){
        this.internal.volumeDown();
    }

    void makePhoneLouder(){
        this.internal.volumeUp();
    }
}
