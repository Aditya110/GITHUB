package droolsTest;

import java.util.LinkedList;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.google.gson.Gson;


public class ProcessAccountDetailsRules implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String response = null;
		try{
		System.out.println("Payload === "+eventContext.getMessage().getPayload());
		System.out.println("payload class: " + eventContext.getMessage().getPayload().getClass().getName());
		/*LinkedList response = (LinkedList) eventContext.getMessage().getPayload();
		System.out.println("class name: " + response.get(0).getClass().getName());
		System.out.println("class(tostring): " + response.toString());*/
		Gson gson = new Gson();
		AccountDetailsResponseBO[] accountDetailsResponseBo = gson.fromJson(eventContext.getMessage().getPayload().toString(), AccountDetailsResponseBO[].class);
		System.out.println(accountDetailsResponseBo);
		
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("accountStatus.drl"), ResourceType.DRL);
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
                    StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
                    ksession.insert(accountDetailsResponseBo);
                    ksession.fireAllRules();
                    response = "positive";
		}
		
		catch(Exception e){
			response = "nagative";
			e.printStackTrace();
			System.out.println(e);
		}
		
		return response;
	}

}
