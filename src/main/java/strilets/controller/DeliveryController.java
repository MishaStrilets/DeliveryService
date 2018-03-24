/** 
 * @author Mykhailo Strilets
 */

package strilets.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import strilets.message.Response;
import strilets.model.Delivery;

@RestController
public class DeliveryController {

	List<Delivery> listDeliveries = new ArrayList<Delivery>();

	@RequestMapping("/get")
	public Response getDeliveries() {
		return new Response("OK", listDeliveries);
	}

	@RequestMapping("/add")
	public Response addDelivery() {
		int count = listDeliveries.size();

		switch (count) {
		case 0:
			listDeliveries.add(new Delivery(3150, "Yes", "DAT", "00:01", "11/24", "V", "Baelwood, IL", 371, "F",
					"Erie, PA", 422, "Sealy, TX", "", "", "53 ft", "43 klbs", "Coyote Logistics", "(773) 799 2118"));
			break;
		case 1:
			listDeliveries.add(new Delivery(1000, "No", "DAT", "00:02", "11/04", "V", "Baelwood, IL", 375, "F",
					"St Clair, MI", 423, "Orlando, FL", "", "", "41 ft", "17 klbs", "R&R Express", "(774) 7800 6344"));
			break;
		case 2:
			listDeliveries.add(new Delivery(2014, "Yes", "DAT", "00:06", "08/14", "V", "Baelwood, IL", 381, "F",
					"Erie, PA", 423, "Orlando, FL", "", "", "50 ft", "29 klbs", "Coyote Logistics", "(753) 123 4324"));
			break;
		}

		return new Response("OK");
	}

	@RequestMapping("/delete")
	public Response deleteDeliveries() {
		listDeliveries.clear();
		return new Response("OK");
	}

}
