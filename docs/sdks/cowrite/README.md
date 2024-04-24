# CoWrite
(*coWrite()*)

## Overview

Methods related to CoWrite

### Available Operations

* [generateContent](#generatecontent) - Generate content using predefined templates
* [listTemplates](#listtemplates) - Get a list of your existing CoWrite templates

## generateContent

Generate content using predefined templates

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.GenerateContentRequest;
import com.writer.sdk.models.operations.GenerateContentResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.GenerateTemplateRequest;
import com.writer.sdk.models.shared.MagicRequestInput;
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
                .organizationId(569932L)
                .build();

            GenerateContentRequest req = GenerateContentRequest.builder()
                .generateTemplateRequest(GenerateTemplateRequest.builder()
                        .templateId("<value>")
                        .inputs(java.util.List.of(
                            MagicRequestInput.builder()
                                .name("<value>")
                                .build()))
                        .build())
                .teamId(888452L)
                .build();

            GenerateContentResponse res = sdk.coWrite().generateContent()
                .request(req)
                .call();

            if (res.draft().isPresent()) {
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.writer.sdk.models.operations.GenerateContentRequest](../../models/operations/GenerateContentRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends com.writer.sdk.models.operations.GenerateContentResponse>](../../models/operations/GenerateContentResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## listTemplates

Get a list of your existing CoWrite templates

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.ListTemplatesRequest;
import com.writer.sdk.models.operations.ListTemplatesResponse;
import com.writer.sdk.models.shared.*;
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
                .organizationId(380445L)
                .build();

            ListTemplatesRequest req = ListTemplatesRequest.builder()
                .teamId(882866L)
                .templateId("<value>")
                .build();

            ListTemplatesResponse res = sdk.coWrite().listTemplates()
                .request(req)
                .call();

            if (res.templateDetailsResponse().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [com.writer.sdk.models.operations.ListTemplatesRequest](../../models/operations/ListTemplatesRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends com.writer.sdk.models.operations.ListTemplatesResponse>](../../models/operations/ListTemplatesResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
