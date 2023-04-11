import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		
		System.out.println("*******Uygulamaya Hoş geldiniz*******");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("No değerini giriniz : ");
		int no = scanner.nextInt();
		scanner.nextLine();
		System.out.print("İsim değerini giriniz : ");
		String isim = scanner.nextLine();
		
		System.out.print("Soyisim değerini giriniz : ");
		String soyisim = scanner.nextLine();
		
		System.out.print("Tecrübe değerini giriniz : ");
		int tecrube = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Maaş değerini giriniz : ");
		double maas = scanner.nextDouble();
		scanner.nextLine();
		
		Calisan calisan1 = new Calisan(no, isim, soyisim,maas, tecrube);
		
		String islemler = "1-Çalışan bilgierini göster \n"
				+ "2-Zam yap\n"
				+ "3-Format at";
		System.out.println("----------------------------");	
		System.out.println(islemler);
		System.out.println("Seçim Yapınız.");
		int secim = scanner.nextInt();
		scanner.nextLine();
		
		switch (secim) {
		case 1:
			calisan1.CalisanBilgileriGoster();
			break;
		case 2:
			System.out.print("zam değerini giriniz : ");
			int zamDegeri = scanner.nextInt();
			scanner.nextLine();
			calisan1.zamYap(zamDegeri);
			break;
		case 3:
			System.out.print("Format atacak kişinin ismini giriniz : ");
			String kisi = scanner.nextLine();
			System.out.print("İşletim sistemini giriniz :");
			String isletimSistemi = scanner.nextLine();
			calisan1.formatAt(isletimSistemi, kisi);
			break;
			
			
		default:
			System.out.println("Lütfen geçerli bir değer giriniz.");
			break;
		}
		
		
		
		

	}

}
