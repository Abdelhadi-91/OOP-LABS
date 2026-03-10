public class ImageFile extends FsItem {
    int quality;

    public ImageFile(String name, double sizeMb, int quality) {
        super(name, sizeMb);
        this.quality = quality;
    }

    public String info() {
        return super.info() + ", quality: " + quality + "p";
    }
}
