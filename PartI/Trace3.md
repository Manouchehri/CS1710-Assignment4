Line Number                                           | cityList | i | Loop Condition (T/F) | Output
:---------:|:----------------------------------------:|:--------:|:-:|:--------------------:|:-------:
1          | "London"                                 |          |   |                      | 
2          | "London", "New York"                     |          |   |                      |    
3          | "London", "New York", "Paris"            |          |   |                      | 
4          |                                          |          |   |                      | Original Arraylist:
5          |                                          |          | 0 |         T            | 
6          |                                          |          |   |                      | London
5          |                                          |          | 1 |         T            | 
6          |                                          |          |   |                      | New York
5          |                                          |          | 2 |         T            | 
6          |                                          |          |   |                      | Paris
5          |                                          |          | 3 |         F            | 
7          | "Toronto", "New York", "Paris"           |          |   |                      | 
8          | "Toronto", "New York"                    |          |   |                      | 
9          | "Toronto", "New York", "Hong Kong"       |          |   |                      | 
10         | "Toronto", "New York", "Singapore"       |          |   |                      | 
11         |                                          |          |   |                      | Modified Arraylist:
           |                                          |          |   |                      | Toronto\nNew York\nSingapore\n