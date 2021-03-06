// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package unittesting.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the UnitTesting module

	public static boolean getRemoteApiEnabled()
	{
		return (Boolean)Core.getConfiguration().getConstantValue("UnitTesting.RemoteApiEnabled");
	}

	public static String getRemoteApiPassword()
	{
		return (String)Core.getConfiguration().getConstantValue("UnitTesting.RemoteApiPassword");
	}
}