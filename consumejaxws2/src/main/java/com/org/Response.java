package com.org;

import org.mule.api.MuleContext;
import org.mule.api.MuleEventContext;
import org.mule.api.annotations.expressions.Lookup;
import org.mule.api.lifecycle.Callable;
public class Response implements Callable {
	
	 @Lookup
	    private MuleContext muleContext;
	    
	      
	    @Override
	    public Object onCall(MuleEventContext eventContext) throws Exception {

	    	System.out.println("Hello244");
	    //	org.apache.cxf.staxutils.DepthXMLStreamReader payload =  (org.apache.cxf.staxutils.DepthXMLStreamReader) eventContext.getMessage().getPayload();
	       ResponseType  t1 = (ResponseType) eventContext.getMessage().getPayload();
	    	
	    //	System.out.println(payload.getElementText()); 
	    //	System.out.println(payload.getText()); 
	    	
	      
	        
	    //    return eventContext.getMessage().getPayload().toString();
	      return t1;  
	    }
}

