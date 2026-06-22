# Flowcharts & Pseudocodes

## Topics :

1. [What are Flowcharts ?](#flowcharts-)
2. [Flowchart Components](#components-)
3. [Sum of 2 Numbers](#1-sum-of-2-numbers-)
4. [Calculate Simple Interest](#2-calculate-simple-interest-)
5. [Max of 3 Numbers](#3-max-of-3-numbers-)
6. [Find if a Number is Prime or not](#4-find-if-a-number-is-prime-or-not-)
7. [Sum of first N natural numbers](#5-sum-of-first-n-natural-numbers-)
8. [Practice Questions](PracticeQuestions.md)

---

### Flowcharts :

- Diagrams to represent solutions of problems
- Solution → Small Parts → Logically Arranged
- Eg. Problem : Make Tea  
Solution : 

```mermaid
graph TD 
A([START]) --> B[/Bowl with Water/]
B --> C[Gas Stove ON] 
C --> D[/Add Sugar, Tea leaves, Milk, etc./]
D --> E[Boil]
E --> F[Gas stove OFF]
F --> G[/Tea Ready/]
G --> H([END])
```

---

### Components :

| Shape Name    | Flowchart Meaning                             | Visual Symbol  |
| :------------ | :--------------------                         | :-----------:  |
| Oval / Pill   | Start / End Points                            | ⬭              |
| Parallelogram | Input / Output Data                           | ▱              |
| Rectangle     | Process / Calculation                         | ▭              |
| Diamond       | Decision / Condition                          | ◇              |
| Arrows        | Direction of Flow (Connects other components) | → / ↓          |

---

### Pseudocodes :

- Solutions written in English

---

**Logic for Solving any Problem : Know its Inputs & Outputs**

---

### Examples :

#### 1. Sum of 2 Numbers :

- Inputs : Numbers A & B
- Output : Sum of A & B

**Flowchart :**
```mermaid
graph TD

A([START]) --> B[/Input A & B/]
B --> C[Calculate Sum = A + B]
C --> D[/Print Sum/]
D --> E([END])
```

**Pseudocode :**
```text
1. Start
2. Input A & B
3. Calculate Sum = A + B
4. Print Sum 
5. End
```

---

#### 2. Calculate Simple Interest :

- Inputs : Principal P, Rate R, Time T
- Output : Simple Interest (SI) = (PxRxT)/100

```mermaid
graph TD

A([START]) --> B[/Input P, R & T/]
B --> C["Calculate SI = (PxRxT)/100"]
C --> D[/Print SI/]
D --> E([END])
```

**Pseudocode :**
```text
1. Start
2. Input P, R & T
3. Calculate SI = (PxRxT)/100
4. Print SI
5. End
```

---

#### 3. Max of 3 Numbers :

- Inputs : Numbers A, B & C
- Output : Max of 3 numbers

**Flowchart :**
```mermaid 
graph TD
A([START]) --> B[/Input A, B & C/]
B --> C{Is A > B ?}

C -- Yes --> D{Is A > C ?}
D -- Yes --> F[/Print A is Max/]
D -- No --> G[/Print C is Max/]

C -- No --> E{Is B > C ?}
E -- Yes --> H[/Print B is Max/]
E -- No --> G

F --> I([END])
G --> I
H --> I

```
 
**Pseudocode :**
```text
1. Start
2. Input A, B & C
3. Is A > B?  
    3.1 If A > C do  
        3.1.1 Print A is Max  
    3.2 Else  
        3.2.1 Print C is Max
4. Else  
    4.1 If B > C do  
        4.1.1 Print B is Max  
    4.2 Else  
        4.2.1 Print C is Max
5.  End
```

---

#### 4. Find if a number is Prime or not :

- Input : Number N
- Output : Prime or Not Prime

**Prime : 2 Factors (1 & No. itself)**  
**Non-Prime : More than 2 factors**

Logic : For Non-Prime, divide N by 2 to (N-1), if N % 2 upto (N-1) equals 0 then N is not Prime ( % → Modulo → Gives Remainder )  
Eg. 6   
- 6 % 2 = 0 --> Not Prime
- 6 % 3 = 0
- 6 % 4 = 2
- 6 % 5 = 1  
6 is not Prime  

**Remember : This approach is simple and useful for small numbers but for big numbers, it can be further optimised. <br> Time Complexity : O(N)** 

**Optimised Version : Instead of using (div < N) condition which will check all the numbers from 2 to till (N-1), use (div * div <= N) which will check till the root of N. <br> Time Complexity : O($\sqrt{N}$)**

**Flowchart :**
```mermaid
graph TD

A([START]) --> B[/Input N/]
B --> C{Is N < 2 ?}

%% Create a dedicated 'Not Prime' box for the top check
C -- Yes --> H1[/Print N is not Prime/]

C -- No --> D[Let div = 2]
D --> E{Is div * div <= N ?}

E -- No --> F[/Print N is Prime/]
E -- Yes --> G{Is N % div == 0 ?}

%% Create a dedicated 'Not Prime' box for the loop check
G -- Yes --> H2[/Print N is not Prime/]

G -- No --> I[div = div + 1]
I --> E

%% Merge everything at the END
F --> J([END])
H1 --> J
H2 --> J
```

**Pseudocode :**
```text
1. Start
2. Input N
3. If N < 2  
    3.1 Print N is not Prime  
    3.2 End
4. Let div = 2
5. While (div * div <= N) do 
    5.1 If (N % div == 0)                             
        5.1.1 Print N is not Prime  
        5.1.2 End
    5.2 Else
        5.2.1 div = div + 1
6. Print N is Prime
7. End
---
NOTE : While loop - runs till the condition is true (Use when you don't know the number of iterations)
```

---

#### 5. Sum of first N natural numbers :

- Input : Number N
- Output : Sum from 1 to N

**Solution 1 :**

**Flowchart :**
```mermaid
graph TD 

A([START]) --> B[/Input Number N/]
B --> C["Sum = (Nx(N+1)) / 2"]
C --> D[/Print Sum/]
D --> E([END])
```

**Algorithm :**
```text 
1. Start
2. Input N
3. Calculate Sum = (Nx(N+1))/2
4. Print Sum 
5. End
```

---

**Solution 2 :**

**Flowchart :**
```mermaid
graph TD

A([START]) --> B[/Input N/]
B --> C[Let val = 1, sum = 0]
C --> D{Is val <= N ?}
D -- No --> F[/Print sum/]
D -- Yes --> E[sum = sum + val <br/> val = val + 1]
E --> D
F --> H([END])
```

**Pseudocode :**
```text
1. Start
2. Input N
3. let val = 1, sum = 0
4. While val <= N do 
    4.1 sum = sum + val
    4.2 val = val + 1
5. Print sum
6. End
```

---