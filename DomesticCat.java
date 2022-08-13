package HomeWork6;

class DomesticCat extends Pet1 implements Foul{
    public DomesticCat(
            String nickname,
            int age,
            int trickLevel,
            String[] habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(Species.DomesticCAT);
    }

    @Override
    public void foul() {

    }

    void respond() {
        System.out.println("Domestic cat food");
    }
}
