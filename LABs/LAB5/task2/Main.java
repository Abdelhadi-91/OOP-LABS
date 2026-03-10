public class Main {
    public static void main(String[] args) {
        FsItem note = new TextFile("myNote", 2, 1500);
        FsItem pic = new ImageFile("myPicture", 10, 1080);

        System.out.println(note.info());
        System.out.println(pic.info());

        note.rename("projectDescription");

        pic.rename(null);
        pic.rename("");
        pic.rename("                ");
        pic.rename("pic/of/myHome");
        pic.rename("myPicture");
        pic.rename("picture1");

        System.out.println(pic.info());

    }
}
