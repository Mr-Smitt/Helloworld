public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("Hello World"); //Sender text hello world

        System.out.println("Teller til 10");
        for (int i=1; i<=10; ++i) { //for løkke som vil kjøres 10 ganger og øker i med 1 hver gang
            System.out.println(i); //her sender vi ut i til println som burde være 10
        }
    }

}
