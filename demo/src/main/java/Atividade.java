public class Atividade {
    public int Soma(int a, int b) {
        return a + b;
    }

    public int Subtracao(int a, int b) {
        return a - b;
    }

    public int Multiplicacao(int a, int b) {
        return a * b;
    }

    public double Divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        else {
            return a / b;
        }
    }
}

