import java.util.Scanner;
public class Main {
    public static void main(String[] orgs) {
        String userName, password,newPass;
        int deger;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.print("Başarılı bir şekilde giriş yaptınız ! ");
        } else
        {
            System.out.print("Bilgileriniz yanlış !, Yeni şifre oluşturmak ister misiniz ? "
                    + "(n 1-Evet\\n 2-Hayır)");
            deger = inp.nextInt();
            if (deger == 1)
            {
                System.out.print("Yeni şifre giriniz");
                inp.nextLine();
                newPass=inp.nextLine();

                if (newPass.equals("java123"))
                {
                    System.out.print("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                }
                else
                {
                    System.out.print("Şifre oluşturuldu");
                }
            }
            else
            {
                System.out.println("şifreniz değiştirilmedi");
            }
        }


















        }
    }

















