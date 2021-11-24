/* 26. Obten todos los datos de los empleados que esten a partir de la J, inclusive.
NOTA: Para ello usa la funcion left de PLMySql   */

SELECT EMPNO, ENAME, JOB, MGR, date_format(hiredate, "%d/%m/%y") HIREDATE, SAL, ifnull(comm,"") COMM, DEPTNO
FROM empleados
WHERE ASCII(ENAME) >= ASCII('J');




