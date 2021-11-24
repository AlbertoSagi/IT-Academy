/* 49. Ordena los empleados por su codigo de departamento, y luego de manera descendente por su numero de empleado.*/

SELECT EMPNO, ENAME, JOB, MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
ORDER BY DEPTNO, EMPNO DESC; 