package com.rohit.form;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Set;

import javax.validation.ConstraintViolation;
 
import junit.framework.Assert;
 
import org.hibernate.validator.HibernateValidator;
import org.junit.Before;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.rohit.form.EnterZipForm;
 
public class TestNull {
    private LocalValidatorFactoryBean localValidatorFactory;
 
    @Before
    public void setup() {
        localValidatorFactory = new LocalValidatorFactoryBean();
        localValidatorFactory.setProviderClass(HibernateValidator.class);
        localValidatorFactory.afterPropertiesSet();
    }
    @Test
    public void testNullValidationError() {
        final EnterZipForm productModel = new EnterZipForm();
        productModel.setZipcode(null);
        Set<ConstraintViolation<EnterZipForm>> constraintViolations = localValidatorFactory.validate(productModel);
        Assert.assertEquals(constraintViolations.size(), 1);
    }
   
   
}