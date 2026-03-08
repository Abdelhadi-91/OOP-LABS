public class VariableDeclaration {

    public static void main(String[] args) {
        String name = "Ahmed";
        System.out.println("name: "+name);

        int age = 15;
        System.out.println("age: "+age);
        if (age>80) {
            System.out.println(name+" is aged");
        } else if (age>=18) {
            System.out.println(name+"is adult");
        } else {
            System.out.println(name+" is young");
        }

        double weight = 55.5;
        System.out.println("weight: "+weight);

        char maleOrFemale = 'M';
        switch (maleOrFemale) {
            case 'M':
                System.out.println(name+" is male");
                break;
            case 'F':
                System.out.println(name+" is female");
                break;
            default:
                System.out.println("This person is not a human");
        }
    }
}