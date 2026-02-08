# CNIC Information Analyzer (Java)

This Java program validates a Pakistani CNIC number and analyzes it to extract useful information such as province, division, gender, and card expiry year.

---

## 📌 Project Description

The CNIC Information Analyzer:
- Takes a CNIC number (without dashes)
- Checks whether it is valid (13 digits, numeric)
- Extracts information using CNIC rules
- Displays cardholder details in a readable format

This project is intended for **educational and practice purposes**.

---

## ✨ Features

- CNIC validation (length & numeric check)
- Province detection
- Division detection (Gujranwala)
- Gender identification
- Expiry year calculation (10 years after issue date)
- Simple console-based interaction

---

## 🛠️ Technologies Used

- Java
- `java.util.Scanner`

---

## 📂 File Information

- **File Name:** `CNICInfo_231980079.java`
- **Language:** Java
- **Type:** Console Application

---

## ▶️ How to Run the Program

### 1️⃣ Check Java Installation
java --version


### 2️⃣ Compile the Program
javac CNICInfo_231980079.java


### 3️⃣ Run the Program
java CNICInfo_231980079


---

## 🧪 Sample Input

Enter your CNIC number (without dashes):
3310441234567

Enter the year card issue date (e.g. 2024):
2024


---

## 📤 Sample Output

********* THE CARDHOLDER DETAILS ***********
Province : Punjab
Division : Gujranwala
Gender : Male
Expire Year : 2034


---

## ⚠️ Validation Rules

- CNIC must contain **exactly 13 digits**
- Only numeric characters are allowed
- Gender is determined from the **last digit**
- Expiry year is calculated as:
Issue Year + 10


---

## 🚀 Future Improvements

- Add support for all divisions
- Improve CNIC validation logic
- Add exception handling
- Convert to GUI application

---

## 👨‍💻 Author

**Shawaiz**  
Java CNIC Information Analyzer Project

---

## 📄 License

This project is created for learning and academic use.
