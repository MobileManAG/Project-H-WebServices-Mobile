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
 * ProjectHPatientPostBase.java
 * 
 * Project: projecth
 * 
 * @author MobileMan GmbH
 * @date 24.10.2010
 * @version 1.0
 * 
 * (c) 2010 MobileMan GmbH
 */

package com.mobileman.projecth.services.ws.patient.post.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobileman.projecth.services.ws.mobile.HaqAnswersPostService;

/**
 * @author MobileMan GmbH
 *
 */
public abstract class ProjectHPatientPostBase {

	@Autowired
	private HaqAnswersPostService haqAnswersPostService;
	
	/**
	 * @return haqAnswersPostService
	 */
	public HaqAnswersPostService getHaqAnswersPostService() {
		return this.haqAnswersPostService;
	}
}
