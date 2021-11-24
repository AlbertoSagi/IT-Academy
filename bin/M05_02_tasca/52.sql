/* 52. Halla los datos de los empleados cuyo salario es mayor que el del empleado de codigo 7934, ordenando por el salario.*/

SELECT EMPNO, ENAME, JOB, ifnull(MGR,"")MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
WHERE SAL>(SELECT SAL
FROM empleados
WHERE EMPNO=7934)
ORDER BY SAL;
