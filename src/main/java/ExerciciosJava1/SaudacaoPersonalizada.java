package ExerciciosJava1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void main(String[] args) {
        // Instacias
        Scanner ent = new Scanner(System.in); //Entrada
        LocalDate dataHoje = LocalDate.now(); //Data de acordo com local
        Locale brasil = new Locale("pt", "BR"); //Identificando o local
        // Entradas
        System.out.println("Qual o seu nome?");
        String nome = ent.nextLine();
        String diaDaSemana = dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        // Condições
        String saudacao;
        LocalDateTime horaLocal = LocalDateTime.now();
        if(horaLocal.getHour() >= 0 && horaLocal.getHour() < 12){
            saudacao = "Bom dia";
        }else if(horaLocal.getHour() >= 12 && horaLocal.getHour() < 18){
            saudacao = "Boa tarde";
        }else if(horaLocal.getHour() >= 18 && horaLocal.getHour() <= 24){
            saudacao = "Boa noite";
        }else{
            saudacao = "Bem vindo";
        }
        // Saída
        System.out.printf("%s, %s. %s é um ótimo dia da semana para começar este curso. Bons estudos!", saudacao, nome, diaDaSemana);
    }
}
