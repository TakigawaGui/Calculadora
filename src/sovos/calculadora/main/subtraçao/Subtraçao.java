package sovos.calculadora.main.subtraçao;

public class Subtraçao {
    private int num1;
    private int num2;
    private int result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public void subitrair(){
        setResult(this.num1 - this.num2);
    }
    public void subitrair(int num1, int num2){
        setResult(num1 - num2);
    }
    public int subitrair(int num1) {
        return num1 - this.num2;
    }
}
