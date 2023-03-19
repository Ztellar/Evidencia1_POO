public class Main {
    public static void main(String[] args) {
        int[][] ventas = new int[15][12];
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j]= (int) (Math.random()*100);
            }
        }
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
