/*4. Idem, pero ordenado por el nombre.*/
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO
FROM empleados
WHERE JOB = "CLERK"
ORDER BY ename;
