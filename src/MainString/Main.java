package MainString;

public class Main {

    public static void main(String[] args) {

        int cantidad = 10;
        boolean mayor = cantidad > 5;

        String resultado = String.format("La cantidad es mayor a %d : %b",
                cantidad, mayor);
        System.out.println(resultado);

    }

}
