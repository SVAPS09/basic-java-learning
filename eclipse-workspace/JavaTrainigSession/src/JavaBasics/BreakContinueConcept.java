package JavaBasics;

public class BreakContinueConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		System.out.println();
		
		for (int j = 0; j < 10; j++) {
			  if (j == 4) {
			    continue;
			  }
			  System.out.println(j);
			}

	}

}
