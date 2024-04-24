# ModelCustomization
(*modelCustomization()*)

## Overview

Methods related to Model Customization

### Available Operations

* [create](#create) - Create model customization
* [delete](#delete) - Delete Model customization
* [get](#get) - Get model customization
* [list](#list) - List model customizations

## create

Create model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.CreateModelCustomizationRequest;
import com.writer.sdk.models.operations.CreateModelCustomizationResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.CreateCustomizationRequest;
import com.writer.sdk.models.shared.HyperParameters;
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

            CreateModelCustomizationRequest req = CreateModelCustomizationRequest.builder()
                .createCustomizationRequest(CreateCustomizationRequest.builder()
                        .name("<value>")
                        .trainingDatasetFileId("<value>")
                        .additionalHyperParameters(HyperParameters.builder()
                            .numVirtualTokens(489382L)
                            .build())
                        .batchSize(638424L)
                        .description("Synchronised full-range emulation")
                        .epochs(134365L)
                        .learningRate(7865.46d)
                        .promptTemplate("<value>")
                        .validationDatasetFileId("<value>")
                        .build())
                .modelId("<value>")
                .build();

            CreateModelCustomizationResponse res = sdk.modelCustomization().create()
                .request(req)
                .call();

            if (res.modelCustomization().isPresent()) {
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
| `request`                                                                                                                      | [com.writer.sdk.models.operations.CreateModelCustomizationRequest](../../models/operations/CreateModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.writer.sdk.models.operations.CreateModelCustomizationResponse>](../../models/operations/CreateModelCustomizationResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## delete

Delete Model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.DeleteModelCustomizationRequest;
import com.writer.sdk.models.operations.DeleteModelCustomizationResponse;
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

            DeleteModelCustomizationRequest req = DeleteModelCustomizationRequest.builder()
                .customizationId("<value>")
                .modelId("<value>")
                .build();

            DeleteModelCustomizationResponse res = sdk.modelCustomization().delete()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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
| `request`                                                                                                                      | [com.writer.sdk.models.operations.DeleteModelCustomizationRequest](../../models/operations/DeleteModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.writer.sdk.models.operations.DeleteModelCustomizationResponse>](../../models/operations/DeleteModelCustomizationResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## get

Get model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.GetModelCustomizationRequest;
import com.writer.sdk.models.operations.GetModelCustomizationResponse;
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
                .organizationId(700347L)
                .build();

            GetModelCustomizationRequest req = GetModelCustomizationRequest.builder()
                .customizationId("<value>")
                .modelId("<value>")
                .build();

            GetModelCustomizationResponse res = sdk.modelCustomization().get()
                .request(req)
                .call();

            if (res.modelCustomization().isPresent()) {
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.writer.sdk.models.operations.GetModelCustomizationRequest](../../models/operations/GetModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends com.writer.sdk.models.operations.GetModelCustomizationResponse>](../../models/operations/GetModelCustomizationResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## list

List model customizations

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.ListModelCustomizationsRequest;
import com.writer.sdk.models.operations.ListModelCustomizationsResponse;
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

            ListModelCustomizationsRequest req = ListModelCustomizationsRequest.builder()
                .modelId("<value>")
                .build();

            ListModelCustomizationsResponse res = sdk.modelCustomization().list()
                .request(req)
                .call();

            if (res.customizationsResponse().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.writer.sdk.models.operations.ListModelCustomizationsRequest](../../models/operations/ListModelCustomizationsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.writer.sdk.models.operations.ListModelCustomizationsResponse>](../../models/operations/ListModelCustomizationsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
