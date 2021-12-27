select
    id,
    min(if(month = 'Jan', revenue, null)) as Jan_Revenue,
    min(if(month = 'Feb', revenue, null)) as Feb_Revenue,
    min(if(month = 'Mar', revenue, null)) as Mar_Revenue,
    min(if(month = 'Apr', revenue, null)) as Apr_Revenue,
    min(if(month = 'May', revenue, null)) as May_Revenue,
    min(if(month = 'Jun', revenue, null)) as Jun_Revenue,
    min(if(month = 'Jul', revenue, null)) as Jul_Revenue,
    min(if(month = 'Aug', revenue, null)) as Aug_Revenue,
    min(if(month = 'Sep', revenue, null)) as Sep_Revenue,
    min(if(month = 'Oct', revenue, null)) as Oct_Revenue,
    min(if(month = 'Nov', revenue, null)) as Nov_Revenue,
    min(if(month = 'Dec', revenue, null)) as Dec_Revenue
from 
Department
group by id
order by id