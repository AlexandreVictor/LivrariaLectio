<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<f:view>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<link type="text/css" rel="stylesheet" href="../bootstrap/estilo.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Cliente - Lectio</title>
	</head>
	<body>
		<jsp:include page="menu.jsp"></jsp:include>
		<a4j:form id="form" ajaxSubmit="true" ajaxSingle="true"
			styleClass="edit">
			<rich:messages fatalClass="mensagemErro" infoClass="mensagemInfo"
				errorClass="mensagemErro" warnClass="mensagemWarning"></rich:messages>
			<f:loadBundle basename="message" var="msg" />
			<tr>
				<td align="left"><rich:hotKey key="F9"
						handler="#{rich:element('botaoGravar')}.click()" />
					<p align="left">
						<a4j:commandButton action="#{clienteMB.gravar}" id="botaoGravar"
							value="Gravar" reRender="listalivro"></a4j:commandButton>
					</p></td>
			</tr>
			<rich:panel header="Cadastro">
				<h:panelGrid style="border:none;" columns="2">
					<rich:dataTable id="listaCarros" value="#{clienteMB.listaCliente}"
						var="itensPlc" columnClasses="dataTable">
						<h:column>
							<a4j:commandLink action="#{clienteMB.excluir}"
								reRender="listaCliente">
								<f:param value="#{itensPlc.codcliente}" name="codcliente" />
								  <h:graphicImage value="https://png.icons8.com/delete-bin/dusk/20/000000"
								 	style="border: none;" alt="Excluir"/>
							</a4j:commandLink>
						</h:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Nome" style="color: #325D82;"
									escape="false" />
							</f:facet>
							<h:inputText value="#{itensPlc.nome}" size="20" />
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Usuario" style="color: #325D82;" escape="false" />
							</f:facet>
							<h:inputText value="#{itensPlc.usuario}" size="20" />
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Senha" style="color: #325D82;"
									escape="false" />
							</f:facet>
							<h:inputText value="#{itensPlc.senha}" size="20" />
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="CPF" style="color: #325D82;"
									escape="false" />
							</f:facet>
							<h:inputText value="#{itensPlc.cpf}"></h:inputText>
						</rich:column>
						<rich:column>
							<f:facet name="header">
								<h:outputText value="Data Nascimento" style="color: #325D82;"
									escape="false" />
							</f:facet>
							<h:inputText value="#{itensPlc.datanascimento}"></h:inputText>
						</rich:column>
						<f:facet name="footer">
							<rich:columnGroup>
								<rich:column>
									<h:selectBooleanCheckbox value="" id="indSelecionado"
										disabled="true" />
								</rich:column>
								<rich:column>
									<h:inputText value="#{clienteMB.nome}" size="40" maxlength="35"
										id="nome" />
								</rich:column>
								<rich:column>
									<h:inputText value="#{clienteMB.usuario}" size="40"
										maxlength="35" id="usuario" />
								</rich:column>
								<rich:column>
									<h:inputText value="#{clienteMB.senha}" size="20" maxlength="11"
										id="senha" />
								</rich:column>
								<rich:column>
									<h:inputText value="#{clienteMB.cpf}" size="20"
										maxlength="11" id="cpf" />
								</rich:column>
								<rich:column>
									<h:inputText value="#{clienteMB.datanascimento}" size="20"
										maxlength="50" id="datanascimento"/>
								</rich:column>
								
							</rich:columnGroup>
						</f:facet>
					</rich:dataTable>
				</h:panelGrid>
			</rich:panel>
		</a4j:form>
	</body>
</f:view>
</html>