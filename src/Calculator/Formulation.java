package Calculator;

public class Formulation extends Calculator {

    public Formulation() {
        super();
    }

    public float add() {
        return this.getX() + this.getY();
    }

    public float sub() {
        return this.getX() - this.getY();
    }

    public float mul() {
        return this.getX() * this.getY();
    }

    public float div() {
        float z = this.getY();
        if (z == 0) {
            return 0;
        }
        return this.getX() / z;
    }

    public float mod() {
        float z = this.getY();
        if (z == 0) {
            System.out.println("Error! Dividing by zero is not allowed.");
        }
        return this.getX() % this.getY();
    }
}
