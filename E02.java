public class E02 {
    public static void main(String[] args) {
        int numerolf = -4;
        
        // IF
        if (numerolf == 0) {
            System.out.println("Es cero!");
        }

        if (numerolf > 0) {
            System.out.println("Es positivo!");
        }

        if (numerolf < 0) {
            System.out.println("Es negativo!");
        }

        int numeroWhile = 2;

        //WHILE
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Numero While: " + numeroWhile);
        }

        //DO WHILE
        do {
            numeroWhile++;
            System.out.println("Numero While: " + numeroWhile);
        }
        while (numeroWhile < 3);

        //FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.print("NumeroFor: " + numeroFor + "\n");
        }

        String estacion = "verano";
        //SWITCH
        switch (estacion){
            case "primavera":
                System.out.println(estacion);
                break;
            case "verano":
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println(estacion);
                break;
            case "invierno":
                System.out.println(estacion);
                break;
            default:
            System.out.println("No es una estacion");
        }
        
    }
}
