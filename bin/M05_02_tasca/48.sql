/* 48. Obten la informacion disponible de los empleados cuyo numero es uno de los 
siguientes: 7844, 7900, 7521, 7521, 7782, 7934, 7678 y 7369, pero que no sea uno 
de los siguientes: 7902, 7839, 7499 ni 7878. La sentencia no debe complicarse 
innecesariamente, y debe dar el resultado correcto independientemente de lo 
empleados almacenados en la base de datos.*/

SELECT EMPNO, ENAME, JOB, MGR, date_format(HIREDATE, '%d/%m/%y') HIREDATE, SAL, IFNULL(COMM,"" ) COMM, DEPTNO 
FROM empleados
WHERE EMPNO in (7844, 7900, 7521, 7521, 7782, 7934, 7678, 7369);