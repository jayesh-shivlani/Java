# Practice Questions of Flowcharts & Pseudocodes

### 1. Calculate area of a circle

- Input : radius r
- Output : area of circle

**Flowchart :**
```mermaid
graph TD 

A([START]) --> B[/Input radius r/]
B --> C["area = (22*r*r)/7"]
C --> D[/Print area/]
D --> E([END])
```

**Pseudocode :**
```text
1. Start
2. Input radius r
3. area = (22*r*r)/7
4. Print area
5. End
```

---

### 2. Find the greatest from 2 Numbers

- Input : numbers A, B
- Output : Max of 2 numbers

**Flowchart :**
```mermaid
graph TD

A([START]) --> B[/Input numbers A, B/]
B --> C{Is A > B ?}

C -- Yes --> D[/Print A is max/]
D --> F([END])

C -- No --> E{Is A == B ?}

E -- Yes --> G[/Print A equals B/]
G --> F

E -- No --> H[/Print B is max/]
H --> F
```

**Pseudocode :**
```text
1. Start
2. Input numbers A, B
3. If A > B ? do
    3.1 Print A is max
4. else 
    4.1 If A == B ? do
        4.1.1 Print A equals B
    4.2 else Print B is max
5. End
```

---

### 3. Print the Even Numbers between 9 and 100

- Input : nothing
- Output : Even Numbers between 9 and 100

**Flowchart :**
```mermaid 
graph TD

A([START]) --> B[Let i = 10]
B --> C{Is i <= 100 ?}

C -- Yes --> D[/Print i/]
D --> E[i = i + 2]
E --> C

C -- No --> F([END])
```

**Pseudocode :**
```text 
1. Start
2. Let i = 10
3. While i <= 100 do
    3.1 Print i
    3.2 i = i + 2
4. End
```

---

### 4. Calculate the average from 25 exam scores

- Input : 25 exam scores
- Output : average of 25 exam scores

**Flowchart :**
```mermaid 
graph TD 

A([START]) --> B[Let sum = 0, i = 0]
B --> C{Is i < 25 ?}

C -- Yes --> D[/Enter exam score s/]
D --> E[sum = sum + s]
E --> F[i = i + 1]
F --> C

C -- No --> G[avg = sum / 25]
G --> H[/Print avg/]
H --> I([END])
```

**Pseudocode :**
```text 
1. Start
2. Let sum = 0, i = 0
3. While i < 25 do
    3.1 Enter exam score s 
    3.2 sum = sum + s
    3.3 i = i + 1
4. avg = sum / 25
5. Print avg
6. End
```

---