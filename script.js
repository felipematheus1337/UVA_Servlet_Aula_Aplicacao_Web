/*Funções Java Script para o formulário - com Jquery*/

/*
 * A função LOAD abaixo pode também ser escrita das seguintes formas:
 *
 * jquery(document).ready(function(){
 *      //faça alguma coisa
 * });
 * ou
 *
 * $(document).ready(function(){
 *      //faça alguma coisa
 * });
 *
 *  OBS: caracter $ é utilizado como um modo bem curto de dizer jquery.
 *  Ou seja, $("p") é o mesmo que jquery("p").
 *
 */

/*Comandos que serão executados com a página for carregada*/
$(function(){
    $("#nome").blur(function(){
        if($("#nome").val().length < 10){
            alert("Tamanho inválido");
        }
        alert($("#preco").val());
    });

    $(".dinheiro").maskMoney({showSymbol:false, symbol:"R$", decimal:",", thousands:"."});
});





