// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxawsiot.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import mxawsiot.impl.IoTConnector;

/**
 * Describe endpoint for IoT Thing rest calls
 */
public class DescribeEndpoint extends CustomJavaAction<java.lang.String>
{
	private java.lang.String AwsAccessKeyId;
	private java.lang.String AwsSecretAccessKey;
	private java.lang.String AwsRegion;

	public DescribeEndpoint(IContext context, java.lang.String AwsAccessKeyId, java.lang.String AwsSecretAccessKey, java.lang.String AwsRegion)
	{
		super(context);
		this.AwsAccessKeyId = AwsAccessKeyId;
		this.AwsSecretAccessKey = AwsSecretAccessKey;
		this.AwsRegion = AwsRegion;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
        IoTConnector connector = new IoTConnector();
        connector.setLogger(Core.getLogger(DescribeThing.class.getName()));
        connector.setCredentials(this.AwsAccessKeyId, this.AwsSecretAccessKey);
		connector.setRegion(this.AwsRegion);
        String result = connector.describeEndpoint();
        return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DescribeEndpoint";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
