Note: "\|"" means simply "|", it's written like that to avoid being confused with the table.

Line Number | a            | i | b            | c            | j | Loop Condition (T/F) | Output
:----------:|:------------:|:-:|:------------:|:------------:|:-:|:--------------------:|:-----:
1           | 1, 3, 5, 7   |   |              |              |   |                      |       
2           |              |   |              |              |   |                      | Original array:     
3/11        |              |   |              | 1, 3, 5, 7   |   |                      |   
12          |              | 0 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 1
12          |              | 1 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 3
12          |              | 2 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 5
12          |              | 3 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 7
12          |              | 4 |              |              |   |         F            |   
14          |              |   |              |              |   |                      | \n
4           |              |   |              |              |   |                      | \n
5           |              |   |              |              |   |                      | Modified array:  
6/8         |              |   | 1, 3, 5, 7   |              |   |                      | 
9           |              |   |              |              | 0 |         T            | 
10          |              |   | 1, 3, 5, 7   |              |   |                      | 
9           |              |   |              |              | 1 |         T            | 
10          |              |   | 1, 9, 5, 7   |              |   |                      | 
9           |              |   |              |              | 2 |         T            | 
10          |              |   | 1, 9, 25, 7  |              |   |                      | 
9           |              |   |              |              | 3 |         T            | 
10          |              |   | 1, 9, 25, 49 |              |   |                      | 
9           |              |   |              |              | 4 |         F            | 
6 (result)  | 1, 9, 25, 49 |   |              |              |   |                      | 
7/11        |              |   |              | 1, 9, 25, 49 |   |                      |   
12          |              | 0 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 1
12          |              | 1 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 9
12          |              | 2 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 25
12          |              | 3 |              |              |   |         T            |   
13          |              |   |              |              |   |                      | \| 49
12          |              | 4 |              |              |   |         F            |   
14          |              |   |              |              |   |                      | \n