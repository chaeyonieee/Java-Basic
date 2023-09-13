package rejavapro;

public class test_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rep[]= {51, 96, 65, 45, 23, 11, 12};
		int max = 0;
		int min = 100;
		for (int i = 0; i < rep.length; i++) {
			if(max<rep[i]) {
				max = rep[i];
			}if(min>rep[i]) {
				min = rep[i];
			}
		}System.out.println("max value : "+max + "\t min value : "+min);
		

	}

}
