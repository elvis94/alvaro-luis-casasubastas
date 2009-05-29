<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : IniciarSesion
    Created on : 18-may-2009, 17:28:48
    Author     : Louis
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Iniciar sesión">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <div>
                            <jsp:directive.include file="Cabecera.jspf"/>
                        </div>
                        <div align="center" style="font-size: 18px">
                            <webuijsf:panelGroup id="groupPanel1" separator=" " style="width: 100%">
                                <webuijsf:hyperlink actionExpression="#{IniciarSesion.hlSubastasPublicas_action}" id="hlSubastasPublicas" immediate="true" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{IniciarSesion.hlRegistrarse_action}" id="hlRegistrarse" immediate="true" text="[Registrarse]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <table border="0" cellpadding="1" cellspacing="10" style="margin-left: auto; margin-right: auto">
                            <tbody>
                                <tr></tr>
                                <tr></tr>
                                <tr>
                                    <td width="125px">
                                        <webuijsf:label for="txtUsuario" id="label1" text="Usuario:"/>
                                    </td>
                                    <td>
                                        <webuijsf:textField binding="#{IniciarSesion.txtUsuario}" columns="40" id="txtUsuario" required="true" validatorExpression="#{IniciarSesion.txtUsuario_validate}"/>
                                        <webuijsf:message for="txtUsuario" id="message2" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="height: 15px">
                                        <webuijsf:label for="passClave" id="label2" text="Contraseña:"/>
                                    </td>
                                    <td>
                                        <webuijsf:passwordField binding="#{IniciarSesion.passClave}" columns="40" id="passClave" required="true"/>
                                        <webuijsf:message for="passClave" id="message3" showDetail="false" showSummary="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="text-align: center">
                                        <webuijsf:button actionExpression="#{IniciarSesion.btLogin_action}" id="btLogin" primary="true" text="Iniciar sesión..."/>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="height: 45px; text-align: center">
                                        <webuijsf:staticText binding="#{IniciarSesion.outText}" id="outText" style="color: #000066; font-family: Arial,Helvetica,sans-serif; font-size: 12px; font-weight: bold"/>
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
