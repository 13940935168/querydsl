/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.mysql;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.mysema.query.Connections;
import com.mysema.query.InsertBaseTest;
import com.mysema.query.Target;
import com.mysema.query.sql.MySQLTemplates;
import com.mysema.testutil.FilteringTestRunner;
import com.mysema.testutil.Label;
import com.mysema.testutil.ResourceCheck;

@RunWith(FilteringTestRunner.class)
@ResourceCheck("/mysql.run")
@Label(Target.MYSQL)
public class InsertMySQLTest extends InsertBaseTest{
    
    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initMySQL();
    }

    @Before
    public void setUpForTest() {
        dialect = new MySQLTemplates().newLineToSingleSpace();
    }

}
