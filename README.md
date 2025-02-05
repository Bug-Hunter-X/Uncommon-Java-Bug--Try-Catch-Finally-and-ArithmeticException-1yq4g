# Uncommon Java Bug: Try-Catch-Finally and ArithmeticException

This repository demonstrates an uncommon bug in Java related to the interaction between the try-catch-finally block and the ArithmeticException. The code divides an integer by zero within a try block. The catch block handles the exception gracefully. The program continues execution after handling the exception, showcasing the finally block's execution.

## Bug Description
The main challenge lies in understanding that even after an ArithmeticException is caught and handled, the finally block of code will always execute. This is critical for tasks that should always finish before exiting a try-catch block, such as closing resources.