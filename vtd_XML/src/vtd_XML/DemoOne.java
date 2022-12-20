package vtd_XML;
import com.ximpleware.*;
/* 
 * >parse a xml file with vtd
 * 
 */
public class DemoOne{
	public static void main(String[] args) throws ParseException,NavException{
		VTDGen vg = new VTDGen();
		if (vg.parseFile("src/xmlFile/Presentation.xml",false)){
			VTDNav nv=vg.getNav();
			int startIndex =nv.getCurrentIndex();
			String startIndexInfo=nv.toNormalizedString(startIndex);
		System.out.println("default index is :"+startIndex);
		System.out.println("default index point to :"+startIndexInfo);
		}
	}
}
