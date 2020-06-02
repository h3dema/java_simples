/*

    Código do vídeo https://youtu.be/632UpLAy5xc no Youtube

 */
class StringConcatenacao {
    public static void main(String[] args) {
        String s2 = ", this new string.";
        String s1 = "s2 will concatenate to the end of this string in s3";

        String s3 = s1.concat(s2);

        System.out.println("s1 :"+s1);
        System.out.println("s2 :"+s2);
        System.out.println("s3 :"+s3);
    }
}
/*
As linhas abaixo mostram os passos e o resultado ao executar javac e java

1- compile o codigo (este arquivo)

PS C:\Users\henri\java simples> javac .\StringConcatenacao.java

2- rode a classe java.

PS C:\Users\henri\java simples> java StringConcatenacao
s1 :s2 will concatenate to the end of this string in s3
s2 :, this new string.
s3 :s2 will concatenate to the end of this string in s3, this new string.

 */