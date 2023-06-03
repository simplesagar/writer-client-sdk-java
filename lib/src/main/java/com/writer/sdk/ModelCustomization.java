/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.writer.sdk.utils.HTTPClient;
import com.writer.sdk.utils.HTTPRequest;
import com.writer.sdk.utils.JSON;
import com.writer.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Methods related to Model Customization
 */
public class ModelCustomization {
	
	private SDKConfiguration sdkConfiguration;

	public ModelCustomization(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create model customization
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.CreateModelCustomizationResponse create(com.writer.sdk.models.operations.CreateModelCustomizationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.CreateModelCustomizationRequest.class, baseUrl, "/llm/organization/{organizationId}/model/{modelId}/customization", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.writer.sdk.utils.Utils.serializeRequestBody(request, "createCustomizationRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.CreateModelCustomizationResponse res = new com.writer.sdk.models.operations.CreateModelCustomizationResponse(contentType, httpRes.statusCode()) {{
            modelCustomization = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.ModelCustomization out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.ModelCustomization.class);
                res.modelCustomization = out;
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
     * Delete Model customization
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.DeleteModelCustomizationResponse delete(com.writer.sdk.models.operations.DeleteModelCustomizationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.DeleteModelCustomizationRequest.class, baseUrl, "/llm/organization/{organizationId}/model/{modelId}/customization/{customizationId}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.DeleteModelCustomizationResponse res = new com.writer.sdk.models.operations.DeleteModelCustomizationResponse(contentType, httpRes.statusCode()) {{
            deleteModelCustomization200ApplicationJSONObject = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, Object>>() {});
                res.deleteModelCustomization200ApplicationJSONObject = out;
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
     * Get model customization
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.GetModelCustomizationResponse get(com.writer.sdk.models.operations.GetModelCustomizationRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.GetModelCustomizationRequest.class, baseUrl, "/llm/organization/{organizationId}/model/{modelId}/customization/{customizationId}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.GetModelCustomizationResponse res = new com.writer.sdk.models.operations.GetModelCustomizationResponse(contentType, httpRes.statusCode()) {{
            modelCustomization = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.ModelCustomization out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.ModelCustomization.class);
                res.modelCustomization = out;
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
     * List model customizations
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.ListModelCustomizationsResponse list(com.writer.sdk.models.operations.ListModelCustomizationsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(com.writer.sdk.models.operations.ListModelCustomizationsRequest.class, baseUrl, "/llm/organization/{organizationId}/model/{modelId}/customization", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.ListModelCustomizationsResponse res = new com.writer.sdk.models.operations.ListModelCustomizationsResponse(contentType, httpRes.statusCode()) {{
            customizationsResponse = null;
            failResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.CustomizationsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.CustomizationsResponse.class);
                res.customizationsResponse = out;
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