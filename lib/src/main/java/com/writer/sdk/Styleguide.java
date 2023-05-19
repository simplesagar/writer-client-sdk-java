/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.writer.sdk.utils.HTTPClient;
import com.writer.sdk.utils.HTTPRequest;
import com.writer.sdk.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

/**
 * Methods related to Styleguide
 */
public class Styleguide {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;
	java.util.Map<String, java.util.Map<String, java.util.Map<String, Object>>> _globals;

	public Styleguide(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion, java.util.Map<String, java.util.Map<String, java.util.Map<String, Object>>> globals) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
		this._globals = globals;
	}

    /**
     * Page details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.PageDetailsResponse get(com.writer.sdk.models.operations.PageDetailsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.PageDetailsRequest.class, baseUrl, "/styleguide/page/{pageId}", request, this._globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.PageDetailsResponse res = new com.writer.sdk.models.operations.PageDetailsResponse(contentType, httpRes.statusCode()) {{
            pageWithSectionResponse = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.PageWithSectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.PageWithSectionResponse.class);
                res.pageWithSectionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }

        return res;
    }

    /**
     * List your styleguide pages
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.ListPagesResponse listPages(com.writer.sdk.models.operations.ListPagesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(baseUrl, "/styleguide/page");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = com.writer.sdk.utils.Utils.getQueryParams(com.writer.sdk.models.operations.ListPagesRequest.class, request, this._globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.ListPagesResponse res = new com.writer.sdk.models.operations.ListPagesResponse(contentType, httpRes.statusCode()) {{
            paginatedResultPagePublicApiResponse = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.PaginatedResultPagePublicApiResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.PaginatedResultPagePublicApiResponse.class);
                res.paginatedResultPagePublicApiResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }

        return res;
    }
}