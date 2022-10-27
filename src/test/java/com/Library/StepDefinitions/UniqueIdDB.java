package com.Library.StepDefinitions;


import org.junit.Assert;
import com.Library.Utilities.DBUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UniqueIdDB {
      String actualResult;
      @When("Execute query to get all IDs from users")
      public void Execute_query_to_get_all_IDs_from_users() {
            String query1 = "select count(id) from users";
            DBUtils.runQuery(query1);
            actualResult = DBUtils.getFirstRowFirstColumn();
            System.out.println("Actual Result = " + actualResult);

      }

      @Then("verify all users has unique ID")
      public void verify_all_users_has_unique_ID() throws Exception {
          
            String query2 = "select count(distinct id) from users";
            DBUtils.runQuery(query2);
            String expectedResult = DBUtils.getCellValue(1, 1);

            System.out.println("Expected Result = " + expectedResult);

            Assert.assertEquals(expectedResult, actualResult);
      }

}
