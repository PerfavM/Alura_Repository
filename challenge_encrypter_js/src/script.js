/* Variables */
/* const textArea = document.querySelector(".text-area");
const mensaje = document.querySelector(".mensagge");*/
const copia = document.querySelector(".copy-text");
/* copia.style.display = "none" */
/* text Valid */
function validarTexto(){
  let textoEscrito = document.querySelector(".text-area").value;
  let validador = textoEscrito.match(/^[a-z]*$/);

  if(!validador || validador === 0) {
      alert("Solo son permitidas letras minúsculas y sin acentos")
      location.reload();
      return true;
  }
}
var encodedString;
function btnEncriptar(){
  var baseString=document.querySelector(".text-area").value;
  encodedString=window.btoa(baseString);
  document.querySelector(".mensagge").value=encodedString;
  baseString.value = "";
  /* copia.style.display = "block" */
}

function btnDesencriptar(){
  var descodedString=window.atob(encodedString);
  document.querySelector(".mensagge").value=descodedString;
}

/* function copy(){
  encodedString.select();
  navigator.clipboard.writeText(mensagge.value)
  mensagge.value = "";
  alert("Texto Copiado")
}  */
function copy() {
  let copyInput = document.querySelector('.mensagge');
  copyInput.select();
  document.execCommand("copy");
  alert("Texto Copiado")
}