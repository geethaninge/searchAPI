package org.itune;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.itune.model.ItuneSearchResponse;

/**
 * @author Geetha Gowda
 * @date 04/29/2017
 **/

public class ItuneSearchClient {

	public ItuneSearchResponse search(String parameterkeyvalue) {
		// Note its closable htttp client,which is-a AutoClosable
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {
			HttpGet getRequest = new HttpGet("https://itunes.apple.com/search?" + parameterkeyvalue);
			HttpResponse httpResponse = httpClient.execute(getRequest);
			HttpEntity entity = httpResponse.getEntity();
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(EntityUtils.toString(entity), ItuneSearchResponse.class);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
}
