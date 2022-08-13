package HomeWork6;

class Fish extends Pet1 implements Foul{
    public Fish(
            String nickname,
            int age,
            int trickLevel,
            String[] habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(Species.FISH);
    }

    @Override
    public void foul() {

    }
    void respond() {
        System.out.println("Fish food");
    }
}
