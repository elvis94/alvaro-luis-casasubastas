<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NuevoCliente
    Created on : 28-abr-2009, 1:15:34
    Author     : 
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Nuevo cliente">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                    <webuijsf:link rel="shortcut icon" url="/resources/favicon.ico"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="formularioRegistro">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:imageHyperlink actionExpression="#{NuevoCliente.imghlSubPublicas_action}" id="imghlSubPublicas"
                                    imageURL="/resources/icon_auction.gif" immediate="true"/>
                                <webuijsf:imageHyperlink actionExpression="#{NuevoCliente.imghlIniciarSesion_action}" id="imghlIniciarSesion"
                                    imageURL="/resources/inicio.PNG" immediate="true"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <table border="0" cellpadding="1" cellspacing="10" style="margin-left: auto; margin-right: auto">
                            <tbody>
                                <tr></tr>
                                <tr></tr>
                                <tr>
                                    <td width="175px">
                                        <webuijsf:label for="txtUsuario" id="label1" text="Usuario:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtUsuario}" columns="40" id="txtUsuario" required="true" validatorExpression="#{NuevoCliente.txtUsuario_validate}"/>
                                        <webuijsf:message for="txtUsuario" id="message2" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 15px">
                                        <webuijsf:label for="passClave" id="label2" text="Contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField binding="#{NuevoCliente.passClave}" columns="40" id="passClave" required="true" validatorExpression="#{NuevoCliente.passClave_validate}"/>
                                        <webuijsf:message for="passClave" id="message3" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="passClaveRepetida" id="label3" text="Repita su contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField binding="#{NuevoCliente.passClaveRepetida}" columns="40" id="passClaveRepetida" required="true" validatorExpression="#{NuevoCliente.passClaveRepetida_validate}"/>
                                        <webuijsf:message for="passClaveRepetida" id="message1" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtEmail" id="label4" text="e-mail:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtEmail}" columns="40" id="txtEmail" required="true" validatorExpression="#{NuevoCliente.txtEmail_validate}"/>
                                        <webuijsf:message for="txtEmail" id="message4" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="listPais" id="label5" text="Pais:"/>
                                    </td>
                                    <td>
                                        <webuijsf:dropDown binding="#{NuevoCliente.listPais}" id="listPais" items="#{ApplicationBean1.paises}" required="true" width="170"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtLocalidad" id="label6" text="Localidad:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtLocalidad}" columns="40" id="txtLocalidad" required="true" validatorExpression="#{NuevoCliente.txtLocalidad_validate}"/>
                                        <webuijsf:message for="txtLocalidad" id="message6" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtCalle" id="label7" text="Calle:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtCalle}" columns="40" id="txtCalle" required="true" validatorExpression="#{NuevoCliente.txtCalle_validate}"/>
                                        <webuijsf:message for="txtCalle" id="message7" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtNombre" id="label8" text="Nombre:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtNombre}" columns="40" id="txtNombre" required="true" validatorExpression="#{NuevoCliente.txtNombre_validate}"/>
                                        <webuijsf:message for="txtNombre" id="message8" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtApellidos" id="label9" text="Apellidos:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{NuevoCliente.txtApellidos}" columns="40" id="txtApellidos" validatorExpression="#{NuevoCliente.txtApellidos_validate}"/>
                                        <webuijsf:message id="message5" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:button actionExpression="#{NuevoCliente.btRegistrar_action}" binding="#{NuevoCliente.btRegistrar}"
                                            id="btRegistrar" primary="true" style="font-size: 11px; height: 23px; margin-right: 5px" text="Registrarse"/>
                                        <webuijsf:button actionExpression="#{NuevoCliente.btBorrar_action}" binding="#{NuevoCliente.btBorrar}" id="btBorrar"
                                            immediate="true" style="font-size: 11px; height: 23px" text="Borrar todos los campos"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:staticText binding="#{NuevoCliente.outText}" id="outText" style="color: #000066; font-family: Arial,Helvetica,sans-serif; font-size: 14px; font-weight: bold"/>
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
