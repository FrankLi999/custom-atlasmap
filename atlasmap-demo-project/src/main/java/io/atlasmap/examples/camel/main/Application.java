//package io.atlasmap.examples.camel.main;
//
//import org.apache.camel.main.Main;
//
//import org.apache.camel.builder.RouteBuilder;
//
//
//public class Application extends RouteBuilder {
//
//	@Override
//	public void configure() throws Exception {
//		from("timer:foo?period=5000")
//				.setBody(simple("resource:classpath:order.json"))
//				.log("--&gt; Sending: [${body}]")
//				.to("atlas:abcdefgh.adm")
//				.log("--&lt; Received: [${body}]");
//	}
//
//	public static void main(String args[]) throws Exception {
//		Main camelMain = new Main();
//		camelMain.addRouteBuilder(new Application());
//		camelMain.run(args);
//	}
//}
