/* 41. Obten el nombre, salario y la comision de los empleados que perciben 
un salario que esta entre la mitad de la comision y la propia comision.*/

SELECT ENAME, SAL, COMM
FROM empleados
WHERE SAL between COMM/2  AND COMM;