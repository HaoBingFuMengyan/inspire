package com.inspire.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        //addExcludedPath配置不被装饰的路径，addDecoratorPath配置被装饰的路径
        builder.addDecoratorPath("/admin/*", "/admin/index")
                .addExcludedPath("/admin/index")
                .addExcludedPath("/admin/login");
    }
}