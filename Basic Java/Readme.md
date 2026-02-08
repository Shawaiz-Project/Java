# Java Console Applications – Academic Practice Repository

## 📘 Overview

This repository contains a collection of Java console-based applications developed for academic learning and programming practice.  
The projects focus on fundamental programming concepts including:

- Conditional statements
- User input handling
- Logical decision making
- Modular thinking
- Clean console output

All programs are written in **Java** and use standard input/output methods.

---

## 🧑‍🎓 Intended Audience

- Beginner Java programmers
- Computer Science students
- Programming fundamentals learners
- Academic assignments and practice work

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- `java.util.Scanner`
- Command Line Interface (CLI)

---

## 📂 Project Structure

Java/
│

├──CNIC_Info.java

├── Loan.java

├── Grade.java

├── Ticket.java

└── README.md


---

# 🔹 PROGRAM 1: CNIC Information Analyzer

## 📄 File Name
`CNICInfo_231980079.java`

---

## 📝 Program Description

This program analyzes a Pakistani CNIC number entered by the user and extracts meaningful information such as:

- Province
- Division
- Gender
- Card Expiry Year

It also validates whether the CNIC number is valid based on length and numeric rules.

---

## 🎯 Objectives

- Practice string handling
- Learn character manipulation
- Understand real-world data validation
- Apply modular programming using methods

---

## 🔍 CNIC Validation Rules

- CNIC must contain **exactly 13 digits**
- No dashes (`-`) allowed
- All characters must be numeric
- Invalid CNICs are rejected immediately

---

## 🧠 Logic Explanation

### Step 1: CNIC Validation
- Length check
- Character-by-character digit verification

### Step 2: Province Detection
- First digit determines province
- Uses predefined mapping

### Step 3: Division Detection
- Second digit checked for Gujranwala division (Punjab only)

### Step 4: Gender Detection
- Last digit:
  - Even → Female
  - Odd → Male

### Step 5: Expiry Year
- Calculated as:
Issue Year + 10


---

## ▶️ Sample Input

CNIC: 3310441234567
Issue Year: 2024


---

## ▶️ Sample Output

Province : Punjab
Division : Gujranwala
Gender : Male
Expire Year : 2034


---

# 🔹 PROGRAM 2: Loan Approval System

## 📄 File Name
`Loan.java`

---

## 📝 Program Description

This program evaluates loan approval eligibility based on:

- Annual income
- Credit score

It simulates a basic banking decision system.

---

## 🎯 Objectives

- Apply nested conditional logic
- Simulate real-world financial rules
- Improve decision-based programming skills

---

## 📊 Approval Criteria

### Approved:
- Credit Score > 700
- Income > 50,000

### Special Offer:
- Credit Score > 750
- Income > 50,000

### Approved with Co-Signer:
- Credit Score between 600–700
- Income > 40,000

### Rejected:
- Credit Score < 600
- Income < 40,000

---

## 🧠 Logic Flow

1. Read income
2. Read credit score
3. Apply conditions in priority order
4. Display decision message

---

## ▶️ Sample Output

Your approval is accepted.
You get a special offer.


---

# 🔹 PROGRAM 3: Grade Calculator

## 📄 File Name
`Grade.java`

---

## 📝 Program Description

This program calculates and displays a student’s grade based on their score.

---

## 🎯 Objectives

- Practice range-based conditions
- Learn academic grading logic
- Handle invalid input

---

## 📊 Grading System

| Score Range | Grade |
|------------|-------|
| 90+        | A     |
| 80–89      | B     |
| 70–79      | C     |
| 60–69      | D     |
| Below 60   | F     |

⭐ Bonus message for scores above 95

---

## ▶️ Sample Output

Your grade is 'A'
Excellent performance


---

# 🔹 PROGRAM 4: Ticket Price Calculator

## 📄 File Name
`Ticket.java`

---

## 📝 Program Description

This program calculates ticket price based on:

- Age
- Student status

---

## 🎯 Objectives

- Apply real-life pricing logic
- Use strings and conditionals
- Practice discounts and price adjustments

---

## 💰 Ticket Pricing Rules

| Age Group | Price |
|----------|-------|
| 0–12     | $5.00 |
| 13–17    | $8.00 |
| 18–64    | $12.00|
| 65+      | $7.00 |

🎓 Student Discount: $2

---

## ▶️ Sample Output

Price of the ticket is : $10.0


---

## ▶️ How to Compile & Run

javac FileName.java
java FileName


Example:
javac Ticket.java
java Ticket


---

## 🚀 Future Enhancements

- GUI version using JavaFX
- Exception handling
- Input validation
- Menu-driven main program
- File handling support

---

## 👨‍💻 Author

**Shawaiz**  
Java Programming Practice Projects

---

## 📄 License

This repository is intended for educational and academic use only.
