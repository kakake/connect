/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.client.core.api.servlets;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mirth.connect.client.core.ClientException;
import com.mirth.connect.client.core.api.BaseServletInterface;
import com.mirth.connect.client.core.api.MirthOperation;
import com.mirth.connect.model.SystemInfo;
import com.mirth.connect.model.SystemStats;

@Path("/system")
@Tag(name = "System Information and Statistics")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public interface SystemServletInterface extends BaseServletInterface {
    @GET
    @Path("/info")
    @Operation(summary="Returns information about the underlying system.")
    @MirthOperation(name = "getJVMInfo", display = "Get System Information", auditable = false)
    public SystemInfo getInfo() throws ClientException;

    @GET
    @Path("/stats")
    @Operation(summary="Returns statistics for the underlying system.")
    @MirthOperation(name = "getStats", display = "Get System Statistics", auditable = false)
    public SystemStats getStats() throws ClientException;
}
