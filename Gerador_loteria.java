import java.util.Random;

public class Gerador_loteria {
    
     public static void main(String[] args) {
       
        int numero, i, j;
        int [] mega = new int [6];

        Random r = new Random();
        for (i= 0; i<mega.length;i++){
            numero = r.nextInt(60) + 1;

             for (j= 0; j<mega.length;j++){
                if (numero == mega[j] && j != i){
                    numero = r.nextInt(60) + 1;
                }else {
                    mega[i] = numero;
                }

        }

    }
                 for (i=0; i<mega.length; i++ ){
                    for(j=i+1; j<mega.length ; j++){
                        if(mega[i] > mega[j]){
                            numero = mega[i];
                            mega[i] = mega[j];
                            mega[j] = numero;
                        }
                    }
    }
                for (i=0; i<mega.length; i++){
                    System.out.print(mega[i] + " ");
                }
}
}