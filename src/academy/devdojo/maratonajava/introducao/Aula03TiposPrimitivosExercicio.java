package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Mário Sérgio";
        String endereco =  ("Rua Bahia N 371 Tanquinho");
        double salario = 2080.00;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);






    }
}
