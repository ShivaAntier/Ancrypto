package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class testingclass {
    @Test
    void test(){
        Assert.assertFalse(true,"this is assertFail");

    }
}
