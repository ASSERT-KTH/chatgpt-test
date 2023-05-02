// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_4Test {

		@Test
		void testArtistSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "1");
				assertEquals(productInfo.getTotalPages(), "1");
				assertEquals(productInfo.getMode(), "music");
				assertEquals(productInfo.getTag(), "webservices-20");
				assertEquals(productInfo.getType(), "lite");
				assertEquals(productInfo.getDevtag(), "A4J9BJ3T9CMF5A");
				assertEquals(productInfo.getItem().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getProductName(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getCatalog(), "Music");
				assertEquals(productInfo.getItem().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getItem().get(0).getReleaseDate(), "1993-03-22");
				assertEquals(productInfo.getItem().get(0).getListPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getListPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getListPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getAmount(), "1.99");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getFormattedPrice(), "$1.99");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getAmount(), "3.99");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getFormattedPrice(), "$3.99");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getAmount(), "11.99");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getFormattedPrice(), "$11.99");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getImageUrlSmall(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.THUMBZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getImageUrlMedium(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.MZZZZZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getImageUrlLarge(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getCustomerReviewUrl(), "http://www.amazon.com/review/product/B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(0).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(0).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getProductGroup(), "Music");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getProductTypeName(), "MUSIC_TRACKS");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getAuthor(), "The Beatles");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getReleaseDate(), "1993-03-22");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getManufacturer(), "Capitol");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getListPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getListPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getListPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getOurPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getOurPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getOurPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getUsedPrice().getAmount(), "1.99");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getUsedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getUsedPrice().getFormattedPrice(), "$1.99");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getCollectiblePrice().getAmount(), "3.99");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getCollectiblePrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getCollectiblePrice().getFormattedPrice(), "$