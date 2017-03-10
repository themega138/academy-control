package com.mq310.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by moises on 11/02/17.
 */
@SpringUI(path = CctLoginUI.UI_PATH)
@Theme(ValoTheme.THEME_NAME)
public class CctLoginUI extends UI{

    public static final String UI_PATH = "login";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        layout.setSizeFull();

        HorizontalLayout buttons = new HorizontalLayout();
        buttons.setSpacing(true);
        layout.addComponent(buttons);

        buttons.addComponent(new Button("Invoke user method", event -> {
            // This method should be accessible by both 'user' and 'admin'.
            Notification.show("User");
        }));
        buttons.addComponent(new Button("Navigate to user view", event -> {
            getNavigator().navigateTo("");
        }));
        buttons.addComponent(new Button("Invoke admin method", event -> {
            // This method should be accessible by 'admin' only.
            Notification.show("Admin");
        }));
        buttons.addComponent(new Button("Navigate to admin view", event -> {
            getNavigator().navigateTo("admin");
        }));

        Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        layout.addComponent(viewContainer);
        layout.setExpandRatio(viewContainer, 1.0f);

        setContent(layout);

        Navigator navigator = new Navigator(this, viewContainer);

    }
}
