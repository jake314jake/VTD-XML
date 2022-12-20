package vtd_XML;

import com.ximpleware.NavException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;


public class DemoTwo {
	public static void main(String[] args) throws NavException {
		VTDGen vg = new VTDGen();
		if (vg.parseFile("src/xmlFile/Presentation.xml",false)){
			VTDNav nv=vg.getNav();
			int attributeIndex =nv.getAttrVal("ID");
		String attributeVal=nv.toNormalizedString(attributeIndex);
		System.out.println("ID attribute Index is :"+attributeIndex);
		System.out.println("ID attribute Value is :"+attributeVal);
		}
	}

}
