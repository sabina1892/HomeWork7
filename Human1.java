package HomeWork6;

import java.util.Arrays;

public class Human1 {
    private String name;
    private String surname;
    private int dateOfBirthyear;
    private int iq;
    private String[][] schedule = new String[6][2];
    private Family family;

    public Human1() {
    }

    public Human1(
            String name,
            String surname,
            int dateOfBirthyear
    ){
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;

    }
    public Human1(
            String name,
            String surname,
            int dateOfBirthyear,
            int iq,
            String[][] schedule,
            Family family
    ) {
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;
        this.iq=iq;
        this.schedule=schedule;
        this.family=family;
    }
    public void setName(String name) { this.name = name;    }
    public void setSurname(String surname) { this.surname = surname;    }
    public void setDateOfBirthyear(int dateOfBirthyear) { this.dateOfBirthyear = dateOfBirthyear;    }
    public void setIq(int iq) { this.iq = iq;    }
    public void setSchedule(String[][] schedule){ this.schedule=schedule;}
    public void setFamily(Family family) { this.family = family;    }

    public String getName() { return name;    }
    public String getSurname() { return surname;    }
    public int getDateOfBirthyear(){ return dateOfBirthyear;}
    public int getIq(){ return iq;}
    public String[][] getSchedule(){ return schedule;}
    public Family getFamily(){ return family;   }


    void greetPet(){
        System.out.println("Hello");
    }


    @Override
    public String toString() {
                return ("Human{name=' " + this.name + " ' , surname=' " + this.surname +" ' , year=" +
                this.dateOfBirthyear + " , iq= " + this.iq + " , schedule= " + Arrays.deepToString(this.schedule));
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Remove human");
    }
}

