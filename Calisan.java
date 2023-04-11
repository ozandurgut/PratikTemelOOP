
public class Calisan {
	public int no;
	public String isim;
	public String soyisim;
	public double maas;
	public int tecrube;

	public Calisan() {

	}

	public Calisan(int no, String isim, String soyisim, double maas, int tecrube) 
	{
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
		this.tecrube = tecrube;
	}

	public void CalisanBilgileriGoster()

	{
		System.out.println("********ÇALIŞAN BİLGİLERİ********");
		System.out.println("No      : " + no);
		System.out.println("İsim    : " + isim);
		System.out.println("Soyisim : " + soyisim);
		System.out.println("Maaşı   : " + maas);
		System.out.println("Tecrübe :  " + tecrube);
		

	}
	
	
	public void zamYap(int zamDegeri)
	{
		System.out.println("Maaşınıza "+zamDegeri+"TL zam yapıldı");
		System.out.println("Güncel maaşınız "+ (maas+zamDegeri));
		
	}
	
	public void formatAt(String isletimSistemi,String kim)
	{
		System.out.println(kim + " şu anda "+isletimSistemi+" İşletim sistemine format atıyor.");
	}
	
		
	
	
	
	
	


}
