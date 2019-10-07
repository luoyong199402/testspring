package com.ly.spring.test.bean;

import com.ly.spring.test.dao.PersonDao;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@ToString
@Component
@Slf4j
public class TestAutoWired implements EmbeddedValueResolverAware {
    private PersonDao personDao;

    private PersonDao personDao2;

    private PersonDao personDao3;

    private StringValueResolver stringValueResolver;

    public TestAutoWired(PersonDao personDao) {
        this.personDao= personDao;
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao2 = personDao;
    }


    public void xxx(@Autowired PersonDao personDao) {
        this.personDao3 = personDao;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
    }

    public void show() {
        String value = this.stringValueResolver.resolveStringValue("${os.name}");

        log.info(value);
    }
}
