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
                                        <webuijsf:label id="label1" text="Usuario:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="40" id="txtUsuario" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label2" text="Contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField columns="40" id="passClave" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label3" text="Repita su contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField columns="40" id="passClaveRepetida" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label4" text="e-mail:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="100" id="txtEmail" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label5" text="Pais:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="30" id="txtPais" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label6" text="Localidad:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="50" id="txtLocalidad" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label7" text="Calle:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="100" id="txtCalle" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label8" text="Nombre:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField columns="60" id="txtNombre" required="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <webuijsf:label id="label9" text="Apellidos"/>
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
