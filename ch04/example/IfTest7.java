package ch04.example;

public class IfTest7 {

	public static void main(String[] args) {
		int tax_rate=0,n=0;
		int my_land_Type=1;
		int my_land_size=25000;
		int my_land_own_year=5;
		
		float tax=0f;
		float area_tax=0f;
		if(my_land_Type==1){
			System.out.println("건물이 없는 토지");
			if(my_land_size<=1800)
				tax_rate=1800;
			else if(my_land_size<=2500)
				tax_rate=2000;
			else
				tax_rate=3000;
			
			area_tax=tax_rate*my_land_size;
			System.out.println("토지 면적 세액은 "+area_tax);
			if(my_land_own_year<3)
				n=0;
			else if(my_land_own_year<13)
				n=my_land_own_year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
		}else{
			System.out.println("건물이 있는 토지");
			if(my_land_size<=1800)
				tax_rate=3600;
			else if(my_land_size<=2500)
				tax_rate=4000;
			else
				tax_rate=6000;
			
			area_tax=tax_rate*my_land_size;
			System.out.println("토지 면적 세액은 "+area_tax);
			if(my_land_own_year<3)
				n=0;
			else if(my_land_own_year<13)
				n=my_land_own_year-2;
			else
				n=10;
			
			tax=area_tax-area_tax*0.05f*n;
		}
		tax=tax+0.3f*area_tax;
		System.out.println("내 토지 보유세금액은>>"+tax+"원 입니다.");
		System.out.printf("내 토지 보유세금액은>>%5.1f 원 입니다.",tax);
	}

}
