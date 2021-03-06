package com.softpower.demo.springsession.core.annotation.transactional;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public @interface NonTx {

}
