package ch13.genericMulti;

public class Product<T, M> {
	private T kind;
	private M model; //�ʵ� ����
	
	public T getKind() { return kind; }
	public M getModel() { return model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}
