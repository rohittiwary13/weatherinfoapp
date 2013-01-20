package com.rohit.form;
import java.util.Set;

import javax.validation.ConstraintViolation;

import junit.framework.Assert;

import org.hibernate.validator.HibernateValidator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.rohit.form.EnterZipForm;

public class TestSize {
    private LocalValidatorFactoryBean localValidatorFactory;
 
    @Before
    public void setup() {
        localValidatorFactory = new LocalValidatorFactoryBean();
        localValidatorFactory.setProviderClass(HibernateValidator.class);
        localValidatorFactory.afterPropertiesSet();
    }
   
    @Test
    public void testSizeValidationError() {
        final EnterZipForm productModel1 = new EnterZipForm();
        productModel1.setZipcode("94117");
        Set<ConstraintViolation<EnterZipForm>> constraintViolations1 = localValidatorFactory.validate(productModel1);
        Assert.assertEquals(constraintViolations1.size(),0);
    }
    
    
    
}
