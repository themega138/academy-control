package com.mq310.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by moises on 12/02/17.
 */
@SpringUI(path = CctMainUI.UI_PATH)
@Theme(ValoTheme.THEME_NAME)
public class CctMainUI extends UI {

    public static final String UI_PATH = "sistema";

    @Override
    protected void init(VaadinRequest vaadinRequest) {

    }
}
