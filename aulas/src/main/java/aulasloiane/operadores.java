package aulasloiane;

public class operadores {

    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        // Essa operação é a mesma coisa que a debaixo resultado++
        // Nese ponto aqui resultado esta valendo 3 que foi o resto da divisão
        resultado = resultado + 1;
        System.out.println(resultado);
        // Como o ultimo valor do resultado foi 4 resultado++ e a mesma coisa que somar
        // um deu 5 total

        resultado++;
        System.out.println(resultado);

        // 5
        System.out.println(resultado++);
        // mesma coisa que
        // System.out.println(resultado);
        // resultado = resultado + 1;
        // resultado +=1;

        System.out.println(++resultado);
        // mesma coisa que
        // resultado += 1;
        // System.out.println(resultado);

        resultado--;
        System.out.println(resultado--);
        System.out.println(--resultado);

    }

}