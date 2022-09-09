var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let informacoes1 = lines.shift().split(" ");
let informacoes2 = lines.shift().split(" ");

let codigo1 = parseInt(informacoes1.shift());
let numero1 = parseInt(informacoes1.shift());
let valor1 = parseFloat(informacoes1.shift());

let codigo2 = parseInt(informacoes2.shift());
let numero2 = parseInt(informacoes2.shift());
let valor2 = parseFloat(informacoes2.shift());

let pagar = (numero1 * valor1) + (numero2 * valor2);
console.log("VALOR A PAGAR: R$ " + pagar.toFixed(2));