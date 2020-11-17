<%-- 
    Document   : index
    Created on : 28/10/2020, 16:11:20
    Author     : diego
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Herois - Vingadores</title>
        <link rel="stylesheet" href="css/estilos.css">
     </head>
    <body>
        <img src="img/vingadores.jpg" alt="Imagem Vingadores" width="1900" height="380" no-repeat> 
        <h1 id="pergunta">Qual dos Vingadores é você?</h1>
        <form name="quiz" id="quiz" action="./herois" method="post">
            <div>
             <br/>
                <p id="questao1">1. Quem é você em uma festa de amigos?</p>
                <p><input type="radio" name="questao1" value="a" required>a) A pessoa que controla a música e agita a festa.</p>
                <p><input type="radio" name="questao1" value="b">b) Alguém entre os que estão dançando.</p>
                <p><input type="radio" name="questao1" value="c">c) Está sempre perto da mesa de comida.</p>
                <p><input type="radio" name="questao1" value="d">d) Está em casa, longe da festa.</p>
            </div>
            </br>
            <div>
                <p id="questao2">2. Em uma decisão difícil, com seus amigos, você:</p>
                <p><input type="radio" name="questao2" value="a" required>a) Faz o que é certo, acima de tudo.</p>
                <p><input type="radio" name="questao2" value="b">b) Decide em conjunto e faz o que todos acharem melhor.</p>
                <p><input type="radio" name="questao2" value="c">c) Calcula as alternativas e mostra para todo mundo onde há menos danos.</p>
                <p><input type="radio" name="questao2" value="d">d) Espera alguém decidir e vai na onda.</p>
            </div>
            </br>
            <div>
                <p id="questao3">3. Sua maior habilidade no meio da crise:</p>
                <p><input type="radio" name="questao3" value="a" required>a) Força.</p>
                <p><input type="radio" name="questao3" value="b">b) Lealdade.</p>
                <p><input type="radio" name="questao3" value="c">c) Pensamento Lógico.</p>
                <p><input type="radio" name="questao3" value="d">d) Abordagem criativa.</p>
            </div>
            </br>
            <div>
                <p id="questao4">4. Qual dessas frases se aplica mais a você?</p>
                <p><input type="radio" name="questao4" value="a" required>a) "Se eu tivesse oito horas para derrubar uma árvore, passaria seis afiando meu machado" (Abraham Linconl).</p>
                <p><input type="radio" name="questao4" value="b">b) "Mil vidas eu tivesse, mil vidas eu daria pela libertação da minha pátria" (Tiradentes).</p>
                <p><input type="radio" name="questao4" value="c">c) "Lutar pelo amor é bom, mas alcançá-lo sem luta é melhor" (William Shakespeare).</p>
                <p><input type="radio" name="questao4" value="d">d) "O verdadeiro homem mede a sua força quando se defronta com o obstáculo" (Antonie de Saint-Exupéry).</p>
            </div>
            </br>
            <div>
                <p id="questao5">5. Como se faz para que os outros realizem uma tarefa?</p>
                <p><input type="radio" name="questao5" value="a" required>a) Cria um passo a passo para a realização da tarefa.</p>
                <p><input type="radio" name="questao5" value="b">b) Explica a tarefa e apresenta os motivos pelos quais deveriam fazer.</p>
                <p><input type="radio" name="questao5" value="c">c) Dá ordem de forma firme e direta.</p>
                <p><input type="radio" name="questao5" value="d">d) Faz primeiro e chama para seguirem seu exemplo.</p>
            </div>
            </br>
            <div>
                <p id="questao6">6. Um colega seu está fazendo algo errado para prejudicar alguém. Você:</p>
                <p><input type="radio" name="questao6" value="a" required>a) Monta um plano para expôr o que o colega está fazendo de errado.</p>
                <p><input type="radio" name="questao6" value="b">b) Apronta algo para que ele se dê mal.</p>
                <p><input type="radio" name="questao6" value="c">c) Conta para alguém que é autoridade sobre ele.</p>
                <p><input type="radio" name="questao6" value="d">d) Confronta ele para tirar satisfações.</p>
            </div>
            </br>
            <div>
                <p id="questao7">7. Qual desses objetivos as outras pessoas usariam pra te descrever melhor?</p>
                <p><input type="radio" name="questao7" value="a" required>a) Forte.</p>
                <p><input type="radio" name="questao7" value="b">b) Inteligente.</p>
                <p><input type="radio" name="questao7" value="c">c) Sem medo.</p>
                <p><input type="radio" name="questao7" value="d">d) Habilidoso/a.</p>
            </div>
            </br>
            <div>
                <p id="questao8">8. Sua maior habilidade no meio da crise:</p>
                <p><input type="radio" name="questao8" value="a" required>a) Força.</p>
                <p><input type="radio" name="questao8" value="b">b) Lealdade.</p>
                <p><input type="radio" name="questao8" value="c">c) Pensamento Lógico.</p>
                <p><input type="radio" name="questao8" value="d">d) Abordagem criativa.</p>
            </div>
            <button id="botao">Resultado</button>
            </br>
        </form>
        <footer>
            <p id="rodape"> SISTEMAS PARA INTERNET</p>
            <p id="rodape">Atividade Prática - PROGRAMAÇÃO AVANÇADA</p>
            <p id="rodape">Desenvolvido por  Diego  Morais</p>
            <p id="rodape">2020</p>
        </footer>
    </body>
</html>
