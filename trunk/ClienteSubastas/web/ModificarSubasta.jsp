<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : ModificarSubasta
    Created on : 28-abr-2009, 1:19:32
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Modificar subasta">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{ModificarSubasta.hlSubastasPublicas_action}" id="hlSubastasPublicas" immediate="true" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{ModificarSubasta.hlMisSubastas_action}" id="hlMisSubastas" immediate="true" text="[Mis Subastas]"/>
                                <webuijsf:hyperlink actionExpression="#{ModificarSubasta.hlNuevaSubasta_action}" id="hlNuevaSubasta" immediate="true" text="[Nueva Subasta]"/>
                                <webuijsf:hyperlink actionExpression="#{ModificarSubasta.hlCerrarSesion_action}" id="hlCerrarSesion" immediate="true" text="[Cerrar Sesión]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <div align="center">
                            <webuijsf:messageGroup id="messageGroup1" style="margin-left: auto; margin-right: auto"/>
                        </div>
                        <br/>
                        <table border="0" cellpadding="1" cellspacing="10" style="margin-left: auto; margin-right: auto">
                            <tbody>
                                <tr>
                                    <td width="175px">
                                        <webuijsf:label id="label1" text="Nombre del artículo:"/>
                                    </td>
                                    <td>
                                        <webuijsf:staticText binding="#{ModificarSubasta.txtNombre}" id="txtNombre"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 45px">
                                        <webuijsf:label for="txtDescripcion" id="label2" text="Descripción:"/>
                                        <br/>
                                        <webuijsf:label id="label6" labelLevel="3" style="font-size: 10px; font-style: italic" text="Se permite código html"/>
                                    </td>
                                    <td>
                                        <webuijsf:textArea binding="#{ModificarSubasta.txtDescripcion}" columns="33" id="txtDescripcion" required="true"
                                            rows="4" validatorExpression="#{ModificarSubasta.txtDescripcion_validate}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label3" text="Categoría:"/>
                                    </td>
                                    <td>
                                        <webuijsf:dropDown binding="#{ModificarSubasta.txtCategoria}" id="txtCategoria" items="#{ApplicationBean1.categorias}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label4" text="Precio inicial:"/>
                                    </td>
                                    <td>
                                        <webuijsf:staticText binding="#{ModificarSubasta.txtPrecio}" id="txtPrecio"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label7" text="Puja actual:"/>
                                    </td>
                                    <td>
                                        <webuijsf:staticText binding="#{ModificarSubasta.txtPuja}" id="txtPuja"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label5" text="Fecha de vencimiento:"/>
                                    </td>
                                    <td>
                                        <webuijsf:staticText binding="#{ModificarSubasta.txtFecha}" id="txtFecha"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:button actionExpression="#{ModificarSubasta.bModificar_action}" id="bModificar" primary="true"
                                            style="font-size: 11px; height: 23px; margin-right: 5px" text="Modificar subasta"/>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
