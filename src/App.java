import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     MetodoOrdenamiento mO = new MetodoOrdenamiento();

       int[] arr = {5,8,9,3,0};
        
        mO.sortBubbleAva(arr);
         mO.printArreglo(arr);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tamanio = scanner.nextInt();

        if(tamanio <= 0 ){
            System.out.println("Ingreso invalido, adios");
            return;
        }

        int[] arreglo = new int[tamanio];

        do{
            System.out.println("Ingrese el tamaño que sea entero positivo ");

            while(!scanner.hasNextInt()){
                System.out.println("te pedi un entero Valido, no seas necio");
                scanner.next();
            }
            tamanio = scanner.nextInt();
            if(tamanio <= 0){
                System.out.println("tamanio debe ser entero positivo");
            }
        }
        while(tamanio <= 0);
        //int[] arreglo = new int[tamanio];

        scanner.close();

    }

}
