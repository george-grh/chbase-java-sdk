/*
 * Copyright 2011 Microsoft Corp.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.chbase.applications;

/**
 * The Request Context is available while the thread is
 * processing a request for an user.
 */
public class RequestCtx {
	
	/** The _person info. */
	private static ThreadLocal _personInfo = new ThreadLocal();

    /**
     * Gets the person info.
     * 
     * @return the person info
     */
    public static PersonInfo getPersonInfo() {
        return ((PersonInfo) (_personInfo.get()));
    }
    
    /**
     * Sets the person info.
     * 
     * @param personInfo the new person info
     */
    public static void setPersonInfo(PersonInfo personInfo) {
    	_personInfo.set(personInfo);
    }

}
