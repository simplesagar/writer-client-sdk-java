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
 * Methods related to Terminology
 */
public class Terminology implements
            MethodCallAddTerms,
            MethodCallDeleteTerms,
            MethodCallFindTerms,
            MethodCallUpdateTerms {

    private final SDKConfiguration sdkConfiguration;

    Terminology(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Add terms
     * @return The call builder
     */
    public com.writer.sdk.models.operations.AddTermsRequestBuilder add() {
        return new com.writer.sdk.models.operations.AddTermsRequestBuilder(this);
    }

    /**
     * Add terms
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.AddTermsResponse add(
            com.writer.sdk.models.operations.AddTermsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.AddTermsRequest.class,
                _baseUrl,
                "/terminology/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.writer.sdk.models.operations.AddTermsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "createTermsRequest", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("addTerms", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("addTerms", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("addTerms", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("addTerms", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.AddTermsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.AddTermsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.AddTermsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.shared.CreateTermsResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.shared.CreateTermsResponse>() {});
                _res.withCreateTermsResponse(java.util.Optional.ofNullable(_out));
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
     * Delete terms
     * @return The call builder
     */
    public com.writer.sdk.models.operations.DeleteTermsRequestBuilder delete() {
        return new com.writer.sdk.models.operations.DeleteTermsRequestBuilder(this);
    }

    /**
     * Delete terms
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.DeleteTermsResponse delete(
            com.writer.sdk.models.operations.DeleteTermsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.DeleteTermsRequest.class,
                _baseUrl,
                "/terminology/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.writer.sdk.models.operations.DeleteTermsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("deleteTerms", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("deleteTerms", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("deleteTerms", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("deleteTerms", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.DeleteTermsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.DeleteTermsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.DeleteTermsResponse _res = _resBuilder.build();
        
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
     * Find terms
     * @return The call builder
     */
    public com.writer.sdk.models.operations.FindTermsRequestBuilder find() {
        return new com.writer.sdk.models.operations.FindTermsRequestBuilder(this);
    }

    /**
     * Find terms
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.FindTermsResponse find(
            com.writer.sdk.models.operations.FindTermsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.FindTermsRequest.class,
                _baseUrl,
                "/terminology/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.writer.sdk.models.operations.FindTermsRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("findTerms", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("findTerms", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("findTerms", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("findTerms", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.FindTermsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.FindTermsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.FindTermsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.shared.PaginatedResultFullTermWithUser _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.shared.PaginatedResultFullTermWithUser>() {});
                _res.withPaginatedResultFullTermWithUser(java.util.Optional.ofNullable(_out));
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
     * Update terms
     * @return The call builder
     */
    public com.writer.sdk.models.operations.UpdateTermsRequestBuilder update() {
        return new com.writer.sdk.models.operations.UpdateTermsRequestBuilder(this);
    }

    /**
     * Update terms
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.writer.sdk.models.operations.UpdateTermsResponse update(
            com.writer.sdk.models.operations.UpdateTermsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.writer.sdk.models.operations.UpdateTermsRequest.class,
                _baseUrl,
                "/terminology/organization/{organizationId}/team/{teamId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<com.writer.sdk.models.operations.UpdateTermsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "updateTermsRequest", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
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
                  new BeforeRequestContextImpl("updateTerms", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "403", "404", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("updateTerms", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("updateTerms", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("updateTerms", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.writer.sdk.models.operations.UpdateTermsResponse.Builder _resBuilder = 
            com.writer.sdk.models.operations.UpdateTermsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.writer.sdk.models.operations.UpdateTermsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            _res.withHeaders(_httpRes.headers().map());
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.writer.sdk.models.shared.CreateTermsResponse _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.writer.sdk.models.shared.CreateTermsResponse>() {});
                _res.withCreateTermsResponse(java.util.Optional.ofNullable(_out));
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
