public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la capacidad de la cuba en litros: ");
        int cuba = Integer.parseInt(System.console().readLine());
        int relleno = (int)(Math.random()*cuba);
        for (int i = 1; i < cuba; i++){
            System.out.print("#");
            if (i >= relleno)
                System.out.print("====");
            else
                System.out.print("    ");
            System.out.println("#");
        }
        System.out.print("######");
    }
}
