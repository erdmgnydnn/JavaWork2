Select
ANSII
SELECT ContactName Adi,CustomerName MüsteriAdi ,City Sehir FROM Customers;
Select * from Customers where City = "London";
case insensitive
Select * from Products where categoryId=1 or categoryId=3
Select * from Products where categoryId=1 or Price>=10 
select * from Products order by CategoryID,ProductName
select * from Products order by Price --desc asc  -- ascending --descending
select * from Products where categoryId=1 order by Price desc 
select count (*) from Products where CategoryId=2
select count (*) from Products where CategoryId=2
select categoryID, count (*) from products group by CategoryID
select categoryID, count (*) from products group by CategoryID having count (*)<10
select categoryID, count (*) from products where Price >20 group by CategoryID having count (*)<10
select  Products.ProductID,Products.ProductName,Products.Price,Categories.CategoryName
from Products  inner join Categories
on Products.CategoryID=Categories.CategoryID
select  Products.ProductID,Products.ProductName,Products.Price,Categories.CategoryName
from Products  inner join Categories
on Products.CategoryID=Categories.CategoryID
where Products.Price>10
select * from Products p left join OrderDetails od
on p.ProductID=od.ProductID
select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null