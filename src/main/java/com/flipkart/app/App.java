package com.flipkart.app;
/**
 * Hello world!
 *
 */

import com.flipkart.RESTcontroller.HelloRESTcontroller;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class App extends Application<Configuration>
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        //  e.jersey().register(new EmployeeRESTController(e.getValidator()));
         e.jersey().register(new HelloRESTcontroller());



//        e.jersey().register(new EmployeeRESTController(e.getValidator()));
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}
