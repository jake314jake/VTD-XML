package vtd_XML;

import java.io.IOException;

import com.ximpleware.AutoPilot;
import com.ximpleware.IndexWriteException;
import com.ximpleware.ModifyException;
import com.ximpleware.NavException;
import com.ximpleware.TranscodeException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XMLModifier;
import com.ximpleware.XPathEvalException;
import com.ximpleware.XPathParseException;
/* 
 * >add attribute(s) to an element with XMLModifier
 * 
 */
public class DemoFive {
	public static void main(String[] args) throws IndexWriteException,IOException, XPathParseException, ModifyException, XPathEvalException, NavException, TranscodeException{
		 
             int i;
             VTDGen vg = new VTDGen();
             AutoPilot ap = new AutoPilot();
             XMLModifier xm = new XMLModifier();
             String eXpretion="//Member";
             if (vg.parseFile("src/xmlFile/Presentation.xml",false)) {
             VTDNav vn = vg.getNav();
             ap.selectXPath(eXpretion);
             ap.bind(vn);
             xm.bind(vn);
             int j=1;
             while ((i = ap.evalXPath()) != -1){
                 xm.insertAttribute(" memberId='m_"+j+"'");
                 j++;
             }
            
             }
            
             xm.output("src/xmlFile/addAttribuePresentation.xml"); 
    }
}
