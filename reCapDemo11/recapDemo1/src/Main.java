public class Main {
    public static void main(String[] args) {

/*        int sayi1 = 19;
        int sayi2 = 113;
        int sayi3 = 25;
        int i = 0;
        *//*if (sayi1 > sayi2 && sayi1 > sayi3) {                 ctrl+shift+/
            System.out.println("En büyük sayı: " + sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük sayı: " + sayi2);
        } else {
            System.out.println("En büyük sayı: " + sayi3);
        }*//*

        if (sayi1 > i) {
            i = sayi1;
        }
        if (sayi2 > i) {
            i = sayi2;
        }
        if (sayi3 > i) {
            i = sayi3;
        }

        System.out.println("En büyük sayı: " + i);*/

        /*String yazi="Rastgele           ";
        System.out.println(yazi.length());
        String yazi2 = yazi.spl it(" ")
        System.out.println(yazi2);
        System.out.println(yazi2.length());
*/


        /*int sayi = 30;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println("Sayı asal değil.");

            }

        }*/

        int [] sayilar = new int[]{1,3,5,4,9,0};

        int aranacak = 6;

        Boolean durum =Boolean.FALSE;

        for (int sayi:sayilar){

            if (sayi ==aranacak){
                durum=true;
                break;
            }

        }

        if (durum){System.out.println("Sayı var.");}else {System.out.println("Sayı Yok");}



    }}

