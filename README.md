#Common Programming Exam Errors

1. You are not allowed to collaborate with another person before, during or after the exam. The work you submit must be your own. If we detect an answer that was clearly shared amongst two or more applicants, we will stop grading the test and all applicants involved will fail the test!! Don’t collaborate!!

2. Do not hard-code the length of an array. Just because the examples require an array of length 3, say, does not mean that your program should be able to only handle arrays of length 3. Your program should be able to handle an array of any size! So if we see something like
int[ ] a = new int[3];
we will stop grading and give you zero points for the answer.

3. Do not use any I/O in your functions! You should not read in anything from the keyboard or write out anything to the console. A function should get its input from its parameters and return its answer using a return statement. Specifically, your function must be able to be used as is in a GUI-based windows application or in a browser-based web application. So if we see any of the following statements in your function, we will stop grading and you will receive no credit for your answer.

