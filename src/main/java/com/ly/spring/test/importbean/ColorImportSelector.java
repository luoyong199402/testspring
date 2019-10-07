package com.ly.spring.test.importbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class ColorImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        log.info(importingClassMetadata.getMemberClassNames().toString());

        return new String[]{"com.ly.spring.test.importbean.RedColor"};
    }
}
