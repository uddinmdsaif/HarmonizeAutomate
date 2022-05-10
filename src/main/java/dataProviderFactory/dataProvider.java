package dataProviderFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class dataProvider {

	public static configDataProvider getConfig() throws FileNotFoundException, IOException
	{
		configDataProvider config = new configDataProvider(); //Creates an object of the configdataProvider class to access the methods
		return config;
	}

}
