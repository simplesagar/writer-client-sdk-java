/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.writer.sdk.models.errors.SDKError;
import com.writer.sdk.utils.LazySingletonValue;
import com.writer.sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateModelCustomizationRequestBuilder {

    private CreateModelCustomizationRequest request;
    private final SDKMethodInterfaces.MethodCallCreateModelCustomization sdk;

    public CreateModelCustomizationRequestBuilder(SDKMethodInterfaces.MethodCallCreateModelCustomization sdk) {
        this.sdk = sdk;
    }

    public CreateModelCustomizationRequestBuilder request(CreateModelCustomizationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateModelCustomizationResponse call() throws Exception {

        return sdk.create(
            request);
    }
}