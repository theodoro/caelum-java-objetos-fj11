public class ExemploQuatro{

    public static void main(String[] args){

        int fatorial = 1;
        for(int i = 0; i <= 10; i++){
          int n =  (i - fatorial) * i;
           fatorial++;
           System.out.println(n);
        }
    }

}
