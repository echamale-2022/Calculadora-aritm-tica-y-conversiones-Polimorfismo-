package controlador;
/**
 * 
 * @author Edwar
 */
public class Convertir {

    public String intToBin(Integer num){
        return Integer.toBinaryString(num);
    }
    public String intToHex(Integer num){
        return Integer.toHexString(num);
    }
    public String intToOct(Integer num){
        return Integer.toOctalString(num);
    }
    public String douToBin(double num){
        return Integer.toBinaryString((int) num);
    }
    public String douToHex(double num){
        return Integer.toHexString((int) num);
    }
    public String douToOct(double num){
        return Integer.toOctalString((int) num);
    }
}
