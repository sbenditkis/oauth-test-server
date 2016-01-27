package com.sapisns.tests.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartJettyServer {
	public static void main(String[] args) throws Exception {
		Server server = new Server(6060);
        WebAppContext context = new WebAppContext();
        context.setDescriptor("/WEB-INF/web.xml");
        context.setResourceBase("src/main/webapp");
        context.setContextPath("/");
 
        server.setHandler(context);
 
        server.start();
        server.join();
	}
}
