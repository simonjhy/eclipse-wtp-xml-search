/*******************************************************************************
 * Copyright (c) 2010 Angelo ZERR.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:      
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.xml.search.core.resource;

/**
 * A provider to returns {@link IResourceRequestor}.
 * 
 */
public interface IResourceRequestorProvider {

	/**
	 * Resource requestor to use.
	 * 
	 * @return
	 */
	IResourceRequestor getRequestor();
}