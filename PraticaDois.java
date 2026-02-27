public class PraticaDois {
    public static void main(String[] args) {

        String nome;
        double primeiraNota;
        double segundaNota;
        double a;
        int b;



        nome = "joao";
        primeiraNota = 10;
        segundaNota = 7;
        System.out.println("A MEDIAFINAL DE : " + nome + " e de " + ((primeiraNota + segundaNota) / 2));


        nome = "ana";
        primeiraNota = 5;
        segundaNota = 7;
        System.out.println("A MEDIAFINAL DE : " + nome + " e de " + ((primeiraNota + segundaNota) / 2));

        nome = "renata";
        primeiraNota = 5;
        segundaNota = 8;
        System.out.println("A MEDIAFINAL DE : " + nome + " e de " + ((primeiraNota + segundaNota) / 2));
        boolean c = (primeiraNota == segundaNota);
        System.out.println(c);

        b= 10;
        a=15;
         if (b > a ){
            System.out.println(" numero aceito ");}
         else{
                System.out.println("numero nao alocado");
        }
         b=10;
         a=50.5;

        double total = ((int) a + b);
        System.out.println(total);

        char letra;
        String palavra;

        palavra= "eu estudei na escola xenofonte na  turma ";
        letra= 'a';
        System.out.println(palavra + letra );

        double precoProduto;
        int quantidade;

         precoProduto = 5.99;
         quantidade= 5;

        System.out.println( "O preco do produto ficou em : "+ ((int)precoProduto * quantidade)+ " reais ao todo.");

        double valorEmDolares =4.94;
        double reais;

        System.out.println(" o valor de 3 dolares em reias ficou em : " + (valorEmDolares *(reais= 3))+ " reais.");

        System.out.println("teste on ");





    }
}
