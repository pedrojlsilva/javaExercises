public class Q2 {
    public static void main(String[] args) {
        Texto texto = new Texto("porta, portaria");
        System.out.println("a quantidade de palavras eh "+texto.countPalavras());
        System.out.println("a freq eh "+texto.countFreqSubstring("porta"));
        texto.substituirPalavra("porta", "door");
        System.out.println("o novo texto eh");
        texto.printTexto();
    }
}



class Texto {
    protected String texto;

    public Texto(String _texto) {
        texto = _texto;
    }

    protected void printTexto(){
        System.out.println(texto);
    }
    
    protected int countPalavras(){
        int count=0;
        boolean reading=false;  
        for (int i=0; i<texto.length();i++){
            if (Character.isLetter(texto.charAt(i))){
                if(!reading) count++;
                reading=true;
            }else if(reading){
                reading=false;
            }

         }

        return count;
    }

    protected int countFreqSubstring(String str){
        int freq=0;
        int myIndex=0;
        
        while(myIndex!=-1){
            myIndex = texto.indexOf(str, myIndex);

            if (myIndex!=-1){
                myIndex+=str.length();
                freq++;
            }
            
        }
        return freq;
    }

    protected void substituirPalavra(String strBusca, String strParaSubstituir){
        int myIndex=0;
        
        while(myIndex!=-1){
            myIndex = texto.indexOf(strBusca, myIndex);

            if (myIndex!=-1){
                if(!Character.isLetter(texto.charAt(myIndex+strBusca.length()))){
                    String pre = texto.substring(0, myIndex);
                    String pos = texto.substring(myIndex+strBusca.length(), texto.length());
                    texto = pre + strParaSubstituir + pos;
                    
                }
                myIndex+=strBusca.length();
            }
            
        }
        
    }
    
}