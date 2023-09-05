package Atividade0509;

public class Apolice {
    private String name;
    private int age;
    private double awardValue;

    public Apolice() {}

    public Apolice(String name, int age, double awardValue) {
        this.name = name;
        this.age = age;
        this.awardValue = awardValue;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }
    public double getAwardValue() {
        return awardValue;
    }
    public void setAwardValue(double awardValue) {
        if (awardValue < 0){
            throw new IllegalArgumentException("AwardValue must be positive"); 
        }
        this.awardValue = awardValue;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\nIdade: " + getAge() + "\nValor: " + getAwardValue();
    }

    public void calculateAwardValue() {
        if (getAge() >= 18 && getAge() <= 25) {
            setAwardValue(((getAwardValue() * 20) / 100));
        } 
        else if(getAge() > 25 && getAge() <= 36) {
            setAwardValue(((getAwardValue() * 15) / 100));
        }
        else if(getAge() > 36) {
            setAwardValue(((getAwardValue() * 10) / 100));
        }
    }

    public void tradeOfferDiscount() {

    }
}
