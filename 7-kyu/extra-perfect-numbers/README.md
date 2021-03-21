# Extra Perfect Numbers (Special Numbers Series #7)
**Extra perfect number** is the number that **first** and **last** bits are **set bits**.

### Task
Given a positive integer N, return the extra perfect numbers in range from 1 to N.

### Notes
* Number passed is always Positive.
* Returned array/list should contain the extra perfect numbers in ascending order from lowest to highest.

### Input >> Output Examples
```java
extraPerfect(3)  ==>  return {1,3}
```
(1)10 =(1)2  
First and last bits as set bits.  
(3)10 = (11)2  
First and last bits as set bits.

```java
extraPerfect(7)  ==>  return {1,3,5,7}
```
(5)10 = (101)2  
First and last bits as set bits.  
(7)10 = (111)2  
First and last bits as set bits.