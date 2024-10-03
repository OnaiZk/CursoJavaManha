package cursoJava2024;
import java.util.Arrays;
import java.util.Random;

public class NeuralNetwork {
    private double[][] weights;
    private double[] outputs;
    private double learningRate;

    // Inicializa a rede neural
    public NeuralNetwork(int inputSize, int outputSize, double learningRate) {
        this.weights = new double[inputSize][outputSize];
        this.outputs = new double[outputSize];
        this.learningRate = learningRate;
        initializeWeights();
    }

    // Inicializa os pesos com valores aleatórios
    private void initializeWeights() {
        Random random = new Random();
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i].length; j++) {
                weights[i][j] = random.nextDouble() - 0.5; // Pesos aleatórios entre -0.5 e 0.5
            }
        }
    }

    // Função de ativação (sigmóide)
    private double sigmoid(double x) {
        return 1.0 / (1.0 + Math.exp(-x));
    }

    // Derivada da função de ativação (para o cálculo do erro)
    private double sigmoidDerivative(double x) {
        return x * (1 - x);
    }

    // Propagação direta (feedforward)
    public double[] feedForward(double[] inputs) {
        for (int j = 0; j < outputs.length; j++) {
            double sum = 0;
            for (int i = 0; i < inputs.length; i++) {
                sum += inputs[i] * weights[i][j];
            }
            outputs[j] = sigmoid(sum);
        }
        return outputs;
    }

    // Treinamento da rede (backpropagation)
    public void train(double[] inputs, double[] expectedOutputs) {
        double[] actualOutputs = feedForward(inputs);

        for (int j = 0; j < actualOutputs.length; j++) {
            double error = expectedOutputs[j] - actualOutputs[j];
            for (int i = 0; i < inputs.length; i++) {
                weights[i][j] += learningRate * error * sigmoidDerivative(actualOutputs[j]) * inputs[i];
            }
        }
    }

    public void printWeights() {
        System.out.println("Pesos: " + Arrays.deepToString(weights));
    }

    public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork(2, 1, 0.5);

        // Exemplo de dados de treinamento (AND lógico)
        double[][] trainingInputs = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
        double[][] trainingOutputs = { { 0 }, { 0 }, { 0 }, { 1 } };

        // Treinamento da rede
        for (int epoch = 0; epoch < 10000; epoch++) {
            for (int i = 0; i < trainingInputs.length; i++) {
                nn.train(trainingInputs[i], trainingOutputs[i]);
            }
        }

        // Teste da rede
        for (int i = 0; i < trainingInputs.length; i++) {
            double[] output = nn.feedForward(trainingInputs[i]);
            System.out.println("Entrada: " + Arrays.toString(trainingInputs[i]) + ", Saída prevista: " + Arrays.toString(output));
        }

        nn.printWeights();
    }
}
