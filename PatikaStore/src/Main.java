
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		String [] brandNames= {"Samsung","Lenovo","Apple","Huawei","Casper","Asus","HP","Xiomi","Monster"};
		Scanner scan =new Scanner(System.in);
		
		TreeSet<Brand> brands=new TreeSet<>(new OrderBrandToName());
		for(int i=0;i<brandNames.length;i++) {
			brands.add( new Brand(brandNames[i],i));
		}
		
		
		ArrayList<NoteBook> notebooks=new ArrayList<>();
		notebooks.add(new NoteBook("Huawei", 1, 7000, 0, 0, "HUAWEI Matebook ", 512, 14.0, 16));
		notebooks.add(new NoteBook("Lenovo", 2, 3699, 0, 0, "LENOVO V14 IGL  ", 1024, 14.0, 8));
		notebooks.add(new NoteBook("ASUS", 3, 8199, 0, 0, "ASUS Tuf Gaming ", 2048, 15.6, 32));
		
		ArrayList<Phone> phones=new ArrayList<>();
		phones.add(new Phone("Samsung",1,3199,0,0,"SAMSUNG GALAXY A51 ",128,6.5,6,"Siyah",4000));
		phones.add(new Phone("Apple",2,7379,0,0,"Iphone 11 64 GB ",64,6.1,6,"Mavi",3046));
		phones.add(new Phone("Xiomi",3,4012,0,0,"Redmi Note 10 Pro 8GB  ",128,6.5,12,"Beyaz",4000));
		
		System.out.println(" PatikaStore Ürün Yönetim Paneli ");
		System.out.println();
		System.out.println("1-NoteBook İşlemleri");
		System.out.println("2-Cep Telefonu İşlemleri");
		System.out.println("3-Marka Listele");
		System.out.println("0-Çıkış Yap");
		System.out.print("Tercihiniz:");
		int tercih=scan.nextInt();
		System.out.println("---------------------------------");
		
		switch(tercih) {
		case 3:
			System.out.println(" Markalarımız ");
			System.out.println("----------------");
			for(Brand br:brands) {
				System.out.println(" - "+br.getBrandName());
			}
			break;
		case 0:
			System.out.println("PatikaStore'dan çıkış yapıldı.");
			break;
		case 1:
			System.out.println("Notebook Listesi");
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		      System.out.printf("| %-3s|  %-29s|  %-9s|  %-9s|  %-12s| %-10s|  %-9s| %n","ID","ÜRÜN ADI","FİYAT","MARKA","DEPOLAMA","EKRAN","RAM");
		      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			for(NoteBook nb:notebooks) {
				//System.out.println(nb.getId()+nb.getName()+nb.getPrice()+nb.getBrandName()+nb.getMemory()+nb.getScreenSize()+nb.getRam());
				//System.out.println(" |"+nb.getId()+ "|"+" | "+ nb.getName()  +"   "+"| "+ nb.getPrice()   +"  "+"     | "+nb.getBrandName()  +"   "+  "  | "+nb.getMemory()+"     "+"     | "+nb.getScreenSize() +"    "+"   | "+nb.getRam() +"        |");
				 System.out.printf("| %-3d|  %-29s|  %-9d|  %-9s|  %-12s|  %-9s|  %-9s| %n",nb.getId(),nb.getName(),nb.getPrice(),nb.getBrandName(),nb.getMemory(),nb.getScreenSize(),nb.getRam());
			}
			break;
		case 2:
			System.out.println("Cep Telefonu Listesi");
			  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		      System.out.printf("| %-3s|  %-29s|  %-9s|  %-9s|  %-9s| %-10s| %-10s|  %-9s|  %-9s| %n","ID","ÜRÜN ADI","FİYAT","MARKA","DEPOLAMA","EKRAN","PİL","RAM","RENK");
		      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		      for(Phone ph:phones) {
		    	  System.out.printf("| %-3d|  %-29s|  %-9d|  %-9s|  %-9s|  %-9s|  %-9s|  %-9s|  %-9s|  %n",ph.getId(),ph.getName(),ph.getPrice(),ph.getBrandName(),ph.getMemory(),ph.getScreenSize(),ph.getBattery(),ph.getRam(),ph.getColour());
		        }
		      break;
		default:
			System.out.println("Lütfen geçerli bir değer giriniz.");
		      }
			
		}
		
			
		
	}


