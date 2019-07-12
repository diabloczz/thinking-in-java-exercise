package test;

/**
 * 快递订单数据
 * 
 * @author czz
 *
 */
public class Order {
	private String MarkDestination;
	private String LoqisticCode;
	private String ShipperCode;
	private String PackageName;
	private String OrderCode;
	private String KDNOrderCode;

	public String getMarkDestination() {
		return MarkDestination;
	}

	public void setMarkDestination(String markDestination) {
		MarkDestination = markDestination;
	}

	public String getLoqisticCode() {
		return LoqisticCode;
	}

	public void setLoqisticCode(String loqisticCode) {
		LoqisticCode = loqisticCode;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public void setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
	}

	public String getPackageName() {
		return PackageName;
	}

	public void setPackageName(String packageName) {
		PackageName = packageName;
	}

	public String getOrderCode() {
		return OrderCode;
	}

	public void setOrderCode(String orderCode) {
		OrderCode = orderCode;
	}

	public String getKDNOrderCode() {
		return KDNOrderCode;
	}

	public void setKDNOrderCode(String kDNOrderCode) {
		KDNOrderCode = kDNOrderCode;
	}

}
