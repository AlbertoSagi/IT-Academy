/* 39. Halla los datos de los empleados que, o bien su nombre empieza por A y su 
salario es superior a 1000, o bien reciben comision y trabajan en el departamento 30.*/

SELECT EMPNO, ENAME, JOB, MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
WHERE ENAME LIKE 'a%' AND SAL>1000 OR COMM !=0 AND DEPTNO=30;