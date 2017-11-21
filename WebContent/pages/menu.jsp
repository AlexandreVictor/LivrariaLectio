<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://richfaces.org/sandbox/dock" prefix="dock"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="<c:url value='/estilos.css' />" rel="stylesheet" type="text/css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livraria - Lectio</title>
</head>
<f:subview id="menu">
	<body>
		<h:form>
		<h:graphicImage url="/imagens/header.png" width="100%"></h:graphicImage>
			<a4j:keepAlive beanName="menuMB" ajaxOnly="true"/>
			<table width="100%">
				<tr>
					<td><rich:toolBar binding="#{menuMB.menuBar}" /></td>
				</tr>
			</table>
			
		</h:form>
	</body>
</f:subview>
</html>