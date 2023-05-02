// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_3Test {

		@Test
		void testActorSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "1");
				assertEquals(productInfo.getTotalPages(), "1");
				assertEquals(productInfo.getDetails().get(0).getAsin(), "B00005JLZ1");
				assertEquals(productInfo.getDetails().get(0).getProductName(), "The Green Mile");
				assertEquals(productInfo.getDetails().get(0).getCatalog(), "DVD");
				assertEquals(productInfo.getDetails().get(0).getReleaseDate(), "1999-11-23");
				assertEquals(productInfo.getDetails().get(0).getManufacturer(), "Warner Home Video");
				assertEquals(productInfo.getDetails().get(0).getImageUrlSmall(), "http://images.amazon.com/images/P/B00005JLZ1.01.THUMBZZZ.jpg");
				assertEquals(productInfo.getDetails().get(0).getImageUrlMedium(), "http://images.amazon.com/images/P/B00005JLZ1.01.MZZZZZZZ.jpg");
				assertEquals(productInfo.getDetails().get(0).getImageUrlLarge(), "http://images.amazon.com/images/P/B00005JLZ1.01.LZZZZZZZ.jpg");
				assertEquals(productInfo.getDetails().get(0).getListPrice(), "19.98");
				assertEquals(productInfo.getDetails().get(0).getOurPrice(), "14.99");
				assertEquals(productInfo.getDetails().get(0).getUsedPrice(), "9.99");
				assertEquals(productInfo.getDetails().get(0).getAvailability(), "Usually ships in 24 hours");
				assertEquals(productInfo.getDetails().get(0).getCustomerReview(), "http://www.amazon.com/exec/obidos/tg/cm/member-reviews/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getEditorialReview(), "http://www.amazon.com/exec/obidos/tg/cm/excerpt/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getSimilarProduct(), "http://www.amazon.com/exec/obidos/tg/sim-explorer/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getTracks(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getListmania(), "http://www.amazon.com/exec/obidos/tg/listmania/list/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getWishlist(), "http://www.amazon.com/exec/obidos/wishlist/add-item/-/B00005JLZ1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllNew(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_1/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllUsed(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_2/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllCollectible(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_3/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllRefurbished(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_4/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllThirdPartyNew(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_5/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllThirdPartyUsed(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_6/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllThirdPartyCollectible(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_7/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllThirdPartyRefurbished(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_8/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllOffer(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_9/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllOffer(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_9/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllOffer(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_9/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).getAllOffer(), "http://www.amazon.com/exec/obidos/tg/browse/-/B00005JLZ1/002-9087463-9087461/ref=pd_ts_d_9/002-9087463-9087461");
				assertEquals(productInfo.getDetails().get(0).get