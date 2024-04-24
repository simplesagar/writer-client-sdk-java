# CompletionRequest


## Fields

| Field                        | Type                         | Required                     | Description                  | Example                      |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `bestOf`                     | *Optional<? extends Long>*   | :heavy_minus_sign:           | N/A                          | 1                            |
| `frequencyPenalty`           | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          |                              |
| `logprobs`                   | *Optional<? extends Long>*   | :heavy_minus_sign:           | N/A                          |                              |
| `maxTokens`                  | *Optional<? extends Long>*   | :heavy_minus_sign:           | N/A                          | 1024                         |
| `minTokens`                  | *Optional<? extends Long>*   | :heavy_minus_sign:           | N/A                          | 1                            |
| `n`                          | *Optional<? extends Long>*   | :heavy_minus_sign:           | N/A                          |                              |
| `presencePenalty`            | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          |                              |
| `prompt`                     | *String*                     | :heavy_check_mark:           | N/A                          |                              |
| `stop`                       | List<*String*>               | :heavy_minus_sign:           | N/A                          | [<br/>"the",<br/>"is",<br/>"and"<br/>] |
| `temperature`                | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          | 0.7                          |
| `topP`                       | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          | 1                            |