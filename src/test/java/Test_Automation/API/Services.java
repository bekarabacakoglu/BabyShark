package Test_Automation.API;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Title;
import org.testng.annotations.Test;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.yecht.KindTag.Map;

public class Services extends BaseClass {

    io.restassured.response.Response response = null;

    public Services() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
    }

    public void getServices(String baseUri,String endPoint, String servicesName) throws Exception
    {
        RestAssured.baseURI = baseUri;
        response = RestAssured.given().contentType(ContentType.JSON).get(endPoint);
        System.out.println(" --- " + servicesName + " --- ");
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }
    public void putServices(String baseUri, String endPoint, String servicesName, String request) throws Exception
    {
        RestAssured.baseURI = baseUri;
        String requestJson = request;
        response = RestAssured.given().contentType(ContentType.JSON).body(requestJson).put(endPoint);
        System.out.println(" --- " + servicesName + " --- ");
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

        public void postServices(String baseUri, String endPoint, String servicesName, java.util.Map<String,Object> jsonAsMap) throws Exception
        {
            RestAssured.baseURI = baseUri;
            response = RestAssured.given().contentType(ContentType.JSON).body(jsonAsMap).post(endPoint);
            System.out.println(" --- " + servicesName + " --- ");
            System.out.println("Response :" + response.asString());
            System.out.println("Status Code :" + response.getStatusCode());
            assertEquals(200, response.getStatusCode());
        }

    public void deleteServices(String baseUri,String endPoint, String servicesName,String request) throws Exception
    {
        RestAssured.baseURI = baseUri;
        response = RestAssured.given().contentType(ContentType.JSON).body(request).delete(endPoint);
        System.out.println(" --- " + servicesName + " --- ");
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }
    public void deleteServicesNonReq(String baseUri,String endPoint, String servicesName) throws Exception
    {
        RestAssured.baseURI = baseUri;
        response = RestAssured.given().contentType(ContentType.JSON).delete(endPoint);
        System.out.println(" --- " + servicesName + " --- ");
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

    @Test
    @Title("createmonthlyremarketingopportunity")
    public void createmonthlyremarketingopportunity() throws Exception {
        logger = extent.startTest("createmonthlyremarketingopportunity","createmonthlyremarketingopportunity");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name","createmonthlyremarketingopportunity");
        jsonAsMap.put("AccountId","7DDE26A5-0719-44D2-BC3D-00030F0D4C1A");
        jsonAsMap.put("StartDate","2021-07-06");
        jsonAsMap.put("EndDate","2021-08-12");
        jsonAsMap.put("MonthlyPrice",3);
        jsonAsMap.put("OwnerDomainUsername","YEMEKSEPETI\\\\sevda.kiziltas");
        postServices(yemeksepetiXRM,"/XrmApi","createmonthlyremarketingopportunity",jsonAsMap);
    }

    @Test
    @Title("disabletop3contractline")
    public void disabletop3contractline() throws Exception {
        logger = extent.startTest("disabletop3contractline", "disabletop3contractline");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name", "disabletop3contractline");
        jsonAsMap.put("ContractLineId", "0673E00E-BC2A-E511-846A-005056900013");
        jsonAsMap.put("EndDate", "2022-08-31");
        jsonAsMap.put("UserName", "YEMEKSEPETI\\\\sevda.kiziltas");
        postServices(yemeksepetiXRM, "/XrmApi", "createmonthlyremarketingopportunity", jsonAsMap);
    }
    @Test
    @Title("createtop3contractline")
    public void createtop3contractline() throws Exception {
        logger = extent.startTest("createtop3contractline", "createtop3contractline");
        Map<String, Object> jsonAsMap = new HashMap<>();
        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("ProductId", "2DB7AA9C-7760-E511-80E1-005056AA5C50");
        valueMap.put("UserId", "47885902-AC96-EB11-813E-00505692008B");
        valueMap.put("CatalogName", "TR_ISTANBUL");
        valueMap.put("CategoryName", "7a507036-d048-4af1-be12-16af42184636");
        valueMap.put("Quantity", "3");
        valueMap.put("Amount", "3");
        valueMap.put("StartDate", "2021-07-06");
        valueMap.put("EndDate", "2021-08-12");
        valueMap.put("ServiceUserName", "YEMEKSEPETI\\\\sevda.kiziltas");
        valueMap.put("SelectedAreaName", "bjks");
        jsonAsMap.put("Name", "createtop3contractline");
        jsonAsMap.put("Top3ContractLine", valueMap);
        postServices(yemeksepetiXRM, "/XrmApi", "createtop3contractline", jsonAsMap);
    }

    @Test
    @Title("createmonthlyareabanneropportunity")
    public void createmonthlyareabanneropportunity() throws Exception {
        logger = extent.startTest("createmonthlyareabanneropportunity","createmonthlyareabanneropportunity");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name", "createmonthlyareabanneropportunity");
        jsonAsMap.put("AccountId", "7DDE26A5-0719-44D2-BC3D-00030F0D4C1A");
        jsonAsMap.put("StartDate", "2021-07-06");
        jsonAsMap.put("EndDate", "2021-08-12");
        jsonAsMap.put("MonthlyPrice", "3");
        jsonAsMap.put("OwnerDomainUsername", "YEMEKSEPETI\\\\sevda.kiziltas");
        postServices(yemeksepetiXRM, "/XrmApi", "createmonthlyremarketingopportunity", jsonAsMap);
    }

    @Test
    @Title("retrieverestaurantcontacts")
    public void retrieverestaurantcontacts() throws Exception {
        logger = extent.startTest("retrieverestaurantcontacts","retrieverestaurantcontacts");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name", "retrieverestaurantcontacts");
        jsonAsMap.put("restaurantId", "{9954b007-534e-ea11-8127-00505692008b}");
        postServices(yemeksepetiXRM, "/XrmApi", "retrieverestaurantcontacts", jsonAsMap);
    }

    @Test
    @Title("retrieverestaurantdeliveryareas")
    public void retrieverestaurantdeliveryareas() throws Exception {
        logger = extent.startTest("retrieverestaurantdeliveryareas","retrieverestaurantdeliveryareas");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name", "retrieverestaurantdeliveryareas");
        jsonAsMap.put("restaurantId", "{4e806b4e-8849-ea11-8127-00505692008b}");
        postServices(yemeksepetiXRM, "/XrmApi", "retrieverestaurantcontacts", jsonAsMap);

    }

    @Test
    @Title("retrieveannotations")
    public void retrieveannotations() throws Exception {
        logger = extent.startTest("retrieveannotations","retrieveannotations");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name","retrieveannotations");
        jsonAsMap.put("objectId","{313b47b0-d441-ea11-8122-00505692008b}");
        postServices(yemeksepetiXRM,"/XrmApi","retrieveannotations",jsonAsMap);
    }
    @Test
    @Title("retrieverestaurantinformation")
    public void retrieverestaurantinformation() throws Exception {
        logger = extent.startTest("retrieverestaurantinformation","retrieverestaurantinformation");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name","retrieverestaurantinformation");
        jsonAsMap.put("id","{313b47b0-d441-ea11-8122-00505692008b}");
        postServices(yemeksepetiXRM,"/XrmApi","retrieverestaurantinformation",jsonAsMap);
    }
    @Test
    @Title("retrievecallersbynumber")
    public void retrievecallersbynumber() throws Exception {
        logger = extent.startTest("retrievecallersbynumber","retrievecallersbynumber");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name","retrievecallersbynumber");
        jsonAsMap.put("phonenumber","2128332903");
        postServices(yemeksepetiXRM,"/xrmcustomerapi","retrievecallersbynumber",jsonAsMap);
    }
    @Test
    @Title("setrestaurantiban")
    public void setrestaurantiban() throws Exception {
        logger = extent.startTest("setrestaurantiban","setrestaurantiban");
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("Name","setrestaurantiban");
        jsonAsMap.put("restaurantId","{50E9263D-6901-EA11-8120-00505692008B}");
        jsonAsMap.put("iban","TR55 0006 70100 0000 0645 64733");
        postServices(yemeksepetiXRM,"/XrmApi","setrestaurantiban",jsonAsMap);
    }

}