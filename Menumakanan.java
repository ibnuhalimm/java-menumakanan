import java.util.Scanner;

public class Menumakanan {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] namamakanan = new String[10];
		int[] banyakpesan = new int[10];
		int menu, i = 1, j = 0;
				
		do {
			System.out.println("Menu");
			System.out.println("1. Pesan Nasi Goreng Biasa");
			System.out.println("2. Pesan Nasi Goreng Seafood");
			System.out.println("3. Pesan Nasi Istimewa");
			System.out.println("0. Keluar");
			menu = sc.nextInt();
			System.out.println(menu);
			
			if(menu == 1)
			{
				namamakanan[i] = "Nasi Goreng Biasa";
				System.out.print("Banyak ="); banyakpesan[i] = sc.nextInt();
				
			} else 
			{
				if(menu == 2)
				{
					namamakanan[i] = "Nasi Goreng Seafood";
					System.out.print("Banyak ="); banyakpesan[i] = sc.nextInt();
					
				} else 
				{
					if(menu == 3)
					{
						namamakanan[i] = "Nasi Goreng Istimewa";
						System.out.print("Banyak ="); banyakpesan[i] = sc.nextInt();
					}
				}
			}
			
			i++;
			
		} while(menu > 0);
		
		
		for(j = 1; j <= i-2; j++)
		{
			System.out.println(namamakanan[j]);
			System.out.println(banyakpesan[j]);
		}
		

	}

}
