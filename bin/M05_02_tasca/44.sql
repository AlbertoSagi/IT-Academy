/* 44. Intenta resolver la pregunta anterior con un predicado simple, es decir, 
de forma que en la clausula WHERE no haya conectores logicos como AND, OR, etc. 
Si ayuda a resolver la pregunta, se puede suponer que el nombre del empleado tiene al menos cinco letras.*/

SELECT ENAME, JOB
FROM empleados
WHERE CONCAT(ENAME, JOB) REGEXP '^A.*MAN$';