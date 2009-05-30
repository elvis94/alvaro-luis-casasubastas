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
                        <webuijsf:staticText id="txtFechaCreacion" style="left: 72px; top: 288px; position: absolute" text="FECHA CREACION"/>
                        <webuijsf:staticText id="txtSubastador" style="left: 72px; top: 264px; position: absolute" text="SUBASTADOR"/>
                        <webuijsf:staticText id="txtFechaCierre" style="left: 72px; top: 312px; position: absolute" text="FECHA CIERRE"/>
                        <webuijsf:staticText id="txtPrecioSalida" style="left: 72px; top: 336px; position: absolute" text="PRECIO SALIDA"/>
                        <webuijsf:staticText id="txtPujaActual" style="position: absolute; left: 384px; top: 264px" text="PUJA ACTUAL"/>
                        <webuijsf:staticText id="txtPujadorActual" style="left: 480px; top: 264px; position: absolute" text="PUJADOR ACTUAL"/>
                        <webuijsf:staticText id="txtFechaPujaActual" style="left: 384px; top: 288px; position: absolute" text="FECHA PUJA ACTUAL"/>
                        <webuijsf:textField id="textField1" style="left: 384px; top: 312px; position: absolute"/>
                        <webuijsf:button id="btPujar" primary="true"
                            style="font-size: 14px; font-weight: bold; height: 24px; left: 527px; top: 312px; position: absolute; width: 72px" text="Pujar!"/>
                        <webuijsf:staticText id="txtPrecioCompra" style="left: 384px; top: 360px; position: absolute" text="PRECIO COMPRA"/>
                        <webuijsf:button id="button1" style="font-size: 14px; height: 24px; left: 383px; top: 384px; position: absolute" text="Comprar ahora"/>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
