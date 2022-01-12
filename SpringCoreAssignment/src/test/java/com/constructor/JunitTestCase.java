package com.constructor;



import static org.junit.Assert.*;



import org.junit.Test;



public class JunitTestCase {



public JunitTestCase(Address1 add) {
assertEquals(1,add.getStreet());

}
@Test
void set(Address1 add) {
assertEquals("set(add)",add.getStreet());
}

}