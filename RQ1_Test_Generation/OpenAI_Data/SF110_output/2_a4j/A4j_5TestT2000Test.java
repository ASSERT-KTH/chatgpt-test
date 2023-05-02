// A4j_5Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_5Test {

		@Test
		void testAuthorSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.AuthorSearch("Ken Cochrane", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_6Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#DirectorSearch(String, String, String)} method.
*/
class A4j_6Test {
		
		@Test
		void testDirectorSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Ken Cochrane", "dvd", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_7Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ManufactureSearch(String, String, String)} method.
*/
class A4j_7Test {
		
		@Test
		void testManufactureSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Ken Cochrane", "electronics", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_8Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#UpcSearch(String, String, String)} method.
*/
class A4j_8Test {
		
		@Test
		void testUpcSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("Ken Cochrane", "music", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_9Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ListmaniaSearch(String)} method.
*/
class A4j_9Test {
		
		@Test
		void testListmaniaSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("Ken Cochrane");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_10Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#WishListSearch(String)} method.
*/
class A4j_10Test {
		
		@Test
		void testWishListSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.WishListSearch("Ken Cochrane");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "0");
				assertEquals(productInfo.getTotalPages(), "0");
				assertEquals(productInfo.getDetails().size(), 0);
		}
}

// A4j_11Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ThirdParty(String, String, String, String)} method.
*/
class A4j_11Test {
		
		@Test
		void testThirdParty() {
				A4j a4j = new A4j();
				SellerSearch sellerSearch = a4j.ThirdParty("Ken Cochrane", "heavy", "1", "open");
				assertNotNull(sellerSearch);
				assertEquals(sellerSearch.getTotalResults(), "0");
				assertEquals(