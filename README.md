# DSA Problem Solving

This repository is a personal collection of Data Structures & Algorithms (DSA) problems and solutions. The focus of this repo is Java solutions (Java 7/8 compatible). Python solutions may occasionally be added for comparison or quick prototyping, but expect Java-first implementations.

## Purpose

- Maintain a clear, searchable record of solved problems and approaches.
- Prefer readable, well-documented Java solutions that can be compiled and run easily.
- Track complexity, edge-cases, and small smoke-tests alongside each solution.

## Repository structure

- `problems/` — each problem is a subfolder named after the problem (kebab-case or snake_case).
  - `<problem>/question.md` — problem statement and constraints.
  - `<problem>/approach.md` — explanation, complexity, and alternate ideas.
  - `<problem>/Solution.java` — Java solution (preferred). You may also see `solution.py` or other languages.
- `.gitignore` — files to ignore
- `LICENSE` — project license (MIT)

## Problem template

When adding a new problem folder, include these files (example folder name: `two-sum`):

- `question.md` — the full problem text and sample cases.
- `approach.md` — high-level approach and complexity analysis.
- `Solution.java` — Java class with a `main` method demonstrating usage.

Naming notes:
- Java solution files should be named `Solution.java` or `<ProblemName>.java` and contain a single public class matching the filename for easy compilation.

## How to run (Windows PowerShell)

Java (recommended):

1. Make sure JDK (javac) is installed and on PATH.
2. From the problem folder, compile and run:

```powershell
cd 'C:\path\to\repo\problems\two-sum'
javac Solution.java    # or javac TwoSum.java
java Solution          # or java TwoSum
```

Python (optional):

```powershell
python .\problems\two-sum\solution.py
```

## This is a personal collection

This repository is maintained for my personal use only. It is not open for external contributions or pull requests. I'm keeping the structure and coding style consistent for my own reference.

If you'd like to use these solutions as a reference, feel free to fork the repository or copy code for personal study. Please do not open issues or pull requests against this repo — it's a private collection of solved problems.

## Example (two-sum)

Structure:

- `problems/two-sum/question.md`
- `problems/two-sum/approach.md`
- `problems/two-sum/Solution.java` or `TwoSum.java`
- `problems/two-sum/solution.py` (optional)

Run the Java solution:

```powershell
cd 'C:\Users\parsa\Desktop\Repository\DSA_problem_solving\problems\two-sum'
javac TwoSum.java
java TwoSum
```

## License

This repository is available under the MIT License (see `LICENSE`).
