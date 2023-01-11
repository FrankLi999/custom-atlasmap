package io.atlasmap.service.my;

import java.io.Serializable;
import io.atlasmap.v2.*;
import io.atlasmap.spi.AtlasFieldAction;
import io.atlasmap.spi.AtlasActionProcessor;

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