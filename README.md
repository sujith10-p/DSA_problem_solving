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
  - `<problem>/solution.<ext>` — solution code (Python by default). Add tests or input runner where useful.
- `.gitignore` — files to ignore

Problem template

When adding a new problem folder, include these files:

- `question.md` — the full problem text and sample cases.
- `approach.md` — high-level approach, diagrams, complexity analysis.
- `solution.py` — runnable solution with a small `if __name__ == '__main__'` demonstration or tests.

How to run

This repo uses plain files and small scripts. For Python problems:

1. Ensure Python 3.8+ is installed.
2. Run a solution file directly:

```powershell
python .\problems\two-sum\solution.py
```

Contributing

Keep things simple and consistent. Name problem folders clearly, add references/links to the source (LeetCode, Codeforces, etc.), and document your approach.

License

This repository is available under the MIT License (see `LICENSE`).
