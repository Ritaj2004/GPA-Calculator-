# GPA Calculator

## Description
A Java-based GPA (Grade Point Average) calculator that helps students calculate their semester GPA based on their course grades and credit hours. The program follows a standard grading scale and provides detailed grade-to-GPA conversion.

## Features
- Calculates GPA for 5-7 subjects
- Supports percentage grades conversion to letter grades and GPA points
- Calculates weighted GPA based on credit hours
- Provides detailed grade breakdown with letter grades
- Shows total credit hours and final GPA

## Grade Scale
| Percentage | Letter Grade | GPA Points |
|------------|--------------|------------|
| 97-100     | A+          | 4.0        |
| 93-96      | A           | 4.0        |
| 89-92      | A-          | 3.7        |
| 84-88      | B+          | 3.3        |
| 80-83      | B           | 3.0        |
| 76-79      | B-          | 2.7        |
| 73-75      | C+          | 2.3        |
| 70-72      | C           | 2.0        |
| 67-69      | C-          | 1.7        |
| 64-66      | D+          | 1.3        |
| 60-63      | D           | 1.0        |
| < 60       | F           | 0.0        |

## Requirements
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ, etc.) or command line compiler

## How to Use
1. Compile the program:
   ```bash
   javac GPACalc.java
   ```

2. Run the program:
   ```bash
   java GPACalc
   ```

3. Follow the prompts:
   - Enter the number of subjects (5-7)
   - For each subject:
     - Enter the percentage grade
     - Enter the credit hours
   - View your calculated GPA

## Example Usage
```
Enter number of subjects: 5
Enter Your Grade of subject 1 in %: 95
Enter Hours of The subject: 3
(A)---->    GPA 4.0
Enter Your Grade of subject 2 in %: 87
Enter Hours of The subject: 3
(B+)---->   GPA 3.3
...
Total Credit Hours: 15
Total GPA: 3.65
```

## Limitations
- Only accepts between 5-7 subjects
- Grades must be entered as percentages
- No data persistence between runs
- No graphical user interface

## Future Improvements
- Add support for more subjects
- Implement a graphical user interface
- Add semester GPA tracking
- Support for different grading scales
- Add grade point calculation for individual assignments
- Export results to file

## Contributing
Feel free to fork this project and submit pull requests with improvements. Some areas that could use enhancement:
- Input validation
- Error handling
- User interface improvements
- Code optimization
- Additional features
  
## Author
Ritaj Mahmoud Hosny
