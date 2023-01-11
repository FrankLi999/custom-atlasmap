package io.atlasmap.examples.camel.main;

import io.atlasmap.api.AtlasContext;
import io.atlasmap.api.AtlasContextFactory;
import io.atlasmap.api.AtlasSession;
import io.atlasmap.core.DefaultAtlasContextFactory;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlToJsonTransformation {

	public static void main(String args[]) throws Exception {
		XmlToJsonTransformation m = new XmlToJsonTransformation();
		m.process();
	}

	public void process() throws Exception {
		URL url = Thread.currentThread().getContextClassLoader().getResource("atlas-map.adm");
		AtlasContextFactory factory = DefaultAtlasContextFactory.getInstance();
		AtlasContext context = factory.createContext(url.toURI());
		AtlasSession session = context.createSession();

		url = Thread.currentThread().getContextClassLoader().getResource("orderxml.xsd");
		String source = new String(Files.readAllBytes(Paths.get(url.toURI())));
		System.out.println("Source document:\n" + source);

		session.setSourceDocument("XMLSchemaSource", source);
		context.process(session);
		String targetDoc = (String) session.getTargetDocument("json-1f2d7c7c-82d5-4b13-b191-784ac5e9ac45");
		System.out.println(targetDoc);

	}


}
