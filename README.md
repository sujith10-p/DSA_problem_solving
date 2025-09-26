# DSA Problem Solving

This repository is a personal collection of Data Structures & Algorithms (DSA) problems, solutions, and approaches. Each problem has its own folder containing the problem statement, a written approach, and one or more solution implementations (with tests where appropriate).

Purpose
- Keep a searchable, well-documented record of problem-solving work.
- Practice algorithmic thinking and coding across languages.
- Share patterns, approaches, and readable solutions.

Repository structure

- `problems/` — each problem is a subfolder named after the problem (kebab-case or snake_case).
  - `<problem>/question.md` — problem statement and constraints.
  - `<problem>/approach.md` — brief explanation, time/space complexity, and alternate ideas.
  - `<problem>/solution.<ext>` — solution code (Java by default may have Python as well). Add tests or input runner where useful.
- `.gitignore` — files to ignore

# DSA Problem Solving

This repository is a personal collection of Data Structures & Algorithms (DSA) problems and solutions. The focus of this repo is Java solutions (Java 7/8 compatible). Python solutions may occasionally be added for comparison or quick prototyping, but expect Java-first implementations.

## Purpose

- Maintain a clear, searchable record of solved problems and approaches.
- Prefer readable, well-documented Java solutions that can be compiled and run easily.
- Track complexity, edge-cases, and short tests alongside each solution.

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

## Contributing guidelines

- Keep implementations clear and idiomatic for Java 7/8 where practical.
- Add `question.md` and `approach.md` for every problem you add.
- Include a small `main` demo or lightweight test for each solution.
- If adding a Python companion solution, name it `solution.py` and include a brief note linking to the Java implementation.

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

---

If you'd like, I can also:

- Add a small GitHub Actions workflow that compiles Java files and runs any smoke-tests on push.
- Add a simple problem-creation script/template to scaffold new problems.

Tell me which you'd like next.
