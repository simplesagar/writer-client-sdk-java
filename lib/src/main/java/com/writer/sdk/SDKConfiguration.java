/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk;

import com.writer.sdk.utils.HTTPClient;
import com.writer.sdk.models.shared.Security;
import java.util.Map;
import java.util.HashMap;

class SDKConfiguration {
	public HTTPClient defaultClient;
	public HTTPClient securityClient;
	public Security security;
	public String serverUrl;
	public int serverIdx = 0;
	public String language = "java";
	public String openapiDocVersion = "1.7";
	public String sdkVersion = "0.38.0";
	public String genVersion = "2.84.1";
	public Map<String, Map<String, Map<String, Object>>> globals = new HashMap<String, Map<String, Map<String, Object>>>(){{
		put("parameters", new HashMap<String, Map<String, Object>>());
	}};
	
}