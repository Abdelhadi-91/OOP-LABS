public class Main {
    public static void main(String[] args) {
        FsItem note = new TextFile("myNote", 2.2, 1500);
        FsItem pic = new ImageFile("myPicture", 22, 2160);

        System.out.println(note.info());
        System.out.println("---");
        System.out.println(pic.info());
        System.out.println("---");
        note.rename("projectDescription");
        System.out.println("---");
        pic.rename(null);
        System.out.println("---");
        pic.rename("");
        System.out.println("---");
        pic.rename("                ");
        System.out.println("---");
        pic.rename("pic/of/myHome");
        System.out.println("---");
        pic.rename("myPicture");
        System.out.println("---");
        pic.rename("picture1");
        System.out.println("---");

        System.out.println(pic.info());

    }
}
