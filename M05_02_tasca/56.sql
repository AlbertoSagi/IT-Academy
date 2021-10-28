/* 56. Sin conocer los resultados del ejercicio anterior, Â¿quienes reciben el 
salario mas alto y el mas bajo, y a cuanto ascienden estos salarios?*/

SELECT ENAME, SAL
FROM empleados
WHERE SAL= (SELECT max(SAL) 
FROM empleados) OR SAL = (SELECT min(SAL) 
FROM empleados);


