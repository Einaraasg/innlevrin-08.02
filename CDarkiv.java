import java.util.Scanner;

public abstract class CDarkiv<CD, leggTilCD> implements CDarkivADT {
    CD[] [] cdTabell;
    int antall;
    private CD[][] nyCd;
    private int cdNr;
    private leggTilCD;
    private String Artist;
    private String Navn;
    private String Aar;
    private String Sjanger;
    private String Plateselskap;
    private static void main (String cdtabbel){} {

        //CD cd1= new CD(1,"Eminem","Encore","2004","hiphop","Aftermath" );
        //CD cd2= new CD(2,"Rammstein","Mutter","2001","Hard rock","Motor music" );
        //CD cd3= new CD(3,"Queen","The game","2004","Rock","Emi" );
        //CD cd4= new CD(4,"2pac","All eyez on me","1996","hiphop","Death Row" );
        // CD cd5= new CD(5,"Pink Floyd","The wall","1979","rock","Harvest" );

        //CD CDarkiv[] = new CD[5];
        //CDarkiv[0] = cd1;
        //CDarkiv[1] = cd2;
        // CDarkiv[2] = cd3;
        //CDarkiv[3] = cd4;
        //  CDarkiv[4] = cd5;

        // Returnere en tabell av CD-er
       //D[] hentCdTabell ();

// Legger til en ny CD
        void leggTilCd;

CD CDarkiv []= new CD[]

    // Sletter en CD hvis den fins
    public boolean slettCd(int cdNr) {
        return false;
    }

    // Søker og henter CD-er med en gitt delstreng


        CD[] sokTittel (String delstreng);

        // Søker og henter artister med en gitt delstreng
        CD[] sokArtist (String delstreng);

        // Henter antall CD-er for en gitt sjanger
        int antallSjanger (Sjanger sjanger);
    }


    // Returnerer antall CD-er
    public abstract int antall();

