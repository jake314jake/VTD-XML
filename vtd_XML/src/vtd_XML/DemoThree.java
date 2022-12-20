package vtd_XML;

import com.ximpleware.NavException;
import com.ximpleware.ParseException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
/* 
 * >get the pair (Index,Value) of a xml file with VTDNav
 * 
 */
public class DemoThree {
	public static void main(String[] args) throws ParseException,NavException{
		VTDGen vg = new VTDGen();
		if (vg.parseFile("src/xmlFile/Presentation.xml",false)){
			VTDNav nv=vg.getNav();
			int startIndex =nv.getCurrentIndex();//start with the root index
		for(int i=startIndex; ;i++) {
			String IndexInfo=nv.toNormalizedString(i);
			if("".equals(IndexInfo)) break;
			System.out.println("Index "+i+"  --> "+IndexInfo);	
			}
		}
	}
}
