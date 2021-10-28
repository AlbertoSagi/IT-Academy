/* 42. Obten el nombre, salario y la comision de los empleados que perciben 
un salario complementario al caso 41: que sea superior a la comision o inferior a la mitad de la comision.*/

SELECT ENAME, SAL, COMM
FROM empleados
WHERE SAL>COMM OR SAL<COMM/2;