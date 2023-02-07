package rojatest;


	

	import static org.junit.Assert.assertEquals;

import roja.Get;

	public class Testclass {	
		public static Get objCalculator;
		public void setup() throws Exception {
			objCalculator=new Get();
			
		}
		public void teardown() throws Exception{
			System.out.println("closing");
		}
		public void additionTest() {
			assertEquals(25, objCalculator.addition(12,13));
		}
		public void substractionTest() {
			assertEquals(-1,objCalculator.subtraction(12, 13));
		}
		public void divisionTest() {
			assertEquals(0,objCalculator.division(12, 13));
		}
		public void multiplyTest() {
			assertEquals(156,objCalculator.multiplication(12, 13));
		}
		

	

}
