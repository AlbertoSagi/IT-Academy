/* 36. Para los empleados que tengan comision, obten sus nombres y el cociente entre 
su salario y su comision (excepto cuando la comision sea cero), ordenando el resultado por nombre.
*/

SELECT ENAME, SAL/COMM AS COCIENTE
FROM empleados
WHERE COMM IS NOT NULL AND COMM!=0
ORDER BY ENAME;