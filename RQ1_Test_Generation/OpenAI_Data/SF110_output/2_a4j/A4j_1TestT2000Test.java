// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_1Test {

		/**
		* Test case for the {@link A4j#BlendedSearch(String, String)} method.
		*/
		@Test
		void testBlendedSearch() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
				assertNotNull(blendedSearch);
				assertNotNull(blendedSearch.getRequest());
				assertNotNull(blendedSearch.getRequest().getIsValid());
				assertTrue(blendedSearch.getRequest().getIsValid());
				assertNotNull(blendedSearch.getRequest().getKeywords());
				assertEquals("java", blendedSearch.getRequest().getKeywords());
				assertNotNull(blendedSearch.getRequest().getPage());
				assertEquals("1", blendedSearch.getRequest().getPage());
				assertNotNull(blendedSearch.getRequest().getMode());
				assertEquals("blended", blendedSearch.getRequest().getMode());
				assertNotNull(blendedSearch.getRequest().getTag());
				assertEquals("webservices-20", blendedSearch.getRequest().getTag());
				assertNotNull(blendedSearch.getRequest().getType());
				assertEquals("lite", blendedSearch.getRequest().getType());
				assertNotNull(blendedSearch.getRequest().getDevtag());
				assertEquals("A4J0R2W15KXBZ", blendedSearch.getRequest().getDevtag());
				assertNotNull(blendedSearch.getRequest().getSort());
				assertEquals("+salesrank", blendedSearch.getRequest().getSort());
				assertNotNull(blendedSearch.getTotalResults());
				assertEquals("1", blendedSearch.getTotalResults());
				assertNotNull(blendedSearch.getTotalPages());
				assertEquals("1", blendedSearch.getTotalPages());
				assertNotNull(blendedSearch.getDetails());
				assertNotNull(blendedSearch.getDetails().getProductName());
				assertEquals("Java: A Beginner's Guide, Fifth Edition", blendedSearch.getDetails().getProductName());
				assertNotNull(blendedSearch.getDetails().getCatalog());
				assertEquals("Book", blendedSearch.getDetails().getCatalog());
				assertNotNull(blendedSearch.getDetails().getAuthors());
				assertEquals("Herbert Schildt", blendedSearch.getDetails().getAuthors());
				assertNotNull(blendedSearch.getDetails().getManufacturer());
				assertEquals("McGraw-Hill Osborne Media", blendedSearch.getDetails().getManufacturer());
				assertNotNull(blendedSearch.getDetails().getProductGroup());
				assertEquals("Book", blendedSearch.getDetails().getProductGroup());
				assertNotNull(blendedSearch.getDetails().getListPrice());
				assertEquals("$39.99", blendedSearch.getDetails().getListPrice());
				assertNotNull(blendedSearch.getDetails().getOurPrice());
				assertEquals("$25.19", blendedSearch.getDetails().getOurPrice());
				assertNotNull(blendedSearch.getDetails().getUsedPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getUsedPrice());
				assertNotNull(blendedSearch.getDetails().getCollectiblePrice());
				assertEquals("$0.01", blendedSearch.getDetails().getCollectiblePrice());
				assertNotNull(blendedSearch.getDetails().getRefurbishedPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getRefurbishedPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyNewPrice());
				assertEquals("$0.01", blendedSearch.getDetails().getThirdPartyNewPrice());
				assertNotNull(blendedSearch.getDetails().getImageUrlSmall());
				assertEquals("http://images.amazon.com/images/P/0072263838.01.THUMBZZZ.jpg", blendedSearch.getDetails().getImageUrlSmall());
				assertNotNull(blendedSearch.getDetails().getImageUrlMedium());
				assertEquals("http://images.amazon.com/images/P/0072263838.01.MZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlMedium());
				assertNotNull(blendedSearch.getDetails().getImageUrlLarge());
				assertEquals("http://images.amazon.com/images/P/0072263838.01.LZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlLarge());
				assertNotNull(blendedSearch.getDetails().getCustomerReviewAverage());
				assertEquals("4.5", blendedSearch.getDetails().getCustomerReviewAverage());
				assertNotNull(blendedSearch.getDetails().getCustomerReviewCount());
				assertEquals("2", blendedSearch.getDetails().getCustomerReviewCount());
				assertNotNull(blendedSearch.getDetails().getAvailability());
				assertEquals("Usually ships within 24 hours", blendedSearch.getDetails().getAvailability());
				assertNotNull(blendedSearch.getDetails().getAvailabilityType());
				assertEquals("now", blendedSearch.getDetails().getAvailabilityType());
				assertNotNull(blendedSearch.getDetails().getAsin());
				assertEquals("0072263838", blendedSearch.getDetails().getAsin());
				assertNotNull(blendedSearch.getDetails().getSalesRank());
				assertEquals("1", blendedSearch.getDetails().getSalesRank());
				assertNotNull(blendedSearch.getDetails().getReleaseDate());
				assertEquals("2003-05-01", blendedSearch.getDetails().getReleaseDate());
				assertNotNull(blendedSearch.getDetails().getProductUrl());
				assertEquals("http://www.amazon.com/exec/obidos/ASIN/0072263838/webservices-20", blendedSearch.getDetails().getProductUrl());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(0));
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(0).getAsin());
				assertEquals("0672325671", blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(0).getAsin());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(0).getTitle());
				assertEquals("Java 2: A Beginner's Guide", blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(0).getTitle());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(1));
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(1).getAsin());
				assertEquals("0672325671", blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(1).getAsin());
				assertNotNull(blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(1).getTitle());
				assertEquals("Java 2: A Beginner's Guide", blendedSearch.getDetails().getSimilarProducts().getSimilarProduct().get(1).getTitle());
				assertNotNull(blendedSearch