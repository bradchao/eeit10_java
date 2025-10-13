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








