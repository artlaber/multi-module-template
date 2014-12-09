package org.artdevs.projectname.facades.impl;

import org.artdevs.projectname.facades.FacadeComponent;
import org.springframework.stereotype.Component;

/**
 * Created by Artem L.V. on 09.12.14.
 */
@Component("defaultFacadeComponent")
public class SomeFacadeComponent implements FacadeComponent {

	@Override
	public String getMessage() {
		return "Message from Some Facade component";
	}

}
