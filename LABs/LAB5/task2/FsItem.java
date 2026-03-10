public class FsItem {
    String name;
    double sizeMb;

    public FsItem(String name, double sizeMb) {
        this.name = name;
        this.sizeMb = sizeMb;
        // i used only this two fields, lazy to think about others while eating zlabia
    }

    public String info() {
        return "name: " + name + ", size: " + String.format("%.2fMb", sizeMb);
    }

    public void rename(String newName) {
        if (newName == null) {
            System.out.println("please enter a valid string");
        } else if (newName.isEmpty()) {
            System.out.println("You can't set an empty string as new name");
        } else if (newName.isBlank()) {
            System.out.println("You can't set a blank as new name");
        } else if (newName.contains("/")) {
            System.out.println("New name must not contain \"/\"");
        } else if (newName.equals(name)) {
            System.out.println("You can't use the same name");
        } else {
            name = newName;
            System.out.println("File renamed successfully");
        }
    }

}
