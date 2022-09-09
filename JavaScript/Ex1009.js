var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nome = lines.shift();
let fixo = parseFloat(lines.shift());
let vendas = parseFloat(lines.shift());

let salario = fixo + (vendas * 0.15);
console.log("TOTAL = R$ " + salario.toFixed(2));