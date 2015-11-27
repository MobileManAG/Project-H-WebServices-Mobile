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
 * ProjectHPatientPostEndpointService.java
 * 
 * Project: projecth
 * 
 * @author MobileMan GmbH
 * @date 25.10.2010
 * @version 1.0
 * 
 * (c) 2010 MobileMan GmbH
 */

package com.mobileman.projecth.services.ws.patient.post;

import com.mobileman.projecth.services.ws.mobile.model.ProjectHPostRequest;
import com.mobileman.projecth.services.ws.mobile.model.ProjectHPostResponse;

/**
 * Web service
 * 
 * @author MobileMan GmbH
 * 
 */
public interface ProjectHPatientPostEndpointService {

	/**
	 * 
	 */
	public final static String NAMESPACE = "http://mobileman.com/projecth/schemas";

	/**
     * 
     */
	public final static String POST_PATIENT_REQUEST = "ProjectHPostRequest";

	/**
	 * @param data
	 * @return result of processed patient post
	 * @throws Exception
	 */
	ProjectHPostResponse postPatientData(ProjectHPostRequest data) throws Exception;
}
