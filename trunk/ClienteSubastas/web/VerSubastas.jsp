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
                <webuijsf:head id="head1" title="Subastas públicas">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid;">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{VerSubastas.hlIniciarSesion_action}" binding="#{VerSubastas.hlIniciarSesion}"
                                    id="hlIniciarSesion" text="[Iniciar Sesión]"/>
                                <webuijsf:hyperlink actionExpression="#{VerSubastas.hlRegistrarse_action}" binding="#{VerSubastas.hlRegistrarse}"
                                    id="hlRegistrarse" text="[Registrarse]"/>
                                <webuijsf:hyperlink actionExpression="#{VerSubastas.hlMisSubastas_action}" binding="#{VerSubastas.hlMisSubastas}"
                                    id="hlMisSubastas" text="[Mis Subastas]"/>
                                <webuijsf:hyperlink actionExpression="#{VerSubastas.hlNuevaSubasta_action}" binding="#{VerSubastas.hlNuevaSubasta}"
                                    id="hlNuevaSubasta" text="[Nueva Subasta]"/>
                                <webuijsf:hyperlink actionExpression="#{VerSubastas.hlCerrarSesion_action}" binding="#{VerSubastas.hlCerrarSesion}"
                                    id="hlCerrarSesion" text="[Cerrar Sesión]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <div align="center">
                            <webuijsf:table augmentTitle="false" clearSortButton="true" id="table1" paginateButton="true" paginationControls="true"
                                sortPanelToggleButton="true" title="Listado de subastas públicas" width="888">
                                <webuijsf:tableRowGroup id="tableRowGroup1" sourceData="#{VerSubastas.listadoPublico}" sourceVar="currentRow">
                                    <webuijsf:tableColumn headerText="id" id="tableColumn1" sort="id">
                                        <webuijsf:staticText id="staticText1" text="#{currentRow.value['id']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="subastador" id="tableColumn2" sort="subastador">
                                        <webuijsf:staticText id="staticText2" text="#{currentRow.value['subastador'].usuario}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="nombre" id="tableColumn3" sort="nombre">
                                        <webuijsf:hyperlink actionExpression="#{VerSubastas.hlDetalles_action}" id="hlDetalles" text="#{currentRow.value['nombre']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="categoria" id="tableColumn4" sort="categoria">
                                        <webuijsf:staticText id="staticText4" text="#{currentRow.value['categoria']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="pujaActual" id="tableColumn5" sort="pujaActual">
                                        <webuijsf:staticText id="staticText5" text="#{currentRow.value['pujaActual']}"/>
                                    </webuijsf:tableColumn>
                                    <webuijsf:tableColumn headerText="fechaCierre" id="tableColumn6">
                                        <webuijsf:staticText id="staticText6" text="#{currentRow.value['fechaCierre']}"/>
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
