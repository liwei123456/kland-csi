package com.kland.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * @author xiangli
 */
public abstract class JerseyConfig extends ResourceConfig {
    protected abstract String[] extendedResourcePackages();

    public JerseyConfig() {
        packages("com.kland.csi.service");

        String[] resourcePackages = extendedResourcePackages();
        if (resourcePackages != null && resourcePackages.length > 0) {
            packages(resourcePackages);
        }

        register(RolesAllowedDynamicFeature.class);
        //Support for Spring
        register(RequestContextFilter.class);
    }
}
