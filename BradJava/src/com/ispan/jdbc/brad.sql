SELECT Title, FirstName, LastName 
FROM `employees`
ORDER BY Title ASC, FirstName DESC
+--------------------------+-----------+-----------+
| Title                    | FirstName | LastName  |
+--------------------------+-----------+-----------+
| Inside Sales Coordinator | Laura     | Callahan  |
| Sales Manager            | Steven    | Buchanan  |
| Sales Representative     | Robert    | King      |
| Sales Representative     | Nancy     | Davolio   |
| Sales Representative     | Michael   | Suyama    |
| Sales Representative     | Margaret  | Peacock   |
| Sales Representative     | Janet     | Leverling |
| Sales Representative     | Anne      | Dodsworth |
| Vice President, Sales    | Andrew    | Fuller    |
+--------------------------+-----------+-----------+

Title   	FirstName   	LastName	
Inside Sales Coordinator	Laura	Callahan	
Sales Manager	Steven	Buchanan	
Sales Representative	Robert	King	
Sales Representative	Nancy	Davolio	
Sales Representative	Michael	Suyama	
Sales Representative	Margaret	Peacock	
Sales Representative	Janet	Leverling	
Sales Representative	Anne	Dodsworth	
Vice President, Sales	Andrew	Fuller	
-----------------------------------------------------------
SELECT Title, FirstName, LastName 
FROM `employees`
WHERE Title <> 'Sales Representative'
ORDER BY Title ASC, FirstName DESC;


Title   	FirstName   	LastName	
Inside Sales Coordinator	Laura	Callahan	
Sales Manager	Steven	Buchanan	
Vice President, Sales	Andrew	Fuller	
-----------------------------------------------------------
SELECT FirstName, LastName, Region FROM `employees` 
WHERE Region IS NOT NULL
-----------------------------------------------------------
SELECT ProductName, `UnitsInStock`, `UnitsOnOrder`,`ReorderLevel` 
FROM `products` 
WHERE UnitsInStock <= ReorderLevel
-----------------------------------------------------------
SELECT `EmployeeID`,`CustomerID`,`OrderID`,
`RequiredDate`,`ShippedDate`
FROM `orders` 
WHERE `ShippedDate` > `RequiredDate`
ORDER BY `CustomerID`
-----------------------------------------------------------
SELECT `OrderID`,`Freight`, `Freight`*1.1 FreightTotal
FROM `orders` 
WHERE `Freight` > 500
-----------------------------------------------------------
SELECT `City`, count(`EmployeeID`) numEmployees
FROM `employees`
GROUP BY `City`
HAVING numEmployees >= 2
-----------------------------------------------------------
SELECT ...
FROM 
WHERE
GROUP BY
HAVING
ORDER BY
LIMIT 
-----------------------------------------------------------
SELECT `ProductID`, SUM(`Quantity`) sum
FROM `orderdetails` 
GROUP BY `ProductID`
HAVING sum < 200
-----------------------------------------------------------
SELECT `CompanyName`,`ContactName`,`Phone` 
FROM `customers` 
WHERE `CustomerID` = (
    SELECT CustomerID 
    FROM orders
    WHERE OrderID = 10254
)
-------------------------------------
SELECT CompanyName FROM customers 
WHERE CustomerID IN (
    SELECT CustomerID FROM `orders`
    WHERE OrderDate BETWEEN '1997-01-01' AND '1997-12-31'
)
-------------------------------
SELECT `ProductName` FROM `products` 
WHERE `CategoryID` = (
    SELECT `CategoryID` 
    FROM `categories` 
    WHERE `CategoryName` = 'Seafood'
)
------------------------------------
SELECT o.EmployeeID, e.LastName, SUM(od.UnitPrice*od.Quantity) sum
FROM `orders` o
	JOIN employees e ON o.EmployeeID = e.EmployeeID
    JOIN orderdetails od ON o.OrderID = od.OrderID
GROUP BY o.EmployeeID
ORDER BY sum DESC

5 Buchanan 75567.750
------------------------------------
SELECT SUM(UnitPrice*Quantity) 
FROM orderdetails
WHERE OrderID IN (
    SELECT OrderID FROM `orders` 
    WHERE EmployeeID = 5
)
-----------------------------------


