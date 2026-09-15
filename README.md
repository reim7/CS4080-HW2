# CS4080-HW2
CS 4080 - Homework 2

This repository contains the programming portions of Homework 2 for CS 4080.

## Files

### Scanner.java
Modified Lox scanner that adds support for C-style `/* ... */` block comments.  
The scanner handles multiline comments, keeps track of line numbers, and supports nested block comments using a depth counter.

### block_comments.lox
Test file used to demonstrate regular, multiline, and nested block comments in Lox.

### RpnPrinter.java
Implements a visitor for the Lox expression syntax tree that converts expressions into Reverse Polish Notation (RPN).

For example:

`(1 + 2) * (4 - 3)`

is converted to:

`1 2 + 4 3 - *`

## Written Responses

The written responses for Chapters 4 and 5 are included in the submitted Homework 2 PDF.
