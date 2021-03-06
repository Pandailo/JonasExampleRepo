/**
 * JOnAS: Java(TM) Open Application Server
 * Copyright (C) 2008 Bull S.A.S
 * Contact: jonas-team@objectweb.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 * Initial developer(s):
 * --------------------------------------------------------------------------
 * $Id: MyException.java 17350 2009-05-13 14:15:43Z fornacif $
 * --------------------------------------------------------------------------
 */
package org.ow2.jonas.examples.cluster.javaee5.beans.samplecluster3;


/**
 * @author
 * application exception
 */
public class MyException extends Exception {

    /**
     * UID
     */
    private static final long serialVersionUID = 110L;


    /**
     * Default Constructor
     *
     */
    public MyException() {
        super();
    }

    /**
     * Constructor
     * @param msg message associated with the exception
     */
    public MyException(final String msg) {
        super(msg);
    }

}

