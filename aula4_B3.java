package br.com.letscode.java;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
  //Ola, {nome}. Hoje é dia {dia-da-semana}, BOM DIA.
   String nome = "Jessé";

   //ISO 8601 -> Padrão muldial
        LocalDate  hoje = LocalDate.now(); //Data com as infos locais
        Locale brasil = new Locale("pt","BR");
        //Locale brasil = new Locale (language: "pt", country: "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil)); //data e dia da semana
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour()< 12) {
            saudacao = "Bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        }else if (agora.getHour() >= 18){
            saudacao = "Boa Noite";

            //o printl -> %s representa strings o %n representa quebra
        }else {
            saudacao = "Ola";
        }
        System.out.printf("Ola,%s. Hoje é %s, %s. %n", nome,diaSemana,saudacao.toUpperCase());//definimos o formato e depois os valores

            }
        }





