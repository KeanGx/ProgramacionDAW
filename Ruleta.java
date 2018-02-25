/**
 * Main class of the Java program.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {
        static final int[] PASSE = {19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        static final int[] MANQUE = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        static final int[] PAIR = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
        static final int[] IMPAIR = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
        static final int[] BLACK = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
        static final int[] RED = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        static final int[] P12 = {1,2,3,4,5,6,7,8,9,10,11,12};
        static final int[] M12 = {13,14,15,16,17,18,19,20,21,22,23,24};
        static final int[] D12 = {25,26,27,28,29,30,31,32,33,34,35,36};
        static final int[] COL1 = {1,4,7,10,13,16,19,22,25,28,31,34};
        static final int[] COL2 = {2,5,8,11,14,17,20,23,26,29,32,35};
        static final int[] COL3 = {3,6,9,12,15,18,24,24,27,30,33,36};
        static final int[] NUMS = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        static final String[] AllowedBetZone = {"PASSE", "MANQUE", "PAIR", "IMPAIR", "BLACK", "RED", "P12", "M12", "D12", "COL1", "COL2", "COL3"};
    
    public static void main(String[] args) {
        boolean Output,Outcome;
        String zBet,mode;
        char Confirm;
        int qBet, Dinero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Indique los fondos Disponibles ==> ");
            Dinero = sc.nextInt();
            if (Dinero == 0) {
                System.out.println("No tiene Fondos Suficientes...");
                System.out.println("Programa Terminado");
                System.exit(0);
            }
            System.out.print("Desea continuar? ==> ");
            Confirm = sc.next().charAt(0);
        } while (Confirm == 'N' || Confirm == 'n');
        do {
            do {
                qBet = Apuesta();
                System.out.print("Esta seguro de la cantidad apostada? ==> ");
                Confirm = sc.next().charAt(0);
            } while (Confirm == 'N' || Confirm == 'n' );
            
            Outcome = initGame();
            if (Outcome == true){
                    System.out.println("Has ganado la apuesta!");
                    System.out.print("Actualizando Fondos Disponibles... ==> ");
                    Dinero = Dinero + qBet;
                    System.out.println(Dinero);
                    
            }
            else if (Outcome == false) {
                    System.out.println("Has perdido la apuesta!");
                    System.out.print("Actualizando Fondos Disponibles... ==> ");
                    Dinero = Dinero - qBet;
                    System.out.println(Dinero);
            }
            if (Dinero > 0) {
                System.out.print("Desea seguir Jugando? ==> ");
                Confirm = sc.next().charAt(0);
            }
            else if (Dinero <= 0 ) {
                Confirm = 'N';
            }
        } while (Confirm != 'N' && Confirm != 'n');
        System.out.println("Programa Terminado");
        System.out.print("Fondos Disponibles Restantes ==> " + Dinero);
    }
    
    public static boolean initGame(){
        Scanner sc = new Scanner(System.in);
        boolean Output,Outcome;
        char gameMode;
        String zBet;
        int NumBet;
        
        System.out.print("Desea apostar por zonas? ==> ");
            gameMode = sc.next().charAt(0);
            
        if (gameMode != 'N' && gameMode != 'n') {    
                do {
                    System.out.print("Zonas: ");
                        
                        for (int index = 0; index <= AllowedBetZone.length-1 ; index++) {
                            if (index < AllowedBetZone.length-1) {
                                System.out.print(AllowedBetZone[index] + " - ");
                            }
                            else {
                                System.out.print(AllowedBetZone[index]);
                            }
                        }
                        
                    System.out.println();
                    System.out.print("Elige la zona de juego ==> ");
                        zBet = sc.next();
                    Output = AllowBet(zBet);
                } while (Output == false);
                Outcome = ExeGameZone(zBet);
        }
        else {
            do {
                System.out.println("Apuestas Validas [0-36]");
                System.out.print("Elige tu apuesta ==> ");
                    NumBet = sc.nextInt();
                Output = AllowNumBet(NumBet);
            } while (Output == false);
            Outcome = ExeGameNum(NumBet);
        }
        return Outcome;
    }
    
    public static boolean ExeGameZone(String zBet) {
        Random r = new Random();
        int Game;
        Game = r.nextInt(36)+1;
        System.out.println("El numero generado es el " + Game);
        
        switch(zBet) {
            case "PASSE":
                for (int index = 0 ; index <= PASSE.length-1 ; index++) {
                    if (PASSE[index] == Game) {
                        return true;
                    }
                };break;
            case "MANQUE":
                for (int index = 0 ; index <= MANQUE.length-1 ; index++) {
                    if (MANQUE[index] == Game) {
                        return true;
                    }
                };break;
            case "PAIR":
                for (int index = 0 ; index <= PAIR.length-1 ; index++) {
                    if (PAIR[index] == Game) {
                        return true;
                    }
                };break;
            case "IMPAIR":
                for (int index = 0 ; index <= IMPAIR.length-1 ; index++) {
                    if (IMPAIR[index] == Game) {
                        return true;
                    }
                };break;
            case "BLACK":
                for (int index = 0 ; index <= BLACK.length-1 ; index++) {
                    if (BLACK[index] == Game) {
                        return true;
                    }
                };break;
            case "RED":
                for (int index = 0 ; index <= RED.length-1 ; index++) {
                    if (RED[index] == Game) {
                        return true;
                    }
                };break;
            case "P12":
                for (int index = 0 ; index <= P12.length-1 ; index++) {
                    if (P12[index] == Game) {
                        return true;
                    }
                };break;
            case "M12":
                for (int index = 0 ; index <= M12.length-1 ; index++) {
                    if (M12[index] == Game) {
                        return true;
                    }
                };break;
            case "D12":
                for (int index = 0 ; index <= D12.length-1 ; index++) {
                    if (D12[index] == Game) {
                        return true;
                    }
                };break;
            case "COL1":
                for (int index = 0 ; index <= COL1.length-1 ; index++) {
                    if (COL1[index] == Game) {
                        return true;
                    }
                };break;
            case "COL2":
                for (int index = 0 ; index <= COL2.length-1 ; index++) {
                    if (COL2[index] == Game) {
                        return true;
                    }
                };break;
            case "COL3":
                for (int index = 0 ; index <= COL3.length-1 ; index++) {
                    if (COL3[index] == Game) {
                        return true;
                    }
                };break;    
        }
        return false;
    }
    
    public static boolean ExeGameNum(int NumBet){
        Random r = new Random();
        int Game;
        Game = r.nextInt(36)+1;
        
        System.out.println("El numero generado es el " + Game);
        
        if (NumBet == Game){
            return true;
        }
        return false;
    }
    public static int Apuesta(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Realice su apuesta: "); 
        System.out.print("Cantidad apostada ==> ");
            int qBet = sc.nextInt();
        return qBet;
    }
    
    public static boolean AllowBet(String zBet) {
      
            for (int index = 0 ; index <= AllowedBetZone.length-1; index++){
                if (zBet.equals(AllowedBetZone[index])) {
                    return true;
                }
            }
        return false;
    }
    public static boolean AllowNumBet(int numBet) {
      
            for (int index = 0 ; index <= NUMS.length-1; index++){
                if (numBet == NUMS[index]) {
                    return true;
                }
            }
        return false;
    }
    
    
}
