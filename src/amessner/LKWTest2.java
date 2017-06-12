package amessner;

import org.junit.*;
import weiser.*;
/*
 * git@github.com:AlexMessner/C06.git
 */
public class LKWTest2 {
	LKW l1;
	
	@Before
	public void prepare(){
		l1=new LKW("W12345",5000,2000,2);
	}
	@Test
	public void test1(){
		Assert.assertEquals(0, l1.getPersonenZahl());
	}
	@Test
	public void test2(){
		Assert.assertEquals(2, l1.getHoechstZulaessigePersonenZahl());
	}
	@Test
	public void test3(){
		l1.einsteigen();
	}
	@Test(expected=PersonenException.class)
	public void test4(){
		l1.aussteigen();
		l1.aussteigen();
	}
	@Test
	public void test5(){
		l1.toString();
	}
	@After
	public void ende(){
		System.out.println("Test abgeschlossen");
	}
}
