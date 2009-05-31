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
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlSubPublicas_action}" id="imghlSubPublicas"
                                    imageURL="/resources/icon_home.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlMisSubastas_action}" id="imghlMisSubastas"
                                    imageURL="/resources/icon_auction.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlNuevaSubasta_action}" id="imghlNuevaSubasta"
                                    imageURL="/resources/icon_sell.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{DetallesSubasta.imghlCerrarSesion_action}" id="imghlCerrarSesion"
                                    imageURL="/resources/cerrar.PNG" immediate="true"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <table border="0" cellpadding="2" style="margin-left: auto; margin-right: auto;">
                            <tbody>
                                <tr>
                                    <td colspan="2">
                                        <webuijsf:staticText binding="#{DetallesSubasta.txtNombre}" id="txtNombre" style="font-family: Arial,Helvetica,sans-serif; font-size: 36px"/>
                                        <webuijsf:staticText binding="#{DetallesSubasta.txtID}" id="txtID" style="font-size: 18px"/>
                                        <webuijsf:staticText binding="#{DetallesSubasta.txtCategoria}" id="txtCategoria" style="font-family: 'Times New Roman',Times,serif; font-size: 24px"/>
                                        <hr/>
                                    </td>
                                </tr>
                                <tr>
                                    <td valign="top">
                                        <table border="0" cellspacing="3">
                                            <tbody>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText id="staticText3"
                                                            style="color: rgb(102, 102, 102); font-size: 14px; font-weight: bold" text="Detalles de la subasta:"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtFechaCreacion}" id="txtFechaCreacion"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtSubastador}" id="txtSubastador"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtFechaCierre}" id="txtFechaCierre" style="color: #660066; font-weight: bold"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtPrecioSalida}" id="txtPrecioSalida"/>
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
                                                        <webuijsf:staticText id="staticText1"
                                                            style="color: rgb(102, 102, 102); font-size: 14px; font-weight: bold" text="Estado actual de la subasta:"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtPujaActual}" id="txtPujaActual" style="font-size: 14px"/>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtPujadorActual}" id="txtPujadorActual" style="font-weight: bold"/>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtFechaPujaActual}" id="txtFechaPujaActual"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:textField binding="#{DetallesSubasta.txfNuevaPuja}" id="txfNuevaPuja" required="true"
                                                            style="height: 24px" validatorExpression="#{DetallesSubasta.txfNuevaPuja_validate}"/>
                                                        <webuijsf:button binding="#{DetallesSubasta.btPujar}" id="btPujar" primary="true"
                                                            style="font-size: 14px; font-weight: bold; height: 24px;" text="Pujar!"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:staticText binding="#{DetallesSubasta.txtPrecioCompra}" id="txtPrecioCompra" style="font-size: 14px"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <webuijsf:button binding="#{DetallesSubasta.btComprar}" id="btComprar" immediate="true"
                                                            style="font-size: 14px; height: 24px;" text="Comprar ahora"/>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <hr/>
                                        <webuijsf:staticText id="staticText2" style="color: rgb(102, 102, 102); font-size: 14px; font-weight: bold" text="Descripción del objeto:"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <webuijsf:textArea binding="#{DetallesSubasta.txaDescripcion}" columns="100" id="txaDescripcion" readOnly="true" rows="5"/>
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
