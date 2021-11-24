/* 15. Idem, pero ordenado por comision.*/

SELECT SAL, COMM
FROM empleados
WHERE DEPTNO = 30
ORDER BY COMM;
