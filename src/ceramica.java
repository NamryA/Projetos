import java.util.Scanner;


class ceramica {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
     System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double larguraArea = scanner.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimentoArea = scanner.nextDouble();

        System.out.print("Digite a largura da cerâmica (em metros): ");
        double larguraCeramica = scanner.nextDouble();

        System.out.print("Digite o comprimento da cerâmica (em metros): ");
        double comprimentoCeramica = scanner.nextDouble();
    
     	double areaTotal = larguraArea * comprimentoArea;
        double areaCeramica = larguraCeramica * comprimentoCeramica;
    
    	double quantidadeNecessaria = areaTotal / areaCeramica;


    	double quantidadeComAcabamento = quantidadeNecessaria * 1.10;
  
    
    System.out.println("A quantidade de revestimento necessario é de: " + quantidadeComAcabamento);
    
    scanner.close();
  }
}
