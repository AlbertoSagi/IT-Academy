/*1. Obtener todos los datos de todos los empleados.*/
SELECT DEPTNO, EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, IFNULL(COMM,"" ) COMM 
FROM empleados;
