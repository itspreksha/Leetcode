select( 
select DISTINCT salary 
from Employee 
order by salary DESC
LIMIT 1 OFFSET 1)
AS SECONDHIGHESTSALARY;