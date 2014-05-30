package com.silverpop.api.client.converters;

import com.thoughtworks.xstream.converters.basic.DateConverter;

public class ApiDateParameterWithoutAMPMConverter extends DateConverter {

    public static final String DEFAULT_FORMAT = "MM/dd/yyyy hh:mm:ss";
    public static final String[] ACCEPTABLE_FORMATS = {};

    public ApiDateParameterWithoutAMPMConverter() {
        super(DEFAULT_FORMAT, ACCEPTABLE_FORMATS);
    }

}
