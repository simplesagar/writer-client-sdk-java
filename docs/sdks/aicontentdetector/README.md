# AIContentDetector
(*aiContentDetector()*)

## Overview

Methods related to AI Content Detector

### Available Operations

* [detect](#detect) - Content detector api

## detect

Content detector api

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.DetectContentRequest;
import com.writer.sdk.models.operations.DetectContentResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.ContentDetectorRequest;
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
                .organizationId(496531L)
                .build();

            DetectContentRequest req = DetectContentRequest.builder()
                .contentDetectorRequest(ContentDetectorRequest.builder()
                        .input("<value>")
                        .build())
                .build();

            DetectContentResponse res = sdk.aiContentDetector().detect()
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [com.writer.sdk.models.operations.DetectContentRequest](../../models/operations/DetectContentRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends com.writer.sdk.models.operations.DetectContentResponse>](../../models/operations/DetectContentResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
