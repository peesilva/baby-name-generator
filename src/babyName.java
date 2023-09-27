import java.util.Random;
import java.util.Scanner;

public class babyName {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int indiceName = random.nextInt(name.listaDeNomes.length);
            int indiceLastName = random.nextInt(lastName.listaDeSobrenomes.length);

            String nameRandom = name.listaDeNomes[indiceName];
            String lastNameRandom = lastName.listaDeSobrenomes[indiceLastName];

            String fullName = nameRandom + " " + lastNameRandom;
            System.out.println("The baby name is: " + fullName);

            System.out.print("Write 1 to generate a new baby name or press any else to finish: ");
            String choose = scanner.nextLine();

            if (!choose.equals("1")) {
                continuar = false;
            }
        }

        System.out.println("Program is finishh, Tks.");
    }
}