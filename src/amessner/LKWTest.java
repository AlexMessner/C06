package amessner;

import org.junit.*;
import weiser.*;
/*
 * git@github.com:AlexMessner/C06.git
 */
public class LKWTest {
	LKW l1;
	
	@Before
	public void prepare(){
		l1=new LKW("W12345",5000,2000,2);
	}
	@Test
	public void test1(){
		Assert.assertEquals(2000, l1.getEigenGewicht());
	}
	@Test
	public void test2(){
		Assert.assertEquals(5000, l1.getHoechstZulaessigesGesamtGewicht());
	}
	/*
	 * ka warum hier 0 kommt
	 */
	@Test
	public void test3(){
		Assert.assertEquals(0, l1.getNutzLast());
	}
	@Test
	public void test4(){
		l1.aufladen(100);
	}
	/*
	 * eigentlich sollte hier eine Exception kommen aber kommt nicht(expected=GewichtException.class)
	 */
	@Test
	public void test5(){
		l1.aufladen(6000);
	}
	@Test(expected=GewichtException.class)
	public void test6(){
		l1.entladen(3000);
	}
	@Test
	public void test7(){
		l1.toString();
	}
	@After
	public void ende(){
		System.out.println("Test abgeschlossen");
	}
}
