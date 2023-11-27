package br.com.letscode.java;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  //Ola, {nome}. Hoje é dia {dia-da-semana}, BOM DIA.
        String nome = "Jessé";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "Jessé";
        //vendo se a string é igual com equals
        //Ignore é para igonara se é maiusculo ou minusculo
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
    }
}
