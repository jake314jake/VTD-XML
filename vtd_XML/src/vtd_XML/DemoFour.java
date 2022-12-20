package vtd_XML;

import com.ximpleware.AutoPilot;
import com.ximpleware.NavException;
import com.ximpleware.ParseException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XPathEvalException;
import com.ximpleware.XPathParseException;
/* 
 * >Xpath implementation with AutoPilot
 * 
 */
public class DemoFour {
	public static void main(String[] args) throws ParseException,NavException, XPathEvalException, XPathParseException{
		VTDGen vg = new VTDGen();
		AutoPilot ap = new AutoPilot();
		String eXpretion="//Member/text()";
		ap.selectXPath(eXpretion);
		if (vg.parseFile("src/xmlFile/Presentation.xml",false)){
			VTDNav nv=vg.getNav();
			ap.bind(nv);
			 int i;
			while(( i=ap.evalXPath())!=-1) {
		String IndexInfo=nv.toNormalizedString(i);
		System.out.println("index "+i +"  --> "+IndexInfo);	
			  }
		}
	}
}
