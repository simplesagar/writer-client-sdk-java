# Content
(*content()*)

## Overview

Methods related to Content

### Available Operations

* [check](#check) - Check your content against your preset styleguide.
* [correct](#correct) - Apply the style guide suggestions directly to your content.

## check

Check your content against your preset styleguide.

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.ContentCheckRequest;
import com.writer.sdk.models.operations.ContentCheckResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.ContentRequest;
import com.writer.sdk.models.shared.ContentSettings;
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
                .organizationId(935464L)
                .build();

            ContentCheckRequest req = ContentCheckRequest.builder()
                .contentRequest(ContentRequest.builder()
                        .content("<value>")
                        .settings(ContentSettings.builder()
                                .ageAndFamilyStatus(false)
                                .confidence(false)
                                .contentSafeguards(false)
                                .disability(false)
                                .genderIdentitySensitivity(false)
                                .genderInclusiveNouns(false)
                                .genderInclusivePronouns(false)
                                .grammar(false)
                                .healthyCommunication(false)
                                .passiveVoice(false)
                                .raceEthnicityNationalitySensitivity(false)
                                .sexualOrientationSensitivity(false)
                                .spelling(false)
                                .substanceUseSensitivity(false)
                                .unclearReference(false)
                                .wordiness(false)
                                .build())
                        .build())
                .teamId(38270L)
                .build();

            ContentCheckResponse res = sdk.content().check()
                .request(req)
                .call();

            if (res.processedContent().isPresent()) {
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
| `request`                                                                                              | [com.writer.sdk.models.operations.ContentCheckRequest](../../models/operations/ContentCheckRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Optional<? extends com.writer.sdk.models.operations.ContentCheckResponse>](../../models/operations/ContentCheckResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## correct

Apply the style guide suggestions directly to your content.

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.*;
import com.writer.sdk.models.operations.ContentCorrectRequest;
import com.writer.sdk.models.operations.ContentCorrectResponse;
import com.writer.sdk.models.shared.*;
import com.writer.sdk.models.shared.ContentRequest;
import com.writer.sdk.models.shared.ContentSettings;
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
                .organizationId(501355L)
                .build();

            ContentCorrectRequest req = ContentCorrectRequest.builder()
                .contentRequest(ContentRequest.builder()
                        .content("<value>")
                        .settings(ContentSettings.builder()
                                .ageAndFamilyStatus(false)
                                .confidence(false)
                                .contentSafeguards(false)
                                .disability(false)
                                .genderIdentitySensitivity(false)
                                .genderInclusiveNouns(false)
                                .genderInclusivePronouns(false)
                                .grammar(false)
                                .healthyCommunication(false)
                                .passiveVoice(false)
                                .raceEthnicityNationalitySensitivity(false)
                                .sexualOrientationSensitivity(false)
                                .spelling(false)
                                .substanceUseSensitivity(false)
                                .unclearReference(false)
                                .wordiness(false)
                                .build())
                        .build())
                .teamId(31310L)
                .xRequestID("<value>")
                .build();

            ContentCorrectResponse res = sdk.content().correct()
                .request(req)
                .call();

            if (res.correctionResponse().isPresent()) {
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
| `request`                                                                                                  | [com.writer.sdk.models.operations.ContentCorrectRequest](../../models/operations/ContentCorrectRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends com.writer.sdk.models.operations.ContentCorrectResponse>](../../models/operations/ContentCorrectResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| com.writer.sdk.models.errors.FailResponse | 400,401,403,404,500                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |
