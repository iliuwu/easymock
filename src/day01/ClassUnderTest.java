package day01;

public class ClassUnderTest {
	private Collaborator listener;
	public void  setListener(Collaborator listener) {
		this.listener = listener;
	}
	public void addDocument(String title,byte[] document) {
		System.out.println(title);
	}
}
