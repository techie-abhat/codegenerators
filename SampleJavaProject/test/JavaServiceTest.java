
public class JavaServiceTest  {
	
	public void testAdd(){
		int result = new JavaService().add(2, 3);
		assert 5==result;
	}
}
