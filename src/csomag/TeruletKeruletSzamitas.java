package csomag;


public class TeruletKeruletSzamitas {

   
    public static void main(String[] args) {
        formakSzamolasa();
        
    }
    
    private static void formakSzamolasa() {
        negyzetSzamolasok();
        teglalapSzamolasok();
    }
    

    private static void negyzetSzamolasok() {
        negyzetKerulet(10,4);
        negyzetTerulet(10);
    }

    private static void negyzetKerulet(int oldalmeret, int oldalakszama) {
        String kimenet = "A négyzet kerülete: "+ (oldalakszama*oldalmeret)+"cm";
        kiir(kimenet);
    }

    private static void negyzetTerulet(int oldalmeret) {
        String kimenet = "A négyzet területe: "+ (oldalmeret*oldalmeret)+"cm";
        kiir(kimenet);
    }
    
     private static void teglalapSzamolasok() {
         teglalapKerulet(5,10);
         teglalapTerulet(5,10);
     }

    private static void teglalapKerulet(int rovidoldal, int hosszuoldal) {
        String kimenet = "A téglalapt kerülete: "+ 2*(rovidoldal+hosszuoldal)+"cm";
        kiir(kimenet);
    }
    
    private static void teglalapTerulet(int rovidoldal,int hosszuoldal) {
        String kimenet = "A téglalapt területe: "+ (rovidoldal*hosszuoldal)+"cm";
        kiir(kimenet);
    }
    
    private static void kiir(String uzenet) {
        System.out.println(uzenet);
    }

    

   

    
}
