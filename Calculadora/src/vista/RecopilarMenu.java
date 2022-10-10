package vista;
import java.util.Scanner;
import controlador.Operaciones;
import controlador.Convertir;
//@author Edwar
public class RecopilarMenu {
    Scanner sc=new Scanner(System.in);
    Operaciones ope=new Operaciones();
    Convertir con=new Convertir();
    int opc=0;
    
    public void menuInicio(){
    System.out.println("********");
    System.out.println("* Menu *");
    System.out.println("********");
    System.out.println("1.- Enteros");
    System.out.println("2.- Decimales");
    System.out.println("Elija la opcion que desea");
    opc=sc.nextInt();
    switch(opc){
        case 1://enteros
            this.menuEntero();
            break;
        case 2://decimales
            this.menuDecimal();
            break;
        default:
            System.out.println("Opcion no validad");
    }//fin de switch
    }
    
    public void menuEntero(){
            System.out.println("************************");
            System.out.println("*Calculadora de Enteros*");
            System.out.println("************************");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- Divición");
            System.out.println("5.- Convertir Entero a Binario");
            System.out.println("6.- Convertir Entero a Hexadecimal");
            System.out.println("7.- Convertir Entero a Octal");
            System.out.println("8.- Regresar al Menu Principal");
            System.out.println("9.- Salir del programa");
            opc=sc.nextInt();
            
            switch(opc){
                case 1://suma
                    System.out.println("Suma de Enteros");
                    System.out.println("Ingrese el primer valor");
                    int va1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    int va2 = sc.nextInt();
                    System.out.println("El resultado de la suma es: " + ope.suma(va1, va2));
                    this.menuEntero();
                    break;
                case 2://resta
                    System.out.println("Resta de Enteros");
                    System.out.println("Ingrese el primer valor");
                    va1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    va2 = sc.nextInt();
                    System.out.println("El resultado de la resta es: " + ope.resta(va1, va2));                    
                    this.menuEntero();
                    break;
                case 3://multiplicacion
                    System.out.println("Multiplicación de Enteros");
                    System.out.println("Ingrese el primer valor");
                    va1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    va2 = sc.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + ope.multiplicacion(va1, va2));                    
                    this.menuEntero();
                    break;
                case 4://divicion
                    System.out.println("Divición de Enteros");
                    System.out.println("Ingrese el primer valor");
                    va1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    va2 = sc.nextInt();
                    System.out.println("El resultado de la divición es: " + ope.divicion(va1, va2));
                    this.menuEntero();
                    break;
                case 5://Convertir a binario
                    System.out.println("Convertir entero a binario");
                    System.out.println("Ingrese el valor a convertir");
                    int num = sc.nextInt();
                    Integer n1 = num;
                    System.out.println("El numero a binario es: " + con.intToBin(n1));
                    this.menuEntero();
                    break;
                case 6://convertir a hexadecimal
                    System.out.println("Convertir entero a hexadecimal");
                    System.out.println("Ingrese el valor a convertir");
                    num = sc.nextInt();
                    Integer n2 = num;
                    System.out.println("El numero a hexadecimal es: " + con.intToHex(n2));
                    this.menuEntero();
                    break;
                case 7://convertir a octal
                    System.out.println("Convertir entero a octal");
                    System.out.println("Ingrese el valor a convertir");
                    num = sc.nextInt();
                    Integer n3 = num;
                    System.out.println("El numero a octal es: " + con.intToOct(n3));
                    this.menuEntero();
                case 8://regresar al menu
                    this.regresar();
                case 9://salir
                    this.salir();
                default:
                    System.out.println("Opcion invalidad");
            }//fin de switch entero
    }
    
    public void menuDecimal(){
            System.out.println("**************************");
            System.out.println("*Calculadora de decimales*");
            System.out.println("**************************");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- Divición");
            System.out.println("5.- Convertir decimal a Binario");
            System.out.println("6.- Convertir decimal a Hexadecimal");
            System.out.println("7.- Convertir decimal a Octal");
            System.out.println("8.- Regresar al Menu Principal");
            System.out.println("9.- Salir del programa");
            opc=sc.nextInt();
            
            switch(opc){
                case 1://suma decimales
                    System.out.println("Suma de Decimales");
                    System.out.println("Ingrese el primer valor");
                    double va3 = sc.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    double va4 = sc.nextDouble();
                    System.out.println("El resultado de la suma es: " + ope.suma(va3, va4));
                    this.menuDecimal();
                    break;
                case 2://resta decimales
                    System.out.println("Resta de Decimales");
                    System.out.println("Ingrese el primer valor");
                    va3 = sc.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    va4 = sc.nextDouble();
                    System.out.println("El resultado de la resta es: " + ope.resta(va3, va4));                    
                    this.menuDecimal();
                    break;
                case 3://multiplicacion decimales
                    System.out.println("Multiplicación de Decimales");
                    System.out.println("Ingrese el primer valor");
                    va3 = sc.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    va4 = sc.nextDouble();
                    System.out.println("El resultado de la multiplicación es: " + ope.multiplicacion(va3, va4));                    
                    this.menuDecimal();
                    break;
                case 4://divicion decimales
                    System.out.println("Divición de Decimales");
                    System.out.println("Ingrese el primer valor");
                    va3 = sc.nextDouble();
                    System.out.println("Ingrese el segundo valor");
                    va4 = sc.nextDouble();
                    System.out.println("El resultado de la divición es: " + ope.divicion(va3, va4));
                    this.menuDecimal();
                    break;
                case 5://Convertir decimal a binario
                    System.out.println("Convertir decimal a binario");
                    System.out.println("Ingrese el valor a convertir");
                    double va5 = sc.nextDouble();
                    Double n1 = va5;
                    System.out.println("El numero a binario es: " + con.douToBin(n1));
                    this.menuDecimal();
                    break;
                case 6://convertir decimal a hexadecimal
                    System.out.println("Convertir decimal a hexadecimal");
                    System.out.println("Ingrese el valor a convertir");
                    va5 = sc.nextDouble();
                    Double n2 = va5;
                    System.out.println("El numero a hexadecimal es: " + con.douToHex(n2));
                    this.menuDecimal();
                    break;
                case 7://convertir decimal a octal
                    System.out.println("Convertir decimal a octal");
                    System.out.println("Ingrese el valor a convertir");
                    va5 = sc.nextDouble();
                    Double n3 = va5;
                    System.out.println("El numero a octal es: " + con.douToOct(n3));
                    this.menuDecimal();
                case 8://regresar al menu decimal
                    this.regresar();
                case 9://salir
                    this.salir();
                default:
                    System.out.println("Opcion invalidad");
            }//fin de switch decimal       
    }
    
    public void regresar(){
    this.menuInicio();
    }
    
    public void salir(){
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }
}
