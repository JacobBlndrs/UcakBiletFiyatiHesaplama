import java.util.Scanner;

public class BiletFiyat {
    public static void main(String[] args) {
        System.out.println("------------Ucak Bilet Fiyati Hesaplama----------");
        double distance,distancePrice=0.10,age,travelType,totalPrice,ageDiscount,typeDiscount=0.2;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafe Giriniz : ");
        distance=inp.nextDouble();


        System.out.print("Yasinizi Giriniz : ");
        age=inp.nextDouble();


        System.out.print("Yolculuk tipini seciniz : \n1-Tek Gidis\n2-Gidis-Donus\n");
        travelType=inp.nextDouble();

        totalPrice=distancePrice*distance;

        if (age<12){
            ageDiscount=0.5;
            totalPrice-=(totalPrice*ageDiscount);
        } else if (age>12 && age<24) {
            ageDiscount=0.1;
            totalPrice-=(totalPrice*ageDiscount);
        } else if (age>65) {
            ageDiscount=0.3;
            totalPrice-=(totalPrice*ageDiscount);
        }
        if (travelType==2){
            totalPrice=(totalPrice-(totalPrice*typeDiscount))*2;
        }


        if (distance<0){
            System.out.println("Hatali deger girdiniz.Lutfen tekrar deneyiniz...");
            if (age<0){
                System.out.println("Hatali deger girdiniz.Lutfen tekrar deneyiniz...");
            }
        if (travelType!=1 || travelType!=2){

            System.out.println("Hatali deger girdiniz.Lutfen tekrar deneyiniz...");
        }
        }else {
            System.out.println("Bilet Tutari : "+totalPrice+"\s"+"TL");
        }

    }



}














