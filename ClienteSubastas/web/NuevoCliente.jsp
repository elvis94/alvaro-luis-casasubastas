<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : NuevoCliente
    Created on : 28-abr-2009, 1:15:34
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Nuevo cliente">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="formularioRegistro">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{NuevoCliente.hlSubastasPublicas_action}" id="hlSubastasPublicas" immediate="true" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{NuevoCliente.hlIniciarSesion_action}" id="hlIniciarSesion" immediate="true" text="[Iniciar Sesión]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <table border="0" cellpadding="1" cellspacing="10" style="margin-left:auto;margin-right:auto" width="800">
                            <tbody>
                                <tr>
                                    <td width="200px">
                                        <webuijsf:label for="txtUsuario" id="label1" text="Usuario:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="40" id="txtUsuario" required="true"/>
                                        <webuijsf:message for="txtUsuario" id="message2" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 15px">
                                        <webuijsf:label for="passClave" id="label2" text="Contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField columns="40" id="passClave" required="true"/>
                                        <webuijsf:message for="passClave" id="message3" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="passClaveRepetida" id="label3" text="Repita su contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField columns="40" id="passClaveRepetida" required="true" validatorExpression="#{NuevoCliente.passClaveRepetida_validate}"/>
                                        <webuijsf:message for="passClaveRepetida" id="message1" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtEmail" id="label4" text="e-mail:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="100" id="txtEmail" required="true"/>
                                        <webuijsf:message for="txtEmail" id="message4" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtPais" id="label5" text="Pais:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="30" id="txtPais" required="true"/>
                                        <webuijsf:message for="txtPais" id="message5" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtLocalidad" id="label6" text="Localidad:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="50" id="txtLocalidad" required="true"/>
                                        <webuijsf:message for="txtLocalidad" id="message6" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtCalle" id="label7" text="Calle:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="100" id="txtCalle" required="true"/>
                                        <webuijsf:message for="txtCalle" id="message7" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtNombre" id="label8" text="Nombre:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="60" id="txtNombre" required="true"/>
                                        <webuijsf:message for="txtNombre" id="message8" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label for="txtApellidos" id="label9" text="Apellidos:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="60" id="txtApellidos"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 15px; text-align: center">
                                        <webuijsf:button actionExpression="#{NuevoCliente.btRegistrar_action}" id="btRegistrar" primary="true" text="Registrarse"/>
                                        <webuijsf:button actionExpression="#{NuevoCliente.btBorrar_action}" id="btBorrar" immediate="true" text="Borrar todos los campos"/>
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
