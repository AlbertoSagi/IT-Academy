/* 30. Muestra el nombre de los empleados que, teniendo un salario inferior 
a 1000, no tengan como jefe al empleado cuyo codigo es 7698.*/

SELECT ENAME
FROM empleados
WHERE sal<1000 AND MGR!=7698;