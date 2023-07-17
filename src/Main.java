import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName , password;
        Scanner alici= new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz=");
        userName = alici.nextLine();
        System.out.print("Şifrenizi  giriniz=");
        password = alici.nextLine();
        if (userName.equals("Garanti")&&password.equals("Patika")){
            System.out.println("Kullanıcı girişi başarılı");

        }
        else {
            System.out.println("Hatalı giriş yaptınız");
        }

    }
}