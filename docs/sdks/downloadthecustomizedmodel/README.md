# DownloadTheCustomizedModel
(*downloadTheCustomizedModel()*)

## Overview

Methods related to Download the customized model

### Available Operations

* [fetchFile](#fetchfile) - Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

## fetchFile

Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.FetchCustomizedModelFileRequest;
import com.writer.sdk.models.operations.FetchCustomizedModelFileResponse;
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
                .organizationId(501762L)
                .build();

            FetchCustomizedModelFileRequest req = FetchCustomizedModelFileRequest.builder()
                .customizationId("<value>")
                .modelId("<value>")
                .build();

            FetchCustomizedModelFileResponse res = sdk.downloadTheCustomizedModel().fetchFile()
                .request(req)
                .call();

            if (res.stream().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.writer.sdk.models.operations.FetchCustomizedModelFileRequest](../../models/operations/FetchCustomizedModelFileRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.writer.sdk.models.operations.FetchCustomizedModelFileResponse>](../../models/operations/FetchCustomizedModelFileResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
