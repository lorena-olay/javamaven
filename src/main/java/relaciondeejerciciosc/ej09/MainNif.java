package relaciondeejerciciosc.ej09;

public class MainNif {

    //atributos
    private String numDNI;
    private char letraDNI;

    //metodos
    private static String letra (int numDNI){
        int num = numDNI % 23;
        String numString;
        switch(num)
        {
            case 0: numString = "T";
                break;
            case 1: numString = "R";
                break;
            case 2: numString = "W";
                break;
            case 3: numString = "A";
                break;
            case 4: numString = "G";
                break;
            case 5: numString = "M";
                break;
            case 6: numString = "Y";
                break;
            case 7: numString = "F";
                break;
            case 8: numString = "P";
                break;
            case 9: numString = "D";
                break;
            case 10: numString = "X";
                break;
            case 11: numString = "B";
                break;
            case 12: numString = "N";
                break;
            case 13: numString = "J";
                break;
            case 14: numString = "Z";
                break;
            case 15: numString = "S";
                break;
            case 16: numString = "Q";
                break;
            case 17: numString = "V";
                break;
            case 18: numString = "H";
                break;
            case 19: numString = "L";
                break;
            case 20: numString = "C";
                break;
            case 21: numString = "K";
                break;
            case 22: numString = "E";
                break;
            default: numString = "Invalido";
                break;
        }
        return numString;
    }

    //constructores
    /*
    public Nif(String numDNI) {
        this.numDNI = numDNI;
    }
*/
    //getters
    public String getNumDNI() {
        return numDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    //tostring

    @Override
    public String toString() {
        return "DNI = " + numDNI + "-" + letraDNI;
    }

    //contador de instancias
    private static int counter;
//intendo de contador de instancias
    /*
    public MyClass() {
        //...
        counter++;
    }
*/
    public static int getNumOfInstances() {
        return counter;
    }
}
