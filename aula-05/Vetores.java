void main() {
    int[] vetor = new int[100];
    vetor[0] = 3;

    for (int i = 1; i < vetor.length; i++) {
        vetor[i] = vetor[i - 1] + 2;
        IO.println(vetor[i]);
    }
}