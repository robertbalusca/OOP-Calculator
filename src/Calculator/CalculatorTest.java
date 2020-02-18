package Calculator;

/**
 *
 * @author Rich
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Formulation cal = new Formulation();
        switch (cal.option) {
            case 1:
                cal.result = cal.add();
                System.out.println("Answer:" + cal.result);
                break;
            case 2:
                cal.result = cal.sub();
                System.out.println("Answer:" + cal.result);
                break;
            case 3:
                cal.result = cal.mul();
                System.out.println("Answer:" + cal.result);
                break;
            case 4:
                cal.result = cal.div();
                System.out.println("Answer:" + cal.result);
                break;
            case 5:
                cal.result = cal.mod();
                System.out.println("Answer:" + cal.result);
                break;
            default:
                System.out.println("Invalid operation code!");
        }
    }
}
