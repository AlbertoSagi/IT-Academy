/* 24. Obten una lista de nombres de empleados y sus salarios, de forma que en 
la salida aparezca en todas las filas \Nombre:" y \Salario:" antes del respectivo campo. */

SELECT concat("Nombre: ", ename) AS Nombre, concat("Salario: ", sal) AS Salario
FROM empleados;
