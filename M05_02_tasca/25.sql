/* 25. Hallar el codigo, salario y comision de los empleados cuyo codigo sea mayor que 7500.*/

SELECT empno, sal, ifnull(comm,"")COMM
FROM empleados
WHERE empno>7500;