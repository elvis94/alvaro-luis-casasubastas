<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : DetallesSubasta
    Created on : 28-abr-2009, 1:20:19
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlSubPublicas_action}" id="imghlSubPublicas" imageURL="/resources/icon_home.gif"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlMisSubastas_action}" id="imghlMisSubastas" imageURL="/resources/icon_auction.gif"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlNuevaSubasta_action}" id="imghlNuevaSubasta" imageURL="/resources/icon_sell.gif"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlCerrarSesion_action}" id="imghlCerrarSesion" imageURL="/resources/cerrar.PNG"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <webuijsf:staticText id="txtNombre" style="position: absolute; left: 72px; top: 216px" text="NOMBRE"/>
                        <webuijsf:staticText id="txtID" style="left: 120px; top: 216px; position: absolute" text="(ID)"/>
                        <webuijsf:staticText id="txtCategoria" style="left: 168px; top: 216px; position: absolute" text="CATEGORIA"/>
                        <webuijsf:staticText id="txtFechaCreacion" style="left: 72px; top: 264px; position: absolute"/>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
