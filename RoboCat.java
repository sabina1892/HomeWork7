package HomeWork6;

class RoboCat extends Pet1 implements Foul{
    public RoboCat(
            String nickname,
            int age,
            int trickLevel,
            String[] habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(Species.RoboCat);
    }

    @Override
    void respond() {

    }

    @Override
    public void foul() {

    }
}