var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let id = lines.shift()
let horas = lines.shift()
let ganhophour = lines.shift()

let salario = (ganhophour * horas);

console.log("NUMBER = " + id);
console.log("SALARY = U$ " + salario.toFixed(2));
