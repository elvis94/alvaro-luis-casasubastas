<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NuevaSubasta
    Created on : 28-abr-2009, 1:19:01
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Nueva subasta">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{NuevaSubasta.hlSubastasPublicas_action}" id="hlSubastasPublicas" immediate="true" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{NuevaSubasta.hlMisSubastas_action}" id="hlMisSubastas" immediate="true" text="[Mis Subastas]"/>
                                <webuijsf:hyperlink actionExpression="#{NuevaSubasta.hlCerrarSesion_action}" id="hlCerrarSesion" immediate="true" text="[Cerrar Sesión]"/>
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
                                        <webuijsf:label for="txtNombre" id="label1" text="Nombre del artículo:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevaSubasta.txtNombre}" id="txtNombre" required="true" style="margin-left: 10px" validatorExpression="#{NuevaSubasta.txtNombre_validate}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 45px">
                                        <webuijsf:label for="txtDescripcion" id="label2" text="Descripción:"/>
                                        <br/>
                                        <webuijsf:label id="label6" labelLevel="3" style="font-size: 10px; font-style: italic" text="Se permite código html"/>
                                    </td>
                                    <td>
                                        <webuijsf:textArea binding="#{NuevaSubasta.txtDescripcion}" columns="33" id="txtDescripcion" required="true" rows="4"
                                            style="margin-left: 10px" validatorExpression="#{NuevaSubasta.txtDescripcion_validate}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label3" text="Categoría:"/>
                                    </td>
                                    <td>
                                        <webuijsf:dropDown binding="#{NuevaSubasta.txtCategoria}" id="txtCategoria" items="#{ApplicationBean1.categorias}" style="margin-left: 10px"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtPrecio" id="label4" text="Precio inicial:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevaSubasta.txtPrecio}" id="txtPrecio" required="true" style="margin-left: 10px" validatorExpression="#{NuevaSubasta.txtPrecio_validate}"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtFecha" id="label5" text="Fecha de vencimiento:"/>
                                    </td>
                                    <td>
                                        <webuijsf:calendar autoComplete="true" autoValidate="true" binding="#{NuevaSubasta.txtFecha}"
                                            dateFormatPattern="dd/MM/yyyy" id="txtFecha" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:button actionExpression="#{NuevaSubasta.bCrear_action}" id="bCrear" primary="true"
                                            style="font-size: 11px; height: 23px; margin-right: 5px" text="Crear subasta"/>
                                        <webuijsf:button actionExpression="#{NuevaSubasta.bBorrar_action}" id="bBorrar" immediate="true"
                                            style="font-size: 11px; height: 23px" text="Borrar los campos"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:staticText binding="#{NuevaSubasta.outText}" id="outText" style="color: #000066; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold"/>
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
