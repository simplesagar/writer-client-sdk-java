# User
(*user()*)

## Overview

Methods related to User

### Available Operations

* [list](#list) - List users

## list

List users

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.ListUsersQueryParamSortField;
import com.writer.sdk.models.operations.ListUsersQueryParamSortOrder;
import com.writer.sdk.models.operations.ListUsersRequest;
import com.writer.sdk.models.operations.ListUsersResponse;
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
                .organizationId(768578L)
                .build();

            ListUsersRequest req = ListUsersRequest.builder()
                .limit(99895L)
                .offset(547272L)
                .search("<value>")
                .sortField(ListUsersQueryParamSortField.NAME)
                .sortOrder(ListUsersQueryParamSortOrder.DESC)
                .build();

            ListUsersResponse res = sdk.user().list()
                .request(req)
                .call();

            if (res.paginatedResultUserPublicResponse().isPresent()) {
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
| `request`                                                                                        | [com.writer.sdk.models.operations.ListUsersRequest](../../models/operations/ListUsersRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[Optional<? extends com.writer.sdk.models.operations.ListUsersResponse>](../../models/operations/ListUsersResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
