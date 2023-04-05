package org.structural.adapter.pattern.adapter;

import org.structural.adapter.pattern.model.JsonData;
import org.structural.adapter.pattern.model.XmlData;
import org.structural.adapter.pattern.service.Restaurant;
import org.structural.adapter.pattern.service.UiService;

public class UiServiceAdapter implements Restaurant {
    private UiService uiService;

    public UiServiceAdapter() {
        this.uiService = new UiService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = xmlToJson(xmlData);
        uiService.displayMenus(jsonData);
    }

    private JsonData xmlToJson(XmlData xmlData) {
        //xml to json conversion logic here
        return null;
    }
}
