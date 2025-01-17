/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.writer.sdk.models.errors.SDKError;
import com.writer.sdk.models.operations.SDKMethodInterfaces.*;
import com.writer.sdk.utils.HTTPClient;
import com.writer.sdk.utils.HTTPRequest;
import com.writer.sdk.utils.Hook.AfterErrorContextImpl;
import com.writer.sdk.utils.Hook.AfterSuccessContextImpl;
import com.writer.sdk.utils.Hook.BeforeRequestContextImpl;
import com.writer.sdk.utils.JSON;
import com.writer.sdk.utils.Retries.NonRetryableException;
import com.writer.sdk.utils.SerializedBody;
import com.writer.sdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Methods related to Snippets
 */
public class Snippet implements
            MethodCallDeleteSnippets,
            MethodCallFindSnippets,
            MethodCallUpdateSnippets {

    private final SDKConfiguration sdkConfiguration;

    Snippet(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Delete snippets
     * @return The call builder
     */
    public com.writer.sdk.models.operations.DeleteSnippetsRequestBuilder delete() {
        return new com.writer.sdk.models.operations.DeleteSnippetsRequestBuilder(this);
    }

    /**
     * Delete snippets
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.DeleteSnippetsResponse delete(
            com.writer.sdk.models.operations.DeleteSnippetsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.DeleteSnippetsRequest.class,
                _baseUrl,
                "/snippet/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.writer.sdk.models.operations.DeleteSnippetsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("deleteSnippets", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("deleteSnippets", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("deleteSnippets", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("deleteSnippets", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.DeleteSnippetsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.DeleteSnippetsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.DeleteSnippetsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.shared.DeleteResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.shared.DeleteResponse>() {});
                _res.withDeleteResponse(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "500")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.errors.FailResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.errors.FailResponse>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Find snippets
     * @return The call builder
     */
    public com.writer.sdk.models.operations.FindSnippetsRequestBuilder find() {
        return new com.writer.sdk.models.operations.FindSnippetsRequestBuilder(this);
    }

    /**
     * Find snippets
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.FindSnippetsResponse find(
            com.writer.sdk.models.operations.FindSnippetsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.FindSnippetsRequest.class,
                _baseUrl,
                "/snippet/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.writer.sdk.models.operations.FindSnippetsRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("findSnippets", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("findSnippets", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("findSnippets", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("findSnippets", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.FindSnippetsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.FindSnippetsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.FindSnippetsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.shared.PaginatedResultSnippetWithUser _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.shared.PaginatedResultSnippetWithUser>() {});
                _res.withPaginatedResultSnippetWithUser(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "500")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.errors.FailResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.errors.FailResponse>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Update snippets
     * @return The call builder
     */
    public com.writer.sdk.models.operations.UpdateSnippetsRequestBuilder update() {
        return new com.writer.sdk.models.operations.UpdateSnippetsRequestBuilder(this);
    }

    /**
     * Update snippets
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.UpdateSnippetsResponse update(
            com.writer.sdk.models.operations.UpdateSnippetsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.UpdateSnippetsRequest.class,
                _baseUrl,
                "/snippet/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.writer.sdk.models.operations.UpdateSnippetsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("updateSnippets", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("updateSnippets", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("updateSnippets", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("updateSnippets", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.UpdateSnippetsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.UpdateSnippetsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.UpdateSnippetsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                java.util.List<com.writer.sdk.models.shared.SnippetWithUser> _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<com.writer.sdk.models.shared.SnippetWithUser>>() {});
                _res.withClasses(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "500")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.errors.FailResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.errors.FailResponse>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
