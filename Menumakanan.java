import java.util.Scanner;

public class Menumakanan {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] namamakanan = new String[10];
		int[] banyakpesan = new int[10];
		int[] totalbayar = new int[10];
		int h_biasa = 10000, h_seafood = 15000, h_istimewa = 20000;
		int menu, i = 1, j = 0;
				
		do {
			System.out.println("Daftar Menu :");
			System.out.println("1. Nasi Goreng Biasa - "+h_biasa);
			System.out.println("2. Nasi Goreng Seafood - "+h_seafood);
			System.out.println("3. Nasi Istimewa - "+h_istimewa);
			System.out.println("0. Keluar / Selesai");
			System.out.print("- Pilih menu : ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				System.out.println("\n*** Keluar ***");
				break;
				
			case 1:
				namamakanan[i] = "Nasi Goreng Biasa";
				System.out.print("- Jumlah = ");
				banyakpesan[i] = sc.nextInt();
				totalbayar[i] = h_biasa * banyakpesan[i];
				System.out.println();
				break;
			
			case 2:
				namamakanan[i] = "Nasi Goreng Seafood";
				System.out.print("- Jumlah = ");
				banyakpesan[i] = sc.nextInt();
				totalbayar[i] = h_seafood * banyakpesan[i];
				System.out.println();
				break;
				
			case 3:
				namamakanan[i] = "Nasi Goreng Istimewa";
				System.out.print("- Jumlah = ");
				banyakpesan[i] = sc.nextInt();
				totalbayar[i] = h_istimewa * banyakpesan[i];
				System.out.println();
				
			default:
				namamakanan[i] = "-";
				System.out.println("\n---- Menu tidak ada ----");
				System.out.println();
				break;
			}
			
			i++;
			
		} while(menu > 0);
		
		
		for(j = 1; j <= i-2; j++)
		{
			System.out.println("---------------- Rincian ----------------");
			System.out.println("- Makanan \t: "+ namamakanan[j]);
			System.out.println("- Jumlah \t: "+banyakpesan[j]);
			System.out.println("- Bayar \t: "+totalbayar[j]);
			System.out.println("-----------------------------------------\n");
		}
		

	}

}
