/*5. Obten el mismo resultado de la pregunta anterior, pero ahora ordenando sólo por deptno en sentido descendente:*/

SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO
FROM empleados
WHERE JOB = "CLERK"
ORDER BY deptno DESC;