package io.atlasmap.service.my;

import io.atlasmap.spi.AtlasActionProcessor;
import io.atlasmap.spi.AtlasFieldAction;
import io.atlasmap.v2.Action;
import io.atlasmap.v2.AtlasActionProperty;
import io.atlasmap.v2.FieldType;

import java.io.Serializable;

public class PaulsFieldActions implements AtlasFieldAction {

	public static class Concur extends Action implements Serializable {
		@AtlasActionProperty(title = "Pauls Concur Param", type = FieldType.STRING)
		public String concurarg = "-paul-";

	}


	@AtlasActionProcessor
	public static String concur(Concur action, String userInput) {
		return "concur-" + action.concurarg + userInput;
	}

}
