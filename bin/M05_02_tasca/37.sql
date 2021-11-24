/* 37. Lista toda la informacion sobre los empleados cuyo nombre completo tenga exactamente 5 caracteres.*/

SELECT EMPNO, ENAME, JOB, MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
WHERE ENAME LIKE '_____';