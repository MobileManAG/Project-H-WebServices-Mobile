/*******************************************************************************
 * Copyright 2015 MobileMan GmbH
 * www.mobileman.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * ProjectHPatientPostEndpoint.java
 * 
 * Project: projecth
 * 
 * @author MobileMan GmbH
 * @date 25.10.2010
 * @version 1.0
 * 
 * (c) 2010 MobileMan GmbH
 */

package com.mobileman.projecth.services.ws.patient.post.impl;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.mobileman.projecth.services.ws.mobile.model.ProjectHPostInitialRequest;
import com.mobileman.projecth.services.ws.mobile.model.ProjectHPostInitialResponse;
import com.mobileman.projecth.services.ws.patient.post.ProjectHPatientInitialPostEndpointService;


/**
 * @author MobileMan GmbH
 *
 */
@Endpoint
public class ProjectHPatientInitialPostEndpoint extends ProjectHPatientPostBase
		implements ProjectHPatientInitialPostEndpointService {
	
    
	/**
	 * {@inheritDoc}
	 * @see com.mobileman.projecth.services.ws.patient.post.ProjectHPatientInitialPostEndpointService#postInitialPatientData(com.mobileman.projecth.services.ws.mobile.model.ProjectHPostInitialRequest)
	 */
	@Override
	@PayloadRoot(localPart=POST_PATIENT_INITIAL_REQUEST, namespace=NAMESPACE)
	public ProjectHPostInitialResponse postInitialPatientData(ProjectHPostInitialRequest data) throws Exception {
		return getHaqAnswersPostService().processUserPost(data);
	}
}
