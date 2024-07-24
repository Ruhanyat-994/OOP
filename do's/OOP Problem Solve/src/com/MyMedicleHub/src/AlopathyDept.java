public class AlopathyDept implements GasMedicine,ColdMedicine,BoneMedicine{

    @Override
    public void bonePills(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Bone-Pill section!");
    }

    @Override
    public void histamin(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Histamin section!");

    }

    @Override
    public void antiHistamin(String nameOfMedicine) {

        System.out.println(nameOfMedicine+" is available at Anti-Histamin section!");
    }

    @Override
    public void omeprazol(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Omeprazol section!");
    }

    @Override
    public void isomoprazol(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Isomoprazol section!");
    }

    @Override
    public void pentoprazol(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Pentoprazol section!");
    }

    @Override
    public void allMedicines(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Miscellaneous section!");
    }
}
