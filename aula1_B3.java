package br.com.letscode.java;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean fimDeSemana = true; //forma recomandada pelo java de se escrever
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana || fazendoSol; //para validar duas condições é o e comencial
        System.out.println(vamosAPraia);

        //Tabela Verdade
        //Operado && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true  = true
        // false || false = false

        // A interrogação vai dar a opção de analisar a mensagem se verdadeiro ou falso
        // chamado de operador ternario, três termos
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);



        }
    }
