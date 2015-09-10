package com.microsoft.hsg.jaxb;

import junit.framework.Assert;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.hsg.ConnectionFactory;
import com.microsoft.hsg.methods.jaxb.SimpleRequestTemplate;
import com.microsoft.hsg.methods.jaxb.getapplicationinfo.request.GetApplicationInfoRequest;
import com.microsoft.hsg.methods.jaxb.getapplicationinfo.response.GetApplicationInfoResponse;

@RunWith(JMock.class)
public class GetApplicationInfoTest {
	

	private Mockery context = new JUnit4Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};

	/**
     * Create the test case
     *
     */
    public GetApplicationInfoTest()
    {
    }
    
    @Test
    public void GetApplicationInfo() throws Exception
    {
    	SimpleRequestTemplate requestTemplate = new SimpleRequestTemplate(
    			ConnectionFactory.getConnection());
    	//requestTemplate.setPersonId("75ac2c6c-c90e-4f7e-b74d-bb7e81787beb");
    	//requestTemplate.setRecordId("8c390004-3d41-4f5c-8f24-4841651579d6");
    	
    	GetApplicationInfoResponse response = 
    		(GetApplicationInfoResponse)requestTemplate.makeRequest(
    			new GetApplicationInfoRequest());
    	
    	Assert.assertNotNull(response);
    }
}
