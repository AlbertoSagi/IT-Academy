/* 27. Obten el salario, comision y salario total (salario+comision) de los empleados 
con comision, ordenando el resultado por numero de empleado.*/

SELECT SAL, ifnull(comm,"")COMM, SAL+COMM AS SALARIO_TOTAL
FROM empleados
WHERE COMM IS NOT NULL
ORDER BY EMPNO ASC;