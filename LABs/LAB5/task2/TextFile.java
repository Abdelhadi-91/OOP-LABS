public class TextFile extends FsItem {
    int wordsNumber;

    public TextFile(String name, double sizeMb, int wordsNumber) {
        super(name, sizeMb);
        this.wordsNumber = wordsNumber;
    }

    public String info() {
        return super.info() + ", number of words: " + wordsNumber;
    }
}
