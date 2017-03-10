package com.mq310.utils.security;

import com.mq310.utils.security.SecurityUtils;
import com.vaadin.spring.access.ViewAccessControl;
import com.vaadin.ui.UI;
import org.springframework.stereotype.Component;

/**
 * This demonstrates how you can control access to views.
 */
@Component
public class SampleViewAccessControl implements ViewAccessControl {

    @Override
    public boolean isAccessGranted(UI ui, String beanName) {
        if (beanName.equals("adminView")) {
            return SecurityUtils.hasRole("ROLE_ADMIN");
        } else {
            return SecurityUtils.hasRole("ROLE_USER");
        }
    }
}
