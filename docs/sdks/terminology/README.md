# Terminology
(*terminology()*)

## Overview

Methods related to Terminology

### Available Operations

* [add](#add) - Add terms
* [delete](#delete) - Delete terms
* [find](#find) - Find terms
* [update](#update) - Update terms

## add

Add terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.AddTermsRequest;
import com.writer.sdk.models.operations.AddTermsResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.ApprovedTermExtensionCreate;
import com.writer.sdk.models.shared.CreateTermsRequest;
import com.writer.sdk.models.shared.FailHandling;
import com.writer.sdk.models.shared.LinkedTermCreate;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.TermCreate;
import com.writer.sdk.models.shared.TermCreatePos;
import com.writer.sdk.models.shared.TermCreateType;
import com.writer.sdk.models.shared.TermExampleCreate;
import com.writer.sdk.models.shared.TermExampleCreateType;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePos;
import com.writer.sdk.models.shared.TermTagCreate;
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
                .organizationId(551477L)
                .build();

            AddTermsRequest req = AddTermsRequest.builder()
                .createTermsRequest(CreateTermsRequest.builder()
                        .failHandling(FailHandling.VALIDATE_ONLY)
                        .models(java.util.List.of(
                            TermCreate.builder()
                                .caseSensitive(false)
                                .term("<value>")
                                .type(TermCreateType.BANNED)
                                .build()))
                        .build())
                .teamId(822001L)
                .build();

            AddTermsResponse res = sdk.terminology().add()
                .request(req)
                .call();

            if (res.createTermsResponse().isPresent()) {
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

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [com.writer.sdk.models.operations.AddTermsRequest](../../models/operations/AddTermsRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[Optional<? extends com.writer.sdk.models.operations.AddTermsResponse>](../../models/operations/AddTermsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## delete

Delete terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.DeleteTermsRequest;
import com.writer.sdk.models.operations.DeleteTermsResponse;
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
                .organizationId(545907L)
                .build();

            DeleteTermsRequest req = DeleteTermsRequest.builder()
                .teamId(841399L)
                .xRequestID("<value>")
                .ids(java.util.List.of(
                    698486L))
                .build();

            DeleteTermsResponse res = sdk.terminology().delete()
                .request(req)
                .call();

            if (res.deleteResponse().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.writer.sdk.models.operations.DeleteTermsRequest](../../models/operations/DeleteTermsRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends com.writer.sdk.models.operations.DeleteTermsResponse>](../../models/operations/DeleteTermsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## find

Find terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.FindTermsRequest;
import com.writer.sdk.models.operations.FindTermsResponse;
import com.writer.sdk.models.operations.PartOfSpeech;
import com.writer.sdk.models.operations.QueryParamSortField;
import com.writer.sdk.models.operations.QueryParamSortOrder;
import com.writer.sdk.models.operations.Type;
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
                .organizationId(40141L)
                .build();

            FindTermsRequest req = FindTermsRequest.builder()
                .teamId(326883L)
                .limit(488098L)
                .offset(949900L)
                .partOfSpeech(PartOfSpeech.ADJECTIVE)
                .sortField(QueryParamSortField.TERM)
                .sortOrder(QueryParamSortOrder.ASC)
                .tags(java.util.List.of(
                    "<value>"))
                .term("<value>")
                .type(Type.PENDING)
                .build();

            FindTermsResponse res = sdk.terminology().find()
                .request(req)
                .call();

            if (res.paginatedResultFullTermWithUser().isPresent()) {
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [com.writer.sdk.models.operations.FindTermsRequest](../../models/operations/FindTermsRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[Optional<? extends com.writer.sdk.models.operations.FindTermsResponse>](../../models/operations/FindTermsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## update

Update terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.UpdateTermsRequest;
import com.writer.sdk.models.operations.UpdateTermsResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.ApprovedTermExtensionCreate;
import com.writer.sdk.models.shared.LinkedTermCreate;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.TermExampleCreate;
import com.writer.sdk.models.shared.TermExampleCreateType;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePos;
import com.writer.sdk.models.shared.TermTagCreate;
import com.writer.sdk.models.shared.TermUpdate;
import com.writer.sdk.models.shared.TermUpdatePos;
import com.writer.sdk.models.shared.TermUpdateType;
import com.writer.sdk.models.shared.UpdateTermsRequest;
import com.writer.sdk.models.shared.UpdateTermsRequestFailHandling;
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
                .organizationId(857478L)
                .build();

            UpdateTermsRequest req = UpdateTermsRequest.builder()
                .updateTermsRequest(UpdateTermsRequest.builder()
                        .failHandling(UpdateTermsRequestFailHandling.ACCUMULATE)
                        .models(java.util.List.of(
                            TermUpdate.builder()
                                .caseSensitive(false)
                                .id(344620L)
                                .term("<value>")
                                .type(TermUpdateType.PENDING)
                                .build()))
                        .build())
                .teamId(991464L)
                .xRequestID("<value>")
                .build();

            UpdateTermsResponse res = sdk.terminology().update()
                .request(req)
                .call();

            if (res.createTermsResponse().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.writer.sdk.models.operations.UpdateTermsRequest](../../models/operations/UpdateTermsRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends com.writer.sdk.models.operations.UpdateTermsResponse>](../../models/operations/UpdateTermsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
