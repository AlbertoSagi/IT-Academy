/* 14. Obten los salarios y las comisiones de los empleados del departamento 30.*/

SELECT SAL, IFNULL(COMM,"" ) COMM
FROM empleados
WHERE DEPTNO = 30;
