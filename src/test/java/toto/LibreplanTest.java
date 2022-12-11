package toto;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;
import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibreplanTest {

    @Test
    public void test_libre_plan() throws Exception {
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        testCaseRunner.setProjectFile("src/test/resources/Projet_2_Libreplan.xml");
        testCaseRunner.setJUnitReport(true);
        testCaseRunner.setExportAll(true);
        testCaseRunner.setPrintReport(true);
        testCaseRunner.setOutputFolder("target/surefire-reports");

        final boolean result = testCaseRunner.run();
        assertTrue(result);
    }

}
