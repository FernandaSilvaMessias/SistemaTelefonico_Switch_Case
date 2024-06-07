import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
            System.out.println("Digite um plano escolhido (T-5Gb Youtube) / (M-Whats e Instagram grátis / (B- 100 minutos de ligação");
            String plano = scan.nextLine();

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            break;
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }
            break;
            case "B": {
                ;
                System.out.println("100 minutos de ligação");
            }
        }

    }
}

