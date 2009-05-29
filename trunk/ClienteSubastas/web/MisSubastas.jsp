<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : MisSubastas
    Created on : 28-abr-2009, 1:15:58
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Mis Subastas">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{MisSubastas.hlSubastasPublicas_action}" id="hlSubastasPublicas" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{MisSubastas.hlNuevaSubasta_action}" id="hlNuevaSubasta" text="[Nueva Subasta]"/>
                                <webuijsf:hyperlink actionExpression="#{MisSubastas.hlCerrarSesion_action}" id="hlCerrarSesion" text="[Cerrar Sesión]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <div align="center">
                            <webuijsf:table augmentTitle="false" clearSortButton="true" id="table1" paginateButton="true" paginationControls="true"
                                sortPanelToggleButton="true" title="Mis subastas" width="762">
                                <webuijsf:tableRowGroup id="tableRowGroup1" rows="6" sourceData="#{MisSubastas.listadoMisSubastas}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="nombre" id="tableColumn1" sort="nombre">
                                        <webuijsf:hyperlink actionExpression="#{MisSubastas.hlDetalles_action}" id="hlDetalles" text="#{currentRow.value['nombre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="categoria" id="tableColumn2" sort="categoria">
                                        <webuijsf:staticText id="staticText1" text="#{currentRow.value['categoria']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="fechaCierre" id="tableColumn4" sort="fechaCierre">
                                        <webuijsf:staticText id="staticText3" text="#{currentRow.value['fechaCierre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="pujaActual" id="tableColumn5" sort="pujaActual">
                                        <webuijsf:staticText id="staticText4" text="#{currentRow.value['pujaActual']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="pujadorActual" id="tableColumn6" sort="pujadorActual">
                                        <webuijsf:staticText id="staticText5" text="#{currentRow.value['pujadorActual'].usuario}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="Acciones" align="center" id="tableColumn7" valign="middle">
                                        <webuijsf:button id="borrar" text="Borrar" actionExpression="#{MisSubastas.borrar_action}" />
                                        <webuijsf:button id="modificar" text="Modificar" actionExpression="#{MisSubastas.modificar_action}" />
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                        </div>
                        <br/>
                        <div align="center">
                            <webuijsf:table augmentTitle="false" id="table2" paginateButton="true" paginationControls="true" title="Subastas que lidero" width="508">
                                <webuijsf:tableRowGroup id="tableRowGroup1" rows="6" sourceData="#{MisSubastas.listadoMisSubastas}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="nombre" id="tableColumn1" sort="nombre">
                                        <webuijsf:hyperlink actionExpression="#{MisSubastas.hyperlink1_action}" id="hyperlink1" text="#{currentRow.value['nombre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="categoria" id="tableColumn2" sort="categoria">
                                        <webuijsf:staticText id="staticText1" text="#{currentRow.value['categoria']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="fechaCierre" id="tableColumn4" sort="fechaCierre">
                                        <webuijsf:staticText id="staticText3" text="#{currentRow.value['fechaCierre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="pujaActual" id="tableColumn5" sort="pujaActual">
                                        <webuijsf:staticText id="staticText4" text="#{currentRow.value['pujaActual']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="pujadorActual" id="tableColumn6" sort="pujadorActual">
                                        <webuijsf:staticText id="staticText5" text="#{currentRow.value['pujadorActual'].usuario}"/>
                                    </webuijsf:tableColumn>
                                </webuijsf:tableRowGroup>
                            </webuijsf:table>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
