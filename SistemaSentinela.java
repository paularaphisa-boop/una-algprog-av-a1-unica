import java.util.Scanner;

public class SistemaSentinela {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema Sentinela ===");
        System.out.print("Digite seu nome: ");
        String nomeProfissional = scanner.nextLine();

        System.out.print("Digite seu cargo (Cientista, Engenheiro, Zelador, Administrativo): ");
        String cargoAtual = scanner.nextLine();

        System.out.print("Informe o seu nível de acesso (de 1 a 10): ");
        int nivelAcesso = scanner.nextInt();

        if (nivelAcesso < 1 || nivelAcesso > 10) {
            System.out.println("Erro: Nível de acesso inválido.");
            System.exit(1);
         }
        
        System.out.print("Informe o nível de sigilo da área para acesso: ");
        int nivelSigilo = scanner.nextInt();
    
        if (nivelAcesso >= nivelSigilo) {
            int nivelAutoridade = nivelAcesso - nivelSigilo;
            System.out.println("ACESSO PERMITIDO. Saldo de autoridade: " + nivelAutoridade);
        } else if (nivelAcesso < 3 && nivelSigilo > 7) {
            System.out.println("ACESSO NEGADO.\nALERTA: Tentativa de acesso indevida detectada!");
        }
        
        System.out.println("===================================================================");
     
        scanner.close();
    }  
     
}
