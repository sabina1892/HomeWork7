package HomeWork6;

import java.util.Arrays;

public class Family {
    private Human1 mother;
    private Human1 father;
    private Human1[] children;
    private Pet1 pet;


    public Family(Human1 mother, Human1 father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human1[0];
        this.pet = getPet();
        father.setFamily(this);
        mother.setFamily(this);
    }

    public void setMother(Human1 mother) {
        this.mother = mother;
    }

    public void setPet(Pet1 pet) {
        this.pet = pet;
    }

    public void setFather(Human1 father) {
        this.father = father;
    }

    public void setChildren(Human1[] children) {
        this.children = children;
    }


    public Human1 getMother() {
        return mother;
    }

    public Human1 getFather() {
        return father;
    }

    public Human1[] getChildren() {
        return children;
    }

    public Pet1 getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", children=" + Arrays.toString(getChildren()) +
                '}';
    }

    public void addChild(Human1 child) {
        Human1[] children = new Human1[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            children[i] = getChildren()[i];
        }
        children[children.length - 1] = child;
        setChildren(children);
        child.setFamily(this);

    }

    public void deleteChild(Human1 child) {
        Human1[] children = new Human1[this.children.length - 1];
        if (children.length == 0) {
            children = new Human1[0];
        } else {
            for (int i = 0; i < this.children.length; i++) {
                for (int j = 0; j < this.children.length; j++) {
                    children[j++] = getChildren()[i];
                }
            }
        }
        setChildren(children);
        child.setFamily(this);
    }
    public void countFamily(){
        System.out.println(2 + getChildren().length);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Remove family");
    }




}
