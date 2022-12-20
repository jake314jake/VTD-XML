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

public class DemoSix {

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
             
             while ((i = ap.evalXPath()) != -1){
                 // operate on the cursor element
                 xm.remove();
               
             }
            
             }
             xm.output("src/xmlFile/removePresentation.xml"); 
    }


}
