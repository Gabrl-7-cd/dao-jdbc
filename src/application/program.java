package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		//Department dp = new Department(1, "books");
		//Seller seller = new Seller(12, "Carl", "carl@email.com", new Date(), 1519.50, dp);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		//System.out.println(dp);
		System.out.println(seller);
	}

}
