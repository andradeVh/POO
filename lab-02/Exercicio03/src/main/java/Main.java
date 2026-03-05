public class Main {
    public static void main(String[] args) {
        int tamanho = 0;


        for (int i = 0; i < args.length; i++) {
            if (args.length == 0) {
                IO.println("Não forneceu argumentos de linha de comando");
            } else {
                IO.println("Argumento número " + (i + 1) + " : " + args[i]);
                tamanho = Integer.parseInt(args[1]);
            }
        }

        String[][] matriz = new String[tamanho][tamanho];
        int centro = matriz.length / 2;

        if (args[0].equals("triangulo")) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {

                    if (i >= j) {
                        matriz[i][j] = "*";
                    } else {
                        matriz[i][j] = " ";
                    }
                }
            }
        } else if (args[0].equals("losango")) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (Math.abs(i - centro) + Math.abs(j - centro) <= centro) {
                        matriz[i][j] = "*";
                    } else {
                        matriz[i][j] = " ";
                    }
                }
            }
//        } else if (args[0].equals("retangulo")) {
//            int linhas = Integer.parseInt(args[1]);
//            int colunas = Integer.parseInt(args[2]);
//
//            String[][] matrizRetangulo = new String[linhas][colunas];
//
//            for (int i = 0; i < matrizRetangulo.length; i++) {
//                for (int j = 0; j < matrizRetangulo.length; j++) {
//
//                    if (i == 0 || i == matrizRetangulo.length - 1 || j == 0 || j == matrizRetangulo.length - 1) {
//                        matrizRetangulo[i][j] = "*";
//                    } else {
//                        matrizRetangulo[i][j] = " ";
//                    }
//                }
//                for (i = 0; i < matrizRetangulo.length; i++) {
//                    for (int j = 0; j < matrizRetangulo.length; j++) {
//                        IO.print(matrizRetangulo[i][j]);
//                    }
//                    IO.println();
//
//                }
//            }
//
//        } else {
            IO.print("Argumento inválido");
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                IO.print(matriz[i][j]);
            }
            IO.println();

        }
    }

}

