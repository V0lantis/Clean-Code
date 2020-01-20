# Clean-Code

This repository has been created in order to practice in writing clean code. It will reference all the chapter and notions that are presented in the [_Clean Code_ book](https://en.wikipedia.org/wiki/Robert_C._Martin) of **Robert C. Martin**

Each chapter will have one directory; in each directory, there will be one little abstract of the notion presented in _Clean Code_, and then multiple files of "dirty codes" from any languages possible.
The dirty code will be localised on the branch `master`, and the correction will be on `answers`. I thus suggest to always create a new branch (like trainnig branch) from `master`
and then to begin to try refactoring the dirty code, and comparing with the `answer` branch (on CLI, it is `git diff master:path/file.c answer:path/file.c) and on VS Code,
you install the gitlens extension, which allow you to compare two branches together.

## File format & main architecture of language

It is not important that every files follow the exact architecture associated with the language, e.g. every file .c doesn't have to begin with an `#include` and a `int maint()`function. Concepts are more important. Clean clode is independent of the language.
