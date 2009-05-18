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
                                <webuijsf:hyperlink actionExpression="#{NuevoCliente.hlSubastasPublicas_action}" id="hlSubastasPublicas" text="[Subastas Públicas]"/>
                                <webuijsf:hyperlink actionExpression="#{NuevoCliente.hlIniciarSesion_action}" id="hlIniciarSesion" text="[Iniciar Sesión]"/>
                            </webuijsf:panelGroup>
                        </div>
                        <hr/>
                        <br/>
                        <webuijsf:textField id="textField1" label="Usuario"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
