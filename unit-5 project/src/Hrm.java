import java.util.Scanner;

import com.project5.UseCaseAdmin.BuyerList;
import com.project5.UseCaseAdmin.SellerLists;
import com.project5.UseCaseBuyer.ItemsByCate;
import com.project5.UseCaseBuyer.RegisterBuyer;
import com.project5.bean.SellerList;
import com.project5UseCaseSeller.ListProducts;
import com.project5UseCaseSeller.RegisterSeller;
import com.project5UseCaseSeller.RemoveItem;
import com.project5UseCaseSeller.UpdateListItems;

public class Hrm {
	
	public static void selectOption() {

		System.out.println("\nPlease select an option to continue:-");
		System.out.println("\n1. Login as admin\n2. Login as seller\n3. Login as buyer");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter the login_id");
		int login_id = sc.nextInt();

		System.out.println("Enter the password");
		int password = sc.nextInt();

		if (login_id == 1111 && password == 2222) {
			switch (choice) {

			// switch case one
			case 1:
				System.out.println("\n1. View the registered buyer list.(W)\n" + "2. View the registered Seller list.(W)\n"
						+ "3. View the daily dispute report.\n" + "4. View the daily selling report\n"
						+ "5. Solve the dispute report.");
				// innerswitch
				int subchoice = sc.nextInt();

				switch (subchoice) {
				case 1:
					BuyerList b1 = new BuyerList();
					b1.main(null);
					break;
				case 2:
					SellerLists sl1 = new SellerLists();
					sl1.main(null);
					break;

				}
				break;

			// switch case two
			case 2:
				System.out.println(
						"\n1. Register himself or herself as seller.(W)\n" + "2. Create list of items to sell.(W)\n"
								+ "3. Update Item price, quantity, etc.(W)\n" + "4. Add new Item in the list.(W)\n"
								+ "5. Remove items from the list.(W)\n" + "6. View the sold Item history.");
				// innerswitch
				int subchoice2 = sc.nextInt();
				switch (subchoice2) {
				case 1:
					RegisterSeller r1 = new RegisterSeller();
					r1.main(null);
					break;
				case 2:
					ListProducts l1 = new ListProducts();
					l1.main(null);
					break;
				case 3:
					UpdateListItems u1 = new UpdateListItems();
					u1.main(null);
					break;
				case 4:
					ListProducts l2 = new ListProducts();
					l2.main(null);
					break;
				case 5:
					RemoveItem ri1 = new RemoveItem();
					ri1.main(null);
					break;
				case 6:
					System.out.println("Method not found");
					break;
				default:
				}

				break;

			// switch case three
			case 3:
				System.out.println(
						"\n1. Register himself or herself as Buyer.(W)\n" + "2. Search and view Items by category.(W)\n"
								+ "3. Select and view all the buyers and also their Items category wise.\n"
								+ "D. Selects Items to buy.\n");
				// inner switch
				int subchoice3 = sc.nextInt();
				switch (subchoice3) {
				case 1:
					RegisterBuyer rb1 = new RegisterBuyer();
					rb1.main(null);
					break;
				case 2:
					ItemsByCate ic1 = new ItemsByCate();
					ic1.main(null);
					break;
				}

				break;
			default:
			}

		} else {
			System.out.println("Wrong credentials");
			Hrm.selectOption();

		}

	}

}
