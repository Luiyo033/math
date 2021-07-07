import java.util.Scanner;
public class math {

    public static void main(String args[]){
        transformador();

    }

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
