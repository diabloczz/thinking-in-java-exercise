package chapter10;

public class E11 {
	private class DestinationImpl implements Destination {

		@Override
		public String readLabel() {
			return "DestinationImpl.readLabel";
		}

	}

	public Destination createDestination() {
		return new DestinationImpl();
	}

	public static void main(String[] args) {
		Destination d = new E11().createDestination();
		// (DestinationImpl)d;// DestinationImpl cannot be resolved to a variable
	}
}
