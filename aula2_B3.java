package br.com.letscode.java;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Vaos fazer uma lgoritmo para analisar a nota de um aluno

        int nota = 100;
        String graduacao ;

        //se nota maior ou igual a 70 o aluno esta aprovado
        //vamos usar if e else

        //A 80 B 70 C 60 D 0
        if (nota >= 80) {
            graduacao = "A";
            System.out.println(" A !");
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
            System.out.println(" B.");
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
            System.out.println(" C.");
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
            System.out.println(" D.");
        } else {
            graduacao = "";
        }

        //esse switch é diretamente a variavel graduacao
        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado :)");
                break; //situacao de parada, ele vai parar de analisar
            case "C":
            case "D":
                System.out.println("Aluno não aprovado :(");
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
    }
