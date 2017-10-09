package com.company.controller;

import com.company.service.InfoService;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by gsp on 31/07/2016.
 */
@Controller
@ComponentScan("com.company.*")
public class ApiController {

    @Autowired
    InfoService infoService;

    @RequestMapping(value = {"/getdata"}, method = RequestMethod.GET)
    @ResponseBody
    public String getData() throws SQLException {
        System.out.println("DS RESULT : "+infoService.getDs().getConnection());
        return "SEE LOG WHAT HAPPEND";
    }

}
