package toto;

import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class Libreplan {
	 
@Test
public void test() throws Exception {
    SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
    testCaseRunner.setProjectFile("C:/Users/Formation/eclipse-workspace/toto/src/test/resources/Projet_2_Libreplan.xml");
    try {
        testCaseRunner.run();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
