/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class Exercicio5 {

    public static void main(String[] args) {

        String string1 = "Keep Coding!";
        StringBuilder string2 = new StringBuilder();

        for (int i = string1.length() - 1 ; i >= 0; i--) {
            string2.append(string1.charAt(i));
        }

        System.out.println(string2);

    }

}
