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
                        <table border="0" cellpadding="2" style="margin-left: auto; margin-right: auto;">
                            <tbody>
                                <tr>
                                    <td colspan="2">
                                        <webuijsf:staticText id="txtNombre" style="font-family: Arial,Helvetica,sans-serif; font-size: 36px" text="NOMBRE"/>
                                        <webuijsf:staticText id="txtID" text="(ID)"/>
                                        <webuijsf:staticText id="txtCategoria" text="CATEGORIA"/>
                                        <hr />
                                    </td>
                                </tr>
                                <tr>
                                    <td valign="top">
                                        <table border="0" cellspacing="3">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtFechaCreacion" text="FECHA CREACION"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtSubastador" text="SUBASTADOR"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtFechaCierre" text="FECHA CIERRE"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtPrecioSalida" text="PRECIO SALIDA"/>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </td>
                                    <td valign="top">
                                        <table border="0" cellspacing="3">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="staticText1" style="color: #666666; font-weight: bold" text="Estado actual de la subasta:"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtPujaActual" text="PUJA ACTUAL"/>
                                                        <webuijsf:staticText id="txtPujadorActual" text="PUJADOR ACTUAL"/>
                                                        <webuijsf:staticText id="txtFechaPujaActual" text="FECHA PUJA ACTUAL"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:textField id="txfNuevaPuja"/>
                                                        <webuijsf:button id="btPujar" primary="true" style="font-size: 14px; font-weight: bold; height: 24px;" text="Pujar!"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="txtPrecioCompra" text="PRECIO COMPRA"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:button id="btComprar" style="font-size: 14px; height: 24px;" text="Comprar ahora"/>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 15px">
                                        DESCRIPCIÓN
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
