
import resources.Script1Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>18/07/2018 16:04:19</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		classicsCD().click(atPoint(470,20));
		classicsCD().click(atPoint(470,20));
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		placeOrder2().click();
		
		// 
		aceptar().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(103,7));
		placeAnOrder().inputChars("838383838383838");
		expirationDate().click(atPoint(29,8));
		expirationDate().hover(atPoint(29,8));
		placeAnOrder().inputKeys("087{BKSP}/17");
		placeOrder2().click();
		
		// 
		aceptar2().click();
	}
}

