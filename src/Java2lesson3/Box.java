package Java2lesson3;

import java.util.ArrayList;

public class Box {

    ArrayList<Fruits> fruits = new ArrayList<Fruits>();

    public ArrayList<Fruits> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruits> fruits) {
        this.fruits = fruits;
    }

    public void addFruits(Fruits F) {
        if (this.fruits.size() == 0 || F.getClass() == this.fruits.get(0).getClass()){
                this.fruits.add(F);
            }
        }

    public double getWeightBox() {
        if (this.fruits.size() == 0) {
            return 0;
        }
        else {
            return fruits.size() * fruits.get(0).getWeightFruits();
        }
    }

    public boolean compare(Box anotherBox) {
        return anotherBox.getWeightBox() == this.getWeightBox();
    }

    public void outAllFruits(Box anotherBox){
        anotherBox.getFruits().addAll(this.getFruits());
        this.fruits.clear();
    }
}
