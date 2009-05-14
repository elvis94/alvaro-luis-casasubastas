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
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div align="center" style="margin-top: 24px;">
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
                                        <webuijsf:staticText id="staticText3" text="#{currentRow.value['nombre']}"/>
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
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
