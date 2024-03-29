<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : VerSubastas
    Created on : 28-abr-2009, 1:16:34
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Subastas online">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:link rel="shortcut icon" url="/resources/favicon.ico"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid;">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:imageHyperlink actionExpression="#{VerSubastas.imghlIniciarSesion_action}" binding="#{VerSubastas.imghlIniciarSesion}"
                                    id="imghlIniciarSesion" imageURL="/resources/inicio.PNG" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{VerSubastas.imghlRegistrarse_action}" binding="#{VerSubastas.imghlRegistrarse}"
                                    id="imghlRegistrarse" imageURL="/resources/icon_reg.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{VerSubastas.imghlMisSubastas_action}" binding="#{VerSubastas.imghlMisSubastas}"
                                    id="imghlMisSubastas" imageURL="/resources/icon_home.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{VerSubastas.imghlNuevaSubasta_action}" binding="#{VerSubastas.imghlNuevaSubasta}"
                                    id="imghlNuevaSubasta" imageURL="/resources/icon_sell.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{VerSubastas.imghlCerrarSesion_action}" binding="#{VerSubastas.imghlCerrarSesion}"
                                    id="imghlCerrarSesion" imageURL="/resources/cerrar.PNG" immediate="true"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <div align="center">
                            <webuijsf:table augmentTitle="false" clearSortButton="true" id="table1" paginateButton="true" paginationControls="true"
                                sortPanelToggleButton="true" title="Listado de subastas públicas" width="762">
                                <webuijsf:tableRowGroup id="tableRowGroup1" sourceData="#{VerSubastas.listadoPublico}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="Nombre" id="tableColumn3" sort="nombre">
                                        <webuijsf:hyperlink actionExpression="#{VerSubastas.hlDetalles_action}" id="hlDetalles" text="#{currentRow.value['nombre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Subastador" id="tableColumn2" sort="subastador">
                                        <webuijsf:staticText id="staticText2" text="#{currentRow.value['subastador'].usuario}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Categoría" id="tableColumn4" sort="categoria">
                                        <webuijsf:staticText id="staticText4" text="#{currentRow.value['categoria']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Fecha de cierre" id="tableColumn6" sort="fechaCierre">
                                        <webuijsf:staticText id="staticText6" text="#{currentRow.value['fechaCierre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Última puja" id="tableColumn5" sort="pujaActual">
                                        <webuijsf:staticText id="staticText5" text="#{currentRow.value['pujaActual']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Pujador actual" id="tableColumn7" sort="pujadorActual">
                                        <webuijsf:staticText id="staticText3" text="#{currentRow.value['pujadorActual'].usuario}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Precio de compra" id="tableColumn8" sort="precioCompra">
                                        <webuijsf:staticText id="staticText7" text="#{currentRow.value['precioCompra']}"/>
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                        </div>
                        <webuijsf:menu id="menu1" style="position: absolute; left: 264px; top: 120px"/>
                        <webuijsf:menu id="menu2" style="position: absolute; left: 264px; top: 264px"/>
                        <webuijsf:menu id="menu3" style="position: absolute; left: 312px; top: 240px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
