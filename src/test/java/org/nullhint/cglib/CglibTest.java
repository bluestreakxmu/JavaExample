package org.nullhint.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * CGLIB测试类。
 *
 * @author lixibo
 * @date 2017/9/22
 */
public class CglibTest {

    @Test
    public void testFixedValue() throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new FixedValue() {
            public Object loadObject() throws Exception {
                return "Hello Cglib!";
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
        assertEquals("Hello Cglib!", proxy.test(null));
    }

}
