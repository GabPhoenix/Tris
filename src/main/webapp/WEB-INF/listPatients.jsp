<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.models.PacienteModel" %>
<% ArrayList<PacienteModel> lista = (ArrayList<PacienteModel>) request.getAttribute("pacientes");%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List</title>

    <!-- page icon -->
    <link rel="icon" type="image/png" href="../static/img/tris-logo-blue.png">

    <!-- link css  -->
    <link rel="stylesheet" href="../static/css/list.css">

    <!-- javascript  -->
    <script src="../static/js/index.js"></script>

    <!-- fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Fira+Code:wght@300;400;500&family=League+Spartan:wght@100;200;300&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;1,100;1,300;1,400&family=Ubuntu:wght@300&display=swap" rel="stylesheet"> 

</head>
<body>
    <main>
        <!--  pt-br
        JSP
        arquivo para receber a lista de pacientes
        Na listagem ser� passado
        (COR DO QUADRO) Nome - cpf - data de nascimento - sus - quadro de sa�de -
        descri��o do quadro - email  
        link para editar 
        link para remover 
     -->
        <h1>
            Lista de pacientes
        </h1>
        <table>
            <colgroup>
                <col class="cor">
                <col class="nome">
                <col class="cpf">
                <col class="nascimento">
                <col class="sus">
                <col class="quadro">
                <col class="descri��o">
                <col class="email">
            </colgroup>
            <thead>
                <tr>
                    <th>COR</th>
                    <th>Nome</th>
                    <th>Cpf</th>
                    <th>data de nascimento</th>
                    <th>SUS</th>
                    <th>Quadro</th>
                    <th>Descri��o</th>
                    <th>Email</th>
                    <th>Editar</th>
                    <th>Remover</th>
                </tr>
            </thead>
            <tbody>
    			<%for(int i=0; i<lista.size(); i++){ %>
                <tr class="list_of_patients">
                    <td class="cor_triagem">
                    </td>
                    <td>
                    <%=lista.get(i).getNome()%>
                    </td>
                    <td>
                    <%=lista.get(i).getCpf()%>
                    </td>
                    <td>
                    <%=lista.get(i).getSus()%>
                    </td>
                    <td class="quadro_triagem">
                    <%=lista.get(i).getQuadro()%>
                    </td>
                    <td>
                    <%=lista.get(i).getDescricao()%>
                    </td>
                    <td>
                    <%=lista.get(i).getEmail()%>
                    </td>
                    <td class="editar_triagem"><a href="#?action=update&id=<%=lista.get(i).getId()%>">editar</a></td>
                    <td class="remover_triagem"><a href="#?action=delete&id=<%=lista.get(i).getId()%>">remover</a></td>
                <%}%>
                </tr>
            </tbody>
        </table>
        <button action="list_patients">Listar pacientes</button>
    </main>
     <!-- Footer -->
   <footer class="about" id="about" onclick="indexAccessRedirect();">
    <div class="logo-div">
        <div class="logo-img">
            <img src="../static/img/tris-logo.png" alt="Tris Hospitalar Triage - Logo">
        </div>
        <div class="logo-text">
            <h1>Tris</h1>
        </div>
    </div>
    <div class="about-devs">
        <i class="fa-brands fa-github"></i>
        <a href="https://github.com/Clary04">Clarissa Vanderley</a>
        <a href="https://github.com/GabPhoenix">Gabriel Carvalho</a>
        <p>all rights reserved <span>&reg;</span></p>
    </div>

</footer>
<!-- end footer section -->

</body>
</html>