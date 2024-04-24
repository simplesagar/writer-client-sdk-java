# Completions
(*completions()*)

## Overview

Methods related to Completions

### Available Operations

* [create](#create) - Create completion for LLM model
* [createModelCustomizationCompletion](#createmodelcustomizationcompletion) - Create completion for LLM customization model

## create

Create completion for LLM model

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.CreateCompletionRequest;
import com.writer.sdk.models.operations.CreateCompletionResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.CompletionRequest;
import com.writer.sdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .organizationId(486589L)
                .build();

            CreateCompletionRequest req = CreateCompletionRequest.builder()
                .completionRequest(CompletionRequest.builder()
                        .prompt("<value>")
                        .bestOf(1L)
                        .frequencyPenalty(4893.82d)
                        .logprobs(638424L)
                        .maxTokens(1024L)
                        .minTokens(1L)
                        .n(859213L)
                        .presencePenalty(4174.58d)
                        .stop(java.util.List.of(
                            "the",
                            "is",
                            "and"))
                        .temperature(0.7d)
                        .topP(1d)
                        .build())
                .modelId("<value>")
                .build();

            CreateCompletionResponse res = sdk.completions().create()
                .request(req)
                .call();

            if (res.completionResponse().isPresent()) {
                // handle response
            }
        } catch (com.writer.sdk.models.errors.FailResponse e) {
            // handle exception
        } catch (com.writer.sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.writer.sdk.models.operations.CreateCompletionRequest](../../models/operations/CreateCompletionRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[Optional<? extends com.writer.sdk.models.operations.CreateCompletionResponse>](../../models/operations/CreateCompletionResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## createModelCustomizationCompletion

Create completion for LLM customization model

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.CreateModelCustomizationCompletionRequest;
import com.writer.sdk.models.operations.CreateModelCustomizationCompletionResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.CompletionRequest;
import com.writer.sdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
                .organizationId(919503L)
                .build();

            CreateModelCustomizationCompletionRequest req = CreateModelCustomizationCompletionRequest.builder()
                .completionRequest(CompletionRequest.builder()
                        .prompt("<value>")
                        .bestOf(1L)
                        .frequencyPenalty(412.97d)
                        .logprobs(951257L)
                        .maxTokens(1024L)
                        .minTokens(1L)
                        .n(314952L)
                        .presencePenalty(657.2d)
                        .stop(java.util.List.of(
                            "the",
                            "is",
                            "and"))
                        .temperature(0.7d)
                        .topP(1d)
                        .build())
                .customizationId("<value>")
                .modelId("<value>")
                .build();

            CreateModelCustomizationCompletionResponse res = sdk.completions().createModelCustomizationCompletion()
                .request(req)
                .call();

            if (res.completionResponse().isPresent()) {
                // handle response
            }
        } catch (com.writer.sdk.models.errors.FailResponse e) {
            // handle exception
        } catch (com.writer.sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.writer.sdk.models.operations.CreateModelCustomizationCompletionRequest](../../models/operations/CreateModelCustomizationCompletionRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends com.writer.sdk.models.operations.CreateModelCustomizationCompletionResponse>](../../models/operations/CreateModelCustomizationCompletionResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
