/*
 * (C) Copyright 2017 Netcentric AG.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package biz.netcentric.cq.tools.actool.aceservice.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AceServiceImplTest {

    @Test
    public void testIsRelevantPath() {
        AceServiceImpl aceServiceImpl = new AceServiceImpl();

        String[] restrictedToPaths = new String[] { "/content/site1", "/content/site3" };
        assertTrue(aceServiceImpl.isRelevantPath("/content/site1", restrictedToPaths));
        assertFalse(aceServiceImpl.isRelevantPath("/content/site1ButNotSameRoot", restrictedToPaths));
        assertTrue(aceServiceImpl.isRelevantPath("/content/site1/page", restrictedToPaths));

        assertFalse(aceServiceImpl.isRelevantPath("/content/site2", restrictedToPaths));
        assertFalse(aceServiceImpl.isRelevantPath("/content/site2/page", restrictedToPaths));

        assertTrue(aceServiceImpl.isRelevantPath("/content/site3", restrictedToPaths));
        assertTrue(aceServiceImpl.isRelevantPath("/content/site3/page", restrictedToPaths));

        assertFalse(aceServiceImpl.isRelevantPath("/etc/cloudservices", restrictedToPaths));

    }

}
