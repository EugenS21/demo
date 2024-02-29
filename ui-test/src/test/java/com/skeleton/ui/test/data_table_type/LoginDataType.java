package com.skeleton.ui.test.data_table_type;

import com.skeleton.ui.test.model.LoginModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class LoginDataType {

    @DataTableType
    public LoginModel getLoginModelFromDataTable(Map<String, String> dataTableAsMap) {
        return new LoginModel(dataTableAsMap.get("username"), dataTableAsMap.get("password"));
    }

}
