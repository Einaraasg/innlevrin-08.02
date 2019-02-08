import java.util.Scanner;

public class CDarkiv<delstreng> implements CDarkivADT {
    private CD[] cdArray;
    private CD[] nyCd;

    public CDarkiv(int antallCDPlasser, CD[] cd1){
        cdArray = new CD[antallCDPlasser];

    }
    public void addCDToArray(CD enCD){
        for(int i= 0; i < cdArray.length; i++){
            if(cdArray[i]==null){
                cdArray[i]=enCD;
                return;
            }
        }
        System.out.println("Arkivet er fult, slett en cd først!");
    }

    public CD[] hentCdTabell() {
        return new CD[0];
    }


    public void leggTilCd(CD[] nyCd) {
        nyCd= new CD[6];
        String cdinfo2;
        int cdinfo3;
        for(int i= 0; i < 7; i++){
            if(i==1) System.out.println("SKriv CD nr!");
            else if(i==2)System.out.println("Skriv ARtist navn");
            else if(i==3)System.out.println("Skriv album navn ");
            else if(i==4)System.out.println("Skriv utgivelses år");
            else if(i==5)System.out.println(" Skriv album sjanger");
            else if(i==6)System.out.println("Skriv Plateselskap");

        Scanner cdinfo = new Scanner(System.in);
            if(i==1){
  cdinfo2 =  cdinfo.nextLine();
  cdinfo3=Integer.parseInt(cdinfo2);
  nyCd[i].setCdNr(cdinfo3);}
else if (i==2){   cdinfo2 =  cdinfo.nextLine();
            nyCd[i].setArtist(cdinfo2);}
            else if(i==3){
                cdinfo2 =  cdinfo.nextLine();
                nyCd[i].setNavn(cdinfo2);}
                else if(i==4){
                cdinfo2 =  cdinfo.nextLine();
                nyCd[i].setAar(cdinfo2);
                }
                    else if(i==5){
                cdinfo2 =  cdinfo.nextLine();
                nyCd[i].setSjanger(cdinfo2);}
                        else if(i==6){
                cdinfo2 =  cdinfo.nextLine();
                nyCd[i].setPlateselskap(cdinfo2);}

        return;}




    }


    public void slettCd(int cdNr) {

        for(int i = 0; i< cdArray.length; i++){
            if(cdArray[i].getCdNr()==cdNr) {
                cdArray[i] = null;
                return;
            }}}

        public CD[] sokTittel( String
        delstreng) {
            int[] cdnummere= new int[cdArray.length];
            int teller = 0;
            for(int i = 0; i<cdArray.length; i++){
                if(cdArray[i].getTittel()==delstreng){
                    cdnummere[teller] = i;
                    teller ++;
                }
            }
            int teller2 = 0;
            for(int i = 0; i< cdnummere.length; i++){
                if(cdnummere[i]!=0){
                    teller2++;
                }
            }
            return new CD[0];
        }

        public CD[] sokArtist (String delstreng) {
            int[] cdnummere= new int[cdArray.length];
            int teller = 0;
            for(int i = 0; i<cdArray.length; i++){
                if(cdArray[i].getArtist()==delstreng){
                    cdnummere[teller] = i;
                    teller ++;
                }
            }
            int teller2 = 0;
            for(int i = 0; i< cdnummere.length; i++){
                if(cdnummere[i]!=0){
                    teller2++;
                }
            }
            return new CD[0];
        }

        public int antallSjanger(Sjanger sjanger) {
            return 0;
        }

        public int antall() {
            int antall = 0;
            for(int i = 0; i<cdArray.length; i++){
                if(cdArray[i].getNavn()!=null){
                    antall++;
                }
            }
            return antall;
        }
    }
