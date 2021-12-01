/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.macro;

/**
 * Error to signify that the macro doesn't exist.
 *
 * @version $Id$
 * @since 4.3M1
 */
public class MacroNotFoundException extends MacroLookupException
{
    /**
     * For serialization.
     */
    private static final long serialVersionUID = -1L;

    /**
     * @param message the detail message.
     */
    public MacroNotFoundException(String message)
    {
        super(message);
    }

    /**
     * @param message the detail message.
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method). A {@code null}
     *            value is permitted, and indicates that the cause is nonexistent or unknown
     */
    public MacroNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
