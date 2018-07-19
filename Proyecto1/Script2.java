
import resources.Script2Helper;
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
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>18/07/2018 17:46:50</b>
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
		tree2().click(atPath("Composers->Mozart->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Mozart->Symphony No. 34"));
		placeOrder().click();
		
		// Frame: Member Logon
		newCustomer().click();
		ok().click();
		
		// Frame: Place an Order
		placeAnOrder().move(atPoint(65,114));
		placeAnOrder().click(atPoint(333,18));
		cardNumberIncludeTheSpaces().click(atPoint(49,11));
		placeAnOrder().inputChars("1234123412341234");
		creditCombo().click();
		creditCombo().click(atText("Mastercard"));
		expirationDate().click(atPoint(41,5));
		placeAnOrder().inputChars("02/19");
		name().click(atPoint(151,6));
		placeAnOrder().inputKeys("{CAPSLOCK}E{CAPSLOCK}duardo {CAPSLOCK}B{CAPSLOCK}ustos{TAB}");
		placeAnOrder().inputKeys("{CAPSLOCK}F{CAPSLOCK}ernando de {CAPSLOCK}AL{CAPSLOCK}{BKSP}lva ");
		placeAnOrder().inputKeys("{CAPSLOCK}I{CAPSLOCK}xtiloxócihtl 11{TAB}");
		placeAnOrder().inputKeys("{CAPSLOCK}C{CAPSLOCK}ol. {CAPSLOCK}O{CAPSLOCK}brera, {CAPSLOCK}D");
		placeAnOrder().inputKeys("{CAPSLOCK}el. {CAPSLOCK}C{CAPSLOCK}uauhtemoc{TAB}");
		placeAnOrder().inputChars("5537315426");
		placeOrder2().click();
		
		// 
		aceptar().click();
	}
}

