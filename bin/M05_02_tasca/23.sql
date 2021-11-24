/* 23. Halla los empleados que no tienen comision, o que la tengan menor o igual que el 25% de su salario.*/

SELECT ename
FROM empleados
WHERE COMM IS NULL OR COMM<=SAL*0.25;
