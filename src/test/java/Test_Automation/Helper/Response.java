package Test_Automation.Helper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    public Object result;
    public Object Response;
    public String version;
    public Integer statusCode;
    public String cardNo;
    public String bankAccountBranch;
    public String bankAccountNo;
    public String fiscalId;
    public String txnFiscalId;
}