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
 * Methods related to document
 */
public class Document {
	
	private SDKConfiguration sdkConfiguration;

	public Document(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get document details
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.GetDocumentDetailsResponse get(com.writer.sdk.models.operations.GetDocumentDetailsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.GetDocumentDetailsRequest.class, baseUrl, "/organization/{organizationId}/team/{teamId}/document/{documentId}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.GetDocumentDetailsResponse res = new com.writer.sdk.models.operations.GetDocumentDetailsResponse(contentType, httpRes.statusCode()) {{
            document = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.Document out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.Document.class);
                res.document = out;
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
     * List team documents
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.ListTeamDocumentsResponse list(com.writer.sdk.models.operations.ListTeamDocumentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.ListTeamDocumentsRequest.class, baseUrl, "/organization/{organizationId}/team/{teamId}/document", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.writer.sdk.utils.Utils.getQueryParams(com.writer.sdk.models.operations.ListTeamDocumentsRequest.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.ListTeamDocumentsResponse res = new com.writer.sdk.models.operations.ListTeamDocumentsResponse(contentType, httpRes.statusCode()) {{
            briefDocuments = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.BriefDocuments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.BriefDocuments.class);
                res.briefDocuments = out;
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