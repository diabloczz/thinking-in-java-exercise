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

}
