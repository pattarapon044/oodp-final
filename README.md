Final Exam OODP 2022/2
==========

Before you start
----------
Please read the instruction carefully. The exam is composed of the contents of week 01 to week 10. You start this lab by cloning project and convert it to Maven project as you have done in the previous lab. 


Exam 1 One - Customize Exception
-------------
In the oodp.finalexam.myException package, **MonthlyPaymentProgram.java**  contains the beginnings of a program which should get input from users to calculate loan monthly payment. The program should then allow the user to enter credit card number, the amount of loan, and the number of months for monthly payment. 

You have to complete the program by following these steps:
1. Create 3 new classes - **CreditCardException**, **LoanAmountException**, and **PayMonthlyException**.  These should all be checked exceptions
2. Complete method **getCreditCardNo()** in MonthlyPaymentProgram.java, which should throw  CreditCardException when the input of credit card no. is not exact 5 characters, and show message **"Please enter 5 characters of credit card number"**
3. Complete method **getLoanAmount()** in MonthlyPaymentProgram.java, which
 
    - should throw **LoanAmountException** when the input loan is not between 50,000 and 1,000,000, and show message **"Please enter loan amount between 50,000 - 1,000,000"**
    - should throw **NumberFormatException** when the input string is not in the number format.

4. Complete method **getNoOfMonth()** in MonthlyPaymentProgram.java, which 

    - should throw **PayMonthlyException** when the input of the number of months  is not between 2 and 48, and show message **"The number of month for paying monthly must be between 2 to 48 months"**
    - should throw **NumberFormatException** when the input string is not in the number format.and show message **"Must be number format"**


Below is expected output when running  **MonthlyPaymentProgram** 

```
Enter 5 characters of credit card no: 12345
Enter loan amount (50,000-1,000,0000): 50000
Enter number of months (2- 48):10
You pay 5000.0/month

```
when the program throws CreditCardException

```
Enter 5 characters of credit card no: 123
oopd.finalexam.myException.CreditCardException: Please enter 5 characters of credit card number
	at oopd.finalexam.myException.MonthlyPaymentProgram.getCreditCardNo(MonthlyPaymentProgram.java:29)
	at oopd.finalexam.myException.MonthlyPaymentProgram.start(MonthlyPaymentProgram.java:11)
	at oopd.finalexam.myException.MonthlyPaymentProgram.main(MonthlyPaymentProgram.java:72) 
```
when the program throws LoanAmountException

```
Enter 5 characters of credit card no: 12345
Enter loan amount (50,000-1,000,0000): 500
oopd.finalexam.myException.LoanAmountException: Please enter loan amount between 50,000 - 1,000,000
	at oopd.finalexam.myException.MonthlyPaymentProgram.getLoanAmount(MonthlyPaymentProgram.java:42)
	at oopd.finalexam.myException.MonthlyPaymentProgram.start(MonthlyPaymentProgram.java:12)
	at oopd.finalexam.myException.MonthlyPaymentProgram.main(MonthlyPaymentProgram.java:72)
```

when the program throws PayMonthlyException

```
Enter 5 characters of credit card no: 12345
Enter loan amount (50,000-1,000,0000): 50000
Enter number of months (2- 48):50
oopd.finalexam.myException.PayMonthlyException: The number of month for paying monthly must be between 2 to 48 months
	at oopd.finalexam.myException.MonthlyPaymentProgram.getNoOfMonth(MonthlyPaymentProgram.java:60)
	at oopd.finalexam.myException.MonthlyPaymentProgram.start(MonthlyPaymentProgram.java:13)
	at oopd.finalexam.myException.MonthlyPaymentProgram.main(MonthlyPaymentProgram.java:72)
```

**Note:** This exam 1  will be marked with **TestException.java**, please try to run and confirm the results with this test script.

Exam 2 Two - Student Read
-------------
In the oodp.finalexam.student package you’ll see the **Student.java** and   **StudentRader.java**. In this exam, we’ll create a programs: *StudentReader* that will read the file and create Student objects. You have to complete(TODO:) the ​ Student class and StudentReader class

**Student** class should include
- 4 instance variables: name, id, year, GPA
- A **Constructor** so that the StudentReader can create an object. 
- Accessors for getting the value of the 4 instance variables
- **toString()** method that return string of student's info. For example, _Student ID:[001], name: [Anna], year:[1], GPA:[3.0]_

**StudentReader** class should include (9 points)
- 2 instance variable: _fileName_ and _students_ including getter/setter method _setFileName()_ and _getStudents()_
- **start()** perform 3 tasks: (1) to load data from file "students.txt", (2) print the students'data from the file, and (3) search student by student ID.  
- **loadStudents()** method should use Scanner  to read the contents of the given file and store each student data in students ArrayList.
- **printStudentsArray() ** method is used to display all the student list which stores in students ArrayList.
- **getHighestGPA() ** method is for finding the student who has the highest GPA.
- **printResults() ** method is used to display the student information who has the highest GPA.
- **searchByID() ** method is used to search student by giving student ID. 
  
**Note: If you add more students in the file students.txt, your program still work properly.

Below is expected output when running StudentReader.

```
Students loaded successfully from students.txt!
Student List
================
Student ID:001, name:Anna, year:1 ,GPA:3.0
Student ID:002, name:Bee, year:2 ,GPA:3.02
Student ID:003, name:Cat, year:3 ,GPA:3.03

The highest GPA student is: Student ID:003, name:Cat, year:3 ,GPA:3.03

Enter student ID: 002
002 is Bee

```

**Note:** This exam 2 will be marked with TestStudent.java, please try to run and confirm the results with this test script.

Submit this exam
------------------
You can submit this exam by simply pushing the code to the Github. 
