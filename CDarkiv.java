public class CDarkiv<delstreng> implements CDarkivADT {
    private CD[] cdArray;

    public CDarkiv(int antallCDPlasser){
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

    public void slettCD(String cdTittel){
        for(int i = 0; i< cdArray.length; i++){
            if(cdArray[i].getNavn()==cdTittel) {
                cdArray[i] = null;
                return;
            }
        }
        System.out.println("Fant ingen cder med det navnet");
    }


    public CD[] hentCdTabell() {
        return new CD[0];
    }


    public void leggTilCd(CD nyCd) {

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
