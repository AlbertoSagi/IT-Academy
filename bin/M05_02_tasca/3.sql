/*3. Obtener todos los datos de los administrativos (su trabajo es, en ingles, 'CLERK').*/
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO
FROM empleados
WHERE JOB = "CLERK";


