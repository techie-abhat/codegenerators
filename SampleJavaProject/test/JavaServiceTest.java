import org.junit.Test;

public class JavaServiceTest  {
	@Test
	public void testAdd(){
		int result = new JavaService().add(2, 3);
		assert 5==result;
	}
	@Test
	public void testFail() {
		assert 1 == 0;
	}
}
