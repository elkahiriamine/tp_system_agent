package agents;

import jade.core.Agent;

public class ConsumerAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("****************************");
        System.out.println("Agent's name : "+this.getAID().getName());
        if (this.getArguments().length ==1)
        System.out.println("I'm gonna try to buy a book's name :"+this.getArguments()[0]);
        System.out.println("****************************");
    }

    @Override
    protected void beforeMove() {
        System.out.println("****** Before move ******");
    }

    @Override
    protected void afterMove() {
        System.out.println("***** After move ******");
    }

    @Override
    protected void takeDown() {
        System.out.println("***** takeDown *****");
    }
}
