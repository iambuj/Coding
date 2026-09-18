interface Camera{
    void clickPhoto();
}
interface MusicPlayer{
    void playMusic();
}
class Phone implements Camera , MusicPlayer{
    public void clickPhoto() {
        System.out.println("Photo Clicked");
    }
    public void playMusic() {
        System.out.println("Music Playing");
    }
}
public class InterfaceCamera {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.clickPhoto();
        ph.playMusic();
    }
}
