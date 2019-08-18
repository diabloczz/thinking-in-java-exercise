package chapter9;

public class E11 implements InterfaceProcessor {
	public ConverseString converseString;

	public E11(ConverseString converseString) {
		this.converseString = converseString;
	}

	@Override
	public String name() {
		return getClass().getName();
	}

	@Override
	public Object process(Object input) {

		return converseString.converse((String) input);
	}

	public static void main(String[] args) {
		E11 e = new E11(new ConverseString());
		Apply2.process(e, "wangxuejingwoaini");
	}

}
