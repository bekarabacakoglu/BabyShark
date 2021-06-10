package Test_Automation.Helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    public String merchantCode;
    public String httpCode;
    public String token;
    public String terminalCode;
    public String id;
    public String explanation;
    public String message;
    public String fiscalId;
    public String result;
}
