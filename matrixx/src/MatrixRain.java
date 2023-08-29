import java.util.Random;

public class MatrixRain {
    public static void main(String[] args) throws InterruptedException {
        int columns = 200;
        int rows = 50;
        char[][] matrix = new char[rows][columns];
        int[] columnPositions = new int[columns];

        Random random = new Random();

        for (int i = 0; i < columns; i++) {
            columnPositions[i] = random.nextInt(rows);
        }

        while (true) {
            for (int i = 0; i < columns; i++) {
                int currentPosition = columnPositions[i];
                for (int j = 0; j < rows; j++) {
                    if (j == currentPosition) {
                        matrix[j][i] = (char) (random.nextInt(95) + 32);
                        currentPosition = (currentPosition + 1) % rows;
                    } else {
                        matrix[j][i] = ' ';
                    }
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("\u001B[32m" + matrix[i][j] + "\u001B[0m");
                }
                System.out.println();
            }

            Thread.sleep(500);
            System.out.print("\033[H\033[2J"); // Очистка экрана
            System.out.flush();

            for (int i = 0; i < columns; i++) {
                columnPositions[i] = (columnPositions[i] + 1) % rows;
            }
        }
    }
}