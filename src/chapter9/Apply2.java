package chapter9;

import static net.mindview.util.Print.print;

public class Apply2 {
	public static void process(InterfaceProcessor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
}
