/* 46. Suponiendo que el a~no proximo la subida del sueldo total de cada empleado sera del 60 %, 
y el siguiente del 70 %, halla los nombres y el salario total actual, del a~no proximo y del 
siguiente, de cada empleado. Indique ademas con SI o NO, si el empleado tiene comision. */

SELECT ENAME, (
		CASE
			WHEN COMM > 0 THEN 'YES'
			WHEN COMM = 0 THEN 'NO'
			WHEN COMM IS NULL THEN 'UNKNOWN'
		END
	) AS COMM,
	IFNULL(SAL+COMM, SAL) AS SALARIO_TOTAL,
	IFNULL(SAL+COMM, SAL)*1.06 AS '6%',
	IFNULL(SAL+COMM, SAL)*1.07 AS '7%'
FROM empleados
ORDER BY ENAME;
