package HomeWork6;

class Dog extends Pet1 implements Foul {
    public Dog(
            String nickname,
            int age,
            int trickLevel,
            String[] habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(Species.DOG);
    }
    void respond() {
        System.out.println("Dog food");
    }

    @Override
    public void foul() {

    }
}
