package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class SimpleContainer {


    public static void main(String[] args) throws Exception {


        Runtime runtime = Runtime.instance();
        ProfileImpl profile = new ProfileImpl();
        profile.setParameter(Profile.MAIN,"localhost");
        AgentContainer agentContainer = runtime.createAgentContainer(profile);
        agentContainer.start();
    }

}
