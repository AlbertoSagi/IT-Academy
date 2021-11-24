/* 51. Obten el salario mas alto de la empresa, el total destinado a 
comisiones y el numero de empleados.*/

SELECT max(SAL) AS MAX_SALARIO, sum(COMM) AS SUMA_COMISIONES, count(EMPNO) AS COUNT
FROM empleados; 
