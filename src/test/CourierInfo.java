package test;

/**
 * 前台返回的快递订单及电子面单数据
 * 
 * @author czz
 *
 */
public class CourierInfo {
	/** 订单数据 */
	private Order order;
	/** 打印的电子面单数据 */
	private String PrintTemplate;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getPrintTemplate() {
		return PrintTemplate;
	}

	public void setPrintTemplate(String printTemplate) {
		PrintTemplate = printTemplate;
	}

	public static void main(String[] args) {
//		String a = "7.0";
//		System.out.println(Double.valueOf(a).intValue());
		String a = "170/165";
		String[] aa = a.split("/");
		for (String str : aa) {
			System.out.println(str);
		}
	}
}
