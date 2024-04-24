# Snippet
(*snippet()*)

## Overview

Methods related to Snippets

### Available Operations

* [delete](#delete) - Delete snippets
* [find](#find) - Find snippets
* [update](#update) - Update snippets

## delete

Delete snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.DeleteSnippetsRequest;
import com.writer.sdk.models.operations.DeleteSnippetsResponse;
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

            DeleteSnippetsRequest req = DeleteSnippetsRequest.builder()
                .teamId(841399L)
                .xRequestID("<value>")
                .ids(java.util.List.of(
                    "<value>"))
                .build();

            DeleteSnippetsResponse res = sdk.snippet().delete()
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.writer.sdk.models.operations.DeleteSnippetsRequest](../../models/operations/DeleteSnippetsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.writer.sdk.models.operations.DeleteSnippetsResponse>](../../models/operations/DeleteSnippetsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## find

Find snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.FindSnippetsRequest;
import com.writer.sdk.models.operations.FindSnippetsResponse;
import com.writer.sdk.models.operations.SortField;
import com.writer.sdk.models.operations.SortOrder;
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

            FindSnippetsRequest req = FindSnippetsRequest.builder()
                .teamId(326883L)
                .limit(488098L)
                .offset(949900L)
                .search("<value>")
                .shortcuts(java.util.List.of(
                    "<value>"))
                .sortField(SortField.MODIFICATION_TIME)
                .sortOrder(SortOrder.ASC)
                .tags(java.util.List.of(
                    "<value>"))
                .build();

            FindSnippetsResponse res = sdk.snippet().find()
                .request(req)
                .call();

            if (res.paginatedResultSnippetWithUser().isPresent()) {
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [com.writer.sdk.models.operations.FindSnippetsRequest](../../models/operations/FindSnippetsRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Optional<? extends com.writer.sdk.models.operations.FindSnippetsResponse>](../../models/operations/FindSnippetsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## update

Update snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.UpdateSnippetsRequest;
import com.writer.sdk.models.operations.UpdateSnippetsResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.SnippetTagV2;
import com.writer.sdk.models.shared.SnippetUpdate;
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

            UpdateSnippetsRequest req = UpdateSnippetsRequest.builder()
                .teamId(24555L)
                .requestBody(java.util.List.of(
                    SnippetUpdate.builder()
                        .id("<value>")
                        .snippet("<value>")
                        .build()))
                .xRequestID("<value>")
                .build();

            UpdateSnippetsResponse res = sdk.snippet().update()
                .request(req)
                .call();

            if (res.classes().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.writer.sdk.models.operations.UpdateSnippetsRequest](../../models/operations/UpdateSnippetsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.writer.sdk.models.operations.UpdateSnippetsResponse>](../../models/operations/UpdateSnippetsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
