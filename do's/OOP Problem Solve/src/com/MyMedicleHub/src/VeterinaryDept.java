public class VeterinaryDept implements CowMedicine,CatMedicine{
    @Override
    public void hairFall(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Hair-Fall section!");
    }

    @Override
    public void antiWormGel(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Gel section!");
    }

    @Override
    public void antiVirus(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Anti-Virus section!");

    }

    @Override
    public void growPill(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Grow section!");
    }

    @Override
    public void allMedicines(String nameOfMedicine) {
        System.out.println(nameOfMedicine+" is available at Miscellaneous section!");
    }
}
