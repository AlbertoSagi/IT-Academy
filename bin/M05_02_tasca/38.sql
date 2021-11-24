/* 38. Lo mismo, pero para los empleados cuyo nombre tenga al menos cinco letras.*/

SELECT EMPNO, ENAME, JOB, MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
WHERE ENAME LIKE '_____%';