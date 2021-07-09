import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class math {

    public static void main(String args[]){
        //transformador();
        matrixOperations();

    }

    //Suma y resta de matrices
    public static void matrixOperations(){
        Scanner scan = new Scanner(System.in);
        int sizeOfArrays;
        System.out.println("Bienvenido a la aplicacion de suma y resta de matrices.");
        System.out.println("#######################################################");
        System.out.println("\nPor favor, introdusca el tamaño de las matrixes: ");
        try {
            sizeOfArrays = scan.nextInt();
            int[] A = new int[sizeOfArrays];
            int[] B = new int[sizeOfArrays];
            int[] resultSuma = new int[sizeOfArrays];
            int[] resultResta = new int[sizeOfArrays];
                try {
                    for (int i = 0; i < A.length; i++) {
                        System.out.println("Por favor introdusca el numero " + (i + 1) + " del array A:");
                        A[i] = scan.nextInt();
                        System.out.println("Por favor introdusca el numero " + (i + 1) + " del array B:");
                        B[i] = scan.nextInt();
                    }
                    for (int i = 0; i < resultSuma.length; i++){
                        resultSuma[i] = (A[i] + B[i]);
                        resultResta[i] = (A[i] - B[i]);
                    }
                    System.out.println("El resultado de tu suma es: " + Arrays.toString(resultSuma));
                    System.out.println("El resultado de tu resta es: " + Arrays.toString(resultResta));
                }catch (Exception e){
                    System.out.println("Por favor introdusca valores validos.");
                }


        }catch (Exception e){
            System.out.println(e);
            System.out.println("Por favor introdusca un numero valido.");
        }
    }

    //Transformador de longitudes
    public static void transformador(){
       double resultado =0;
        double x;
        String Plongitud;
        String Slongitud;
        //Unidades de conversion
        Scanner scan = new Scanner(System.in);
        System.out.println("Transformador de longitudes");
        System.out.println("###################################\n");
        System.out.println("Introdusca el numero: ");
        x = scan.nextDouble();
        System.out.println("Introduzca la longitud a transformar: ");
        Plongitud = scan.next();
        System.out.println("Introduzca la longitud que se transformara: ");
        Slongitud = scan.next();
        switch (Plongitud){
            case "mm" :
            case "MM":
              if (Slongitud.equals("cm") || Slongitud.equals("CM")){
                  resultado =(x/10.00);
              }else if(Slongitud.equals("dm") || Slongitud.equals("DM")){
                  resultado =(x/100.00);
              }else if(Slongitud.equals("m") || Slongitud.equals("M")){
                  resultado =(x/1000.00);
              }else if(Slongitud.equals("km") || Slongitud.equals("KM")){
                  resultado =(x/1000000.000);
              }
               break;
            case "cm":
            case "CM":
                if (Slongitud.equals("mm") || Slongitud.equals("MM")){
                    resultado =(x*10.00);
                }else if(Slongitud.equals("dm") || Slongitud.equals("DM")){
                    resultado =(x/10.00);
                }else if(Slongitud.equals("m") || Slongitud.equals("M")){
                    resultado =(x/100.00);
                }else if(Slongitud.equals("km") || Slongitud.equals("KM")){
                    resultado =(x/100000.000);
                }
                break;
            case "dm" :
            case "DM":
                if (Slongitud.equals("mm") || Slongitud.equals("MM")){
                    resultado =(x*100.00);
                }else if(Slongitud.equals("dm") || Slongitud.equals("DM")){
                    resultado =(x*10.00);
                }else if(Slongitud.equals("m") || Slongitud.equals("M")){
                    resultado =(x/10.00);
                }else if(Slongitud.equals("km") || Slongitud.equals("KM")){
                    resultado =(x/10000.000);
                }
                break;
            case "m" :
            case "M":
                if (Slongitud.equals("mm") || Slongitud.equals("MM")){
                    resultado =(x*1000.00);
                }else if(Slongitud.equals("dm") || Slongitud.equals("DM")){
                    resultado =(x*100.00);
                }else if(Slongitud.equals("m") || Slongitud.equals("M")){
                    resultado =(x*10.00);
                }else if(Slongitud.equals("km") || Slongitud.equals("KM")){
                    resultado =(x/1000.000);
                }
                break;
            case "km" :
            case "KM":
                if (Slongitud.equals("mm") || Slongitud.equals("MM")){
                    resultado =(x*1000000.000);
                }else if(Slongitud.equals("cm") || Slongitud.equals("CM")){
                    resultado =(x*100000.000);
                }else if(Slongitud.equals("dm") || Slongitud.equals("DM")){
                    resultado =(x*10000.000);
                }else if(Slongitud.equals("m") || Slongitud.equals("M")){
                    resultado =(x*1000.000);
                }
                break;
            default:
                System.out.println("Este no es un valor valido para esta unidad.");
                break;
      }
        String s = String.format("%.5f",resultado);
        System.out.println("Tu resultado es " + s + Slongitud+ ".");
    }
}
